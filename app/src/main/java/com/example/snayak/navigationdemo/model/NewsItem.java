package com.example.snayak.navigationdemo.model;

/**
 * A news item representing a piece of content.
 *
 * Created by snayak on 12/14/2016.
 */

public class NewsItem {
    public final String id;
    public final String content;
    public final String details;

    public NewsItem(String id, String content, String details) {
        this.id = id;
        this.content = content;
        this.details = details;
    }

    @Override
    public String toString() {
        return content;
    }

}
