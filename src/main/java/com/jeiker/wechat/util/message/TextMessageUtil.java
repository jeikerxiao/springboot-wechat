package com.jeiker.wechat.util.message;

import com.jeiker.wechat.model.dto.MessageText;
import com.thoughtworks.xstream.XStream;

import java.util.Date;

public class TextMessageUtil implements BaseMessageUtil{

    @Override
    public String messageToXml(Object message) {
        XStream xStream = new XStream();
        xStream.alias("xml", message.getClass());
        return xStream.toXML(message);
    }

    @Override
    public String initMessage(String FromUserName, String ToUserName) {
        MessageText text = new MessageText();
        text.setToUserName(FromUserName);
        text.setFromUserName(ToUserName);
        text.setContent("欢迎关注666");
        text.setCreateTime(new Date().getTime());
        text.setMsgType("text");
        return messageToXml(text);
    }
}


