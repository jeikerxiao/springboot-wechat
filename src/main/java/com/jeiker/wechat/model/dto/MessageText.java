package com.jeiker.wechat.model.dto;

import com.jeiker.wechat.model.base.BaseMessage;
import lombok.Data;

@Data
public class MessageText extends BaseMessage{

    /**
     * 消息内容
     */
    private String Content;
    /**
     * 消息id, 64位整型
     */
    private String MsgId;

    public MessageText() {

    }

    public MessageText(String toUserName, String fromUserName,
                       long createTime, String msgType,
                       String content, String msgId) {
        super();
        ToUserName = toUserName;
        FromUserName = fromUserName;
        CreateTime = createTime;
        MsgType = msgType;
        Content = content;
        MsgId = msgId;
    }
}
