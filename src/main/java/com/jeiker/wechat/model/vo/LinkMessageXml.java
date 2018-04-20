package com.jeiker.wechat.model.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "xml")
public class LinkMessageXml extends BaseMessageXml{

    /**
     * 链接消息
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "Title")
    private String title;

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "Description")
    private String description;

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "Url")
    private String url;
}
