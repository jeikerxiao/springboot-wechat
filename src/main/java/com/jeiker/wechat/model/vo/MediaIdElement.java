package com.jeiker.wechat.model.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

/**
 * Created by Administrator on 2018/4/20 0020.
 */
@Data
public class MediaIdElement {

    @JacksonXmlCData
    @JacksonXmlProperty(localName = "MediaId")
    private String mediaId;

}
