package com.jeiker.wechat.controller;

import com.jeiker.wechat.model.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/")
    public Map<String, String> hello() {
        return Collections.singletonMap("message", "Hello World!");
    }

    @GetMapping(value = "/text", produces = {"application/xml;charset=UTF-8"})
    public TextMessageXml getText() {
        TextMessageXml messageXml = new TextMessageXml();
        messageXml.setToUserName("xiao");
        messageXml.setFromUserName("jeiker");
        messageXml.setCreateTime(12341234141L);
        messageXml.setMsgType("text");
        messageXml.setContent("你好啊");
        messageXml.setMsgId("123412341341");
        return messageXml;
    }

    @GetMapping(value = "/image", produces = {"application/xml;charset=UTF-8"})
    public ImageMessageXml getImage() {
        ImageMessageXml messageXml = new ImageMessageXml();
        messageXml.setToUserName("xiao");
        messageXml.setFromUserName("jeiker");
        messageXml.setCreateTime(12341234141L);
        messageXml.setMsgType("image");
        messageXml.setPicUrl("http://www.baidu.com");
        messageXml.setMediaId("12341234141241234124");
        messageXml.setMsgId("123412341341");
        return messageXml;
    }

    @GetMapping(value = "/voice", produces = {"application/xml;charset=UTF-8"})
    public VoiceMessageXml getVoice() {
        VoiceMessageXml messageXml = new VoiceMessageXml();
        messageXml.setToUserName("xiao");
        messageXml.setFromUserName("jeiker");
        messageXml.setCreateTime(12341234141L);
        messageXml.setMsgType("voice");
        messageXml.setFormat("format");
        messageXml.setMediaId("12341234141241234124");
        messageXml.setMsgId("123412341341");
        return messageXml;
    }

    @GetMapping(value = "/video", produces = {"application/xml;charset=UTF-8"})
    public VideoMessageXml getVideo() {
        VideoMessageXml messageXml = new VideoMessageXml();
        messageXml.setToUserName("xiao");
        messageXml.setFromUserName("jeiker");
        messageXml.setCreateTime(12341234141L);
        messageXml.setMsgType("video");
        messageXml.setMediaId("aasdfasdf");
        messageXml.setThumbMediaId("asdfasfasffasd134123");
        messageXml.setMsgId("123412341341");
        return messageXml;
    }

    @GetMapping(value = "/location", produces = {"application/xml;charset=UTF-8"})
    public LocationMessageXml getLocation() {
        LocationMessageXml messageXml = new LocationMessageXml();
        messageXml.setToUserName("xiao");
        messageXml.setFromUserName("jeiker");
        messageXml.setCreateTime(12341234141L);
        messageXml.setMsgType("location");
        messageXml.setLocationX("23.3241241223");
        messageXml.setLocationY("23.2413124312");
        messageXml.setScale("2");
        messageXml.setLabel("长沙");
        messageXml.setMsgId("123412341341");
        return messageXml;
    }

    @GetMapping(value = "/link", produces = {"application/xml;charset=UTF-8"})
    public LinkMessageXml getLink() {
        LinkMessageXml messageXml = new LinkMessageXml();
        messageXml.setToUserName("xiao");
        messageXml.setFromUserName("jeiker");
        messageXml.setCreateTime(12341234141L);
        messageXml.setMsgType("text");
        messageXml.setTitle("百度");
        messageXml.setDescription("百度首页");
        messageXml.setUrl("http://www.baidu.com");
        messageXml.setMsgId("123412341341");
        return messageXml;
    }
}
