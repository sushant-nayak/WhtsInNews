package com.example.snayak.navigationdemo.rest;

import com.example.snayak.navigationdemo.ItemListActivity;
import com.example.snayak.navigationdemo.model.Entry;
import com.example.snayak.navigationdemo.model.NewsItem;
import com.example.snayak.navigationdemo.model.ResponseData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class NewsContentBuilder {

    /**
     * An array of sample (Entry) items.
     */
    private List<NewsItem> newsItems = new ArrayList<>();

    /**
     * A map of sample (NewsItem) items, by ID.
     */
    private Map<String, NewsItem>  newsItemMap = new HashMap<String, NewsItem>();

    public List<NewsItem> getNewsItems(String url, ItemListActivity.SimpleItemRecyclerViewAdapter simpleItemRecyclerViewAdapter) {
        RestHelper restHelper = new RestHelper(simpleItemRecyclerViewAdapter, this);
        restHelper.execute(url);

        return newsItems;
    }


    public void setNewsItemsFromResponseData(ResponseData responseData) {
        List<Entry> newsEntries = responseData.getFeed().getEntries();

        for (int i = 0; i < newsEntries.size(); i++) {
            NewsItem newsItem = new NewsItem(String.valueOf(i), newsEntries.get(i).getTitle(), newsEntries.get(i).getContentSnippet());
            newsItemMap.put(newsItem.id, newsItem);
            newsItems.add(newsItem);
        }
    }

    public Map<String, NewsItem> getNewsItemMap() {
        return newsItemMap;
    }

    public void setNewsItemMap(Map<String, NewsItem> newsItemMap) {
        this.newsItemMap = newsItemMap;
    }


    public List<NewsItem> getNewsItems() {
        return newsItems;
    }

    public void setNewsItems(List<NewsItem> newsItems) {
        this.newsItems = newsItems;
    }
}
