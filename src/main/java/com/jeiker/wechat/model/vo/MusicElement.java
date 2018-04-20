package com.jeiker.wechat.model.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

/**
 * Created by Administrator on 2018/4/20 0020.
 */
@Data
public class MusicElement {

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "Title")
    private String title;

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "Description")
    private String description;

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "MusicUrl")
    private String musicUrl;

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "HQMusicUrl")
    private String hqMusicUrl;

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "ThumbMediaId")
    private String thumbMediaId;
}
