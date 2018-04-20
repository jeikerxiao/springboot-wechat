package com.jeiker.wechat.model.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class VideoMessageXml extends BaseMessageXml{

    /**
     * 视频消息/小视频消息
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "MediaId")
    private String mediaId;

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "ThumbMediaId")
    private String thumbMediaId;
}
