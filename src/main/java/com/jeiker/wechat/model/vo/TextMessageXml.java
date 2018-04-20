package com.jeiker.wechat.model.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "xml")
public class TextMessageXml extends BaseMessageXml{

    /**
     * 文本消息
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "Content")
    private String content;

}
