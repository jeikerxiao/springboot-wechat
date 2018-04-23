package com.jeiker.wechat.controller;

import com.jeiker.wechat.model.vo.*;
import com.jeiker.wechat.util.digest.EncryptUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/wechat")
@Slf4j
public class WeChatController {

    // URL:   http://www.xxxx.com/wechat
    // Token: 此处TOKEN即为微信接口配置信息的Token

    private static final String TOKEN = "wechat";

    /**
     * 验证微信后台配置的服务器地址有效性
     * <p>
     * 接收并校验四个请求参数
     *
     * @param signature 微信加密签名
     * @param timestamp 时间戳
     * @param nonce     随机数
     * @param echostr   随机字符串
     * @return echostr
     */
    @GetMapping("")
    public String checkName(@RequestParam(name = "signature") String signature,
                            @RequestParam(name = "timestamp") String timestamp,
                            @RequestParam(name = "nonce") String nonce,
                            @RequestParam(name = "echostr") String echostr) {

        log.info("微信-开始校验签名");
        log.info("收到来自微信的 echostr 字符串:{}", echostr);

        /**
         * 加密/校验流程如下:
         * 1. 将token、timestamp、nonce三个参数进行字典序排序
         * 2. 将三个参数字符串拼接成一个字符串进行sha1加密
         * 3. 开发者获得加密后的字符串可与signature对比，标识该请求来源于微信
         */
        // 1.排序
        String sortString = sort(TOKEN, timestamp, nonce);
        // 2.sha1加密
        String myString = EncryptUtil.sha1(sortString);
        // 3.字符串校验
        if (!"".equals(myString) && myString.equals(signature)) {
            log.info("微信-签名校验通过");
            //如果检验成功原样返回echostr，微信服务器接收到此输出，才会确认检验完成。
            log.info("回复给微信的 echostr 字符串:{}", echostr);
            return echostr;
        } else {
            log.error("微信-签名校验失败");
            return "";
        }
    }

    /**
     * 排序方法
     *
     * @param token     Token
     * @param timestamp 时间戳
     * @param nonce     随机数
     * @return
     */
    private String sort(String token, String timestamp, String nonce) {
        String[] strArray = {token, timestamp, nonce};
        Arrays.sort(strArray);
        StringBuilder sb = new StringBuilder();
        for (String str : strArray) {
            sb.append(str);
        }
        return sb.toString();
    }

    @PostMapping(value = "", produces = {"application/xml;charset=UTF-8"})
    public Object doPost(@RequestBody RequestMessageXml requestMessage) {
        String toUserName = requestMessage.getToUserName();
        String fromUserName = requestMessage.getFromUserName();
        String msgType = requestMessage.getMsgType();

        String mediaId = requestMessage.getMediaId();
        log.info("【接收到微信的消息】: \n{}", requestMessage);

        switch (msgType.trim()) {
            case "text":
                TextMessageXml textMessageXml = new TextMessageXml();
                BeanUtils.copyProperties(requestMessage, textMessageXml);
                textMessageXml.setToUserName(fromUserName);
                textMessageXml.setFromUserName(toUserName);
                return textMessageXml;
            case "image":
                ImageMessageXml imageMessageXml = new ImageMessageXml();
                BeanUtils.copyProperties(requestMessage, imageMessageXml);
                imageMessageXml.setToUserName(fromUserName);
                imageMessageXml.setFromUserName(toUserName);
                MediaIdElement imageMediaId = new MediaIdElement();
                imageMediaId.setMediaId(mediaId);
                imageMessageXml.setImage(imageMediaId);
                return imageMessageXml;
            case "voice":
                VoiceMessageXml voiceMessageXml = new VoiceMessageXml();
                BeanUtils.copyProperties(requestMessage, voiceMessageXml);
                voiceMessageXml.setToUserName(fromUserName);
                voiceMessageXml.setFromUserName(toUserName);
                MediaIdElement voiceMediaId = new MediaIdElement();
                voiceMediaId.setMediaId(mediaId);
                voiceMessageXml.setVoice(voiceMediaId);
                return voiceMessageXml;
            case "video":
                VideoMessageXml videoMessageXml = new VideoMessageXml();
                BeanUtils.copyProperties(requestMessage, videoMessageXml);
                videoMessageXml.setToUserName(fromUserName);
                videoMessageXml.setFromUserName(toUserName);
                VideoElement videoElement = new VideoElement();
                videoElement.setMediaId(mediaId);
                videoElement.setTitle(requestMessage.getTitle());
                videoElement.setDescription(requestMessage.getDescription());
                videoMessageXml.setVideo(videoElement);
                return videoMessageXml;
            case "location":
                LocationMessageXml locationMessageXml = new LocationMessageXml();
                BeanUtils.copyProperties(requestMessage, locationMessageXml);
                locationMessageXml.setToUserName(fromUserName);
                locationMessageXml.setFromUserName(toUserName);
                return locationMessageXml;
            case "link":
                LinkMessageXml linkMessageXml = new LinkMessageXml();
                BeanUtils.copyProperties(requestMessage, linkMessageXml);
                linkMessageXml.setToUserName(fromUserName);
                linkMessageXml.setFromUserName(toUserName);
                return linkMessageXml;
                default:
                    return requestMessage;
        }
    }
}
