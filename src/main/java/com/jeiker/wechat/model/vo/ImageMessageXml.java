package com.jeiker.wechat.model.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class ImageMessageXml extends BaseMessageXml{

    /**
     * 图片消息
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "PicUrl")
    private String picUrl;

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "MediaId")
    private String mediaId;
}
