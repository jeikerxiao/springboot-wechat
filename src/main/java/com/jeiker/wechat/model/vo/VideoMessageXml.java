package com.jeiker.wechat.model.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "xml")
public class VideoMessageXml extends BaseMessageXml{

    /**
     * 视频消息/小视频消息
     */
    @JacksonXmlProperty(localName = "Video")
    private VideoElement video;
}
