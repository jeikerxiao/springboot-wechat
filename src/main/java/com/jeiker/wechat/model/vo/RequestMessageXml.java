package com.jeiker.wechat.model.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "xml")
public class RequestMessageXml extends BaseMessageXml{

    @JacksonXmlProperty(localName = "MsgId")
    private String msgId;

    /**
     * 文本消息
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "Content")
    private String content;

    /**
     * 图片消息
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "PicUrl")
    private String picUrl;

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "MediaId")
    private String mediaId;

    /**
     * 语音消息
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "Format")
    private String format;

    /**
     * 视频消息/小视频消息
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "ThumbMediaId")
    private String thumbMediaId;

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
