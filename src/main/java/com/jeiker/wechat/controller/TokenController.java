package com.jeiker.wechat.controller;

import com.jeiker.wechat.model.vo.json.AccessTokenVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class TokenController {

    @Value("${wechat.app-id}")
    private String appid;
    @Value("${wechat.app-secret}")
    private String secret;

    @GetMapping("/token")
    public AccessTokenVo getWeChatToken() {
        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type={grant_type}&appid={appid}&secret={secret}";
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> params = new HashMap<>();
        params.put("grant_type", "client_credential");
        params.put("appid", appid);
        params.put("secret", secret);
        // get token数据
        AccessTokenVo accessTokenVo = restTemplate.getForEntity(url, AccessTokenVo.class, params).getBody();
        log.info("【微信access_token】- {}", accessTokenVo.getAccessToken());
        return accessTokenVo;
    }

}
