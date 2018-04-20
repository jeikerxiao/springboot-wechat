package com.jeiker.wechat.model.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class LocationMessageXml extends BaseMessageXml{

    /**
     * 地理位置消息
     */
    @JacksonXmlProperty(localName = "Location_X")
    private String locationX;

    @JacksonXmlProperty(localName = "Location_Y")
    private String locationY;

    @JacksonXmlProperty(localName = "Scale")
    private String scale;

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "Label")
    private String label;
}
