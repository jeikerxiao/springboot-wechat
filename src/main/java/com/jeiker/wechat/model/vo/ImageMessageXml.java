package com.jeiker.wechat.model.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "xml")
public class ImageMessageXml extends BaseMessageXml{

    /**
     * 图片消息
     */
    @JacksonXmlProperty(localName = "Image")
    private MediaIdElement image;
}
