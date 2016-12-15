//-----------------------------------com.sushantnayak.Entry.java-----------------------------------

package com.example.snayak.navigationdemo.model;

import java.util.List;

public class Entry {

    private String title;
    private String link;
    private String author;
    private String publishedDate;
    private String contentSnippet;
    private String content;
    private List<String> categories = null;

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
     * @return The publishedDate
     */
    public String getPublishedDate() {
        return publishedDate;
    }

    /**
     * @param publishedDate The publishedDate
     */
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    /**
     * @return The contentSnippet
     */
    public String getContentSnippet() {
        return contentSnippet;
    }

    /**
     * @param contentSnippet The contentSnippet
     */
    public void setContentSnippet(String contentSnippet) {
        this.contentSnippet = contentSnippet;
    }

    /**
     * @return The content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content The content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return The categories
     */
    public List<String> getCategories() {
        return categories;
    }

    /**
     * @param categories The categories
     */
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

}