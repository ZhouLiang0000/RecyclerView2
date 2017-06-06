package com.ai.kara.domain;

/**
 * Created by zhouliang on 2017/6/6.
 */

public class Data {
    private String url;
    private String content;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Data{" +
                "url='" + url + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
