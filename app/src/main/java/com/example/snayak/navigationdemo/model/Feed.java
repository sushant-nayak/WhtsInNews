//-----------------------------------com.sushantnayak.Feed.java-----------------------------------

package com.example.snayak.navigationdemo.model;

import java.util.List;

public class Feed {

    private String feedUrl;
    private String title;
    private String link;
    private String author;
    private String description;
    private String type;
    private List<Entry> entries = null;

    /**
     * @return The feedUrl
     */
    public String getFeedUrl() {
        return feedUrl;
    }

    /**
     * @param feedUrl The feedUrl
     */
    public void setFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return The author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author The author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The entries
     */
    public List<Entry> getEntries() {
        return entries;
    }

    /**
     * @param entries The entries
     */
    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

}