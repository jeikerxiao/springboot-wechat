package com.jeiker.wechat.model.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * Created by Administrator on 2018/4/20 0020.
 */
@Data
@JacksonXmlRootElement(localName = "xml")
public class MusicMessageXml extends BaseMessageXml{

    /**
     * 音乐消息
     */
    @JacksonXmlProperty(localName = "Music")
    private MusicElement music;
}
