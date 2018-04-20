package com.jeiker.wechat.model.base;

import lombok.Data;

@Data
public class BaseMessage {

    protected String ToUserName;
    protected String FromUserName;
    protected long CreateTime;
    protected String MsgType;

}
