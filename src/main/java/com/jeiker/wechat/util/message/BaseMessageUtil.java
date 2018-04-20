package com.jeiker.wechat.util.message;

public interface BaseMessageUtil<T> {

    /**
     * 将回复的信息对象转xml格式给微信
     * @param t
     * @return
     */
    String messageToXml(T t);

    /**
     * 回复的信息封装
     * @param FromUserName
     * @param ToUserName
     * @return
     */
     String initMessage(String FromUserName,String ToUserName);
}
