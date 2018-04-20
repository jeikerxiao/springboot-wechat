package com.jeiker.wechat.controller;

import com.jeiker.wechat.model.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
        return messageXml;
    }

    @GetMapping(value = "/image", produces = {"application/xml;charset=UTF-8"})
    public ImageMessageXml getImage() {
        ImageMessageXml messageXml = new ImageMessageXml();
        messageXml.setToUserName("xiao");
        messageXml.setFromUserName("jeiker");
        messageXml.setCreateTime(12341234141L);
        messageXml.setMsgType("image");
        MediaIdElement mediaIdElement = new MediaIdElement();
        mediaIdElement.setMediaId("12341234");
        messageXml.setImage(mediaIdElement);
        return messageXml;
    }

    @GetMapping(value = "/voice", produces = {"application/xml;charset=UTF-8"})
    public VoiceMessageXml getVoice() {
        VoiceMessageXml messageXml = new VoiceMessageXml();
        messageXml.setToUserName("xiao");
        messageXml.setFromUserName("jeiker");
        messageXml.setCreateTime(12341234141L);
        messageXml.setMsgType("voice");
        MediaIdElement mediaIdElement = new MediaIdElement();
        mediaIdElement.setMediaId("12341234");
        messageXml.setVoice(mediaIdElement);
        return messageXml;
    }

    @GetMapping(value = "/video", produces = {"application/xml;charset=UTF-8"})
    public VideoMessageXml getVideo() {
        VideoMessageXml messageXml = new VideoMessageXml();
        messageXml.setToUserName("xiao");
        messageXml.setFromUserName("jeiker");
        messageXml.setCreateTime(12341234141L);
        messageXml.setMsgType("video");
        VideoElement videoElement = new VideoElement();
        videoElement.setDescription("descasdfasdf");
        videoElement.setMediaId("asdfasdfadsf12341");
        videoElement.setTitle("asdfasdfasdf");
        messageXml.setVideo(videoElement);
        return messageXml;
    }

    @GetMapping(value = "/music", produces = {"application/xml;charset=UTF-8"})
    public MusicMessageXml getLink() {
        MusicMessageXml messageXml = new MusicMessageXml();
        messageXml.setToUserName("xiao");
        messageXml.setFromUserName("jeiker");
        messageXml.setCreateTime(12341234141L);
        messageXml.setMsgType("text");
        MusicElement musicElement = new MusicElement();
        musicElement.setDescription("asdfkasdf");
        musicElement.setHqMusicUrl("asdfasdfasdf");
        musicElement.setMusicUrl("asdfkjalsdf");
        musicElement.setThumbMediaId("q23412341234reqaw");
        musicElement.setTitle("asdfkjasdlkf");
        messageXml.setMusic(musicElement);
        return messageXml;
    }

    @GetMapping(value = "/article", produces = {"application/xml;charset=UTF-8"})
    public ArticlesMessageXml getArticle() {
        ArticlesMessageXml messageXml = new ArticlesMessageXml();
        messageXml.setToUserName("xiao");
        messageXml.setFromUserName("jeiker");
        messageXml.setCreateTime(12341234141L);
        messageXml.setMsgType("text");
        MusicElement musicElement = new MusicElement();
        musicElement.setDescription("asdfkasdf");
        musicElement.setHqMusicUrl("asdfasdfasdf");
        musicElement.setMusicUrl("asdfkjalsdf");
        musicElement.setThumbMediaId("q23412341234reqaw");
        musicElement.setTitle("asdfkjasdlkf");
        List<ArticleElement> articleElementList = new ArrayList<>();
        ArticleElement articleElement1 = new ArticleElement();
        articleElement1.setDescription("asdfasdfa");
        articleElement1.setPicUrl("asdfasdf");
        articleElement1.setTitle("asdlfka;sd");
        articleElement1.setUrl("asaklsdfjl;asdf");
        articleElementList.add(articleElement1);

        ArticleElement articleElement2 = new ArticleElement();
        articleElement2.setDescription("asdfasdfa");
        articleElement2.setPicUrl("asdfasdf");
        articleElement2.setTitle("asdlfka;sd");
        articleElement2.setUrl("asaklsdfjl;asdf");
        articleElementList.add(articleElement2);

        messageXml.setArticleCount(articleElementList.size());
        messageXml.setArticles(articleElementList);
        return messageXml;
    }
}
