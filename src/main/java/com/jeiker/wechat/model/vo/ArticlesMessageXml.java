package com.jeiker.wechat.model.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

/**
 * Created by Administrator on 2018/4/20 0020.
 */
@Data
@JacksonXmlRootElement(localName = "xml")
public class ArticlesMessageXml extends BaseMessageXml {

    /**
     * 图文消息
     */
    @JacksonXmlProperty(localName = "ArticleCount")
    private int articleCount;

    @JacksonXmlProperty(localName = "Articles")
    private List<ArticleElement> articles;
}
