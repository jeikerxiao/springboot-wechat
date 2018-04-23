package com.jeiker.wechat.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/menu")
@Slf4j
public class MenuController {

    @Value("${wechat.access-token}")
    private String accessToken;

    @GetMapping("/get")
    public JSONObject getMenu() {
        String url = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token={access_token}";
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> params = new HashMap<>();
        params.put("access_token", accessToken);
        // get token数据
        JSONObject jsonObject = restTemplate.getForEntity(url, JSONObject.class, params).getBody();
        log.info("【微信access_token】- {}", jsonObject.toJSONString());
        return jsonObject;
    }
}
