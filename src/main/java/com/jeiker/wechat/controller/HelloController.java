package com.jeiker.wechat.controller;

import com.jeiker.wechat.model.vo.TextMessageXml;
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

    @GetMapping("/xml")
    public TextMessageXml getText() {
        TextMessageXml messageXml = new TextMessageXml();
        messageXml.setToUserName("xiao");
        messageXml.setFromUserName("jeiker");
        messageXml.setCreateTime(12341234141L);
        messageXml.setContent("你好啊");
        messageXml.setMsgId("123412341341");
        return messageXml;
    }
}
