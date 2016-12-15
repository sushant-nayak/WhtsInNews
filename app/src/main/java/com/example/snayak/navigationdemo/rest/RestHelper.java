package com.example.snayak.navigationdemo.rest;

import android.os.AsyncTask;
import android.widget.TextView;

import com.example.snayak.navigationdemo.ItemListActivity;
import com.example.snayak.navigationdemo.model.ResponseData;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by snayak on 12/14/2016.
 */

public class RestHelper extends AsyncTask<String, Void, ResponseData> {
    private final ItemListActivity.SimpleItemRecyclerViewAdapter simpleItemRecyclerViewAdapter;
    private final NewsContentBuilder newsContentBuilder;

    public RestHelper(ItemListActivity.SimpleItemRecyclerViewAdapter simpleItemRecyclerViewAdapter, NewsContentBuilder newsContentBuilder) {
        super();
        this.simpleItemRecyclerViewAdapter = simpleItemRecyclerViewAdapter;
        this.newsContentBuilder = newsContentBuilder;
    }

    @Override
    protected ResponseData doInBackground(String... url) {
        return getResponseData(url[0]);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(ResponseData responseData) {
        super.onPostExecute(responseData);
        newsContentBuilder.setNewsItemsFromResponseData(responseData);
        simpleItemRecyclerViewAdapter.setmValues(newsContentBuilder.getNewsItems());
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onCancelled(ResponseData responseData) {
        super.onCancelled(responseData);
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
    }

    final ResponseData getResponseData(String url) {
        ResponseData responseData = null;

        try {
            HttpClient httpClient = new DefaultHttpClient();
            HttpGet httpRequest = new HttpGet(url);
            HttpResponse response = httpClient.execute(httpRequest);
            // StatusLine stat = response.getStatusLine();
            int status = response.getStatusLine().getStatusCode();

            if (status == 200) {
                HttpEntity entity = response.getEntity();
                String data = EntityUtils.toString(entity);

                JsonParser parser = new JsonParser();
                JsonObject jsonRoot = parser.parse(data).getAsJsonObject();

                JsonObject responseDataJson = jsonRoot.getAsJsonObject("responseData");
                responseData = new Gson().fromJson(responseDataJson, ResponseData.class);

            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {

        }
        return responseData;
    }
}
