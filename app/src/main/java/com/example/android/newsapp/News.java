package com.example.android.newsapp;

/**
 * Created by Maino96-10022 on 12/5/2016.
 */

public class News
{
    private String mArticle;
    private String mDate;
    private String mSection;
    private String mUrl;

    public News(String Article,String Date, String Section, String url)
    {
        mArticle = Article;
        mDate = Date;
        mSection = Section;
        mUrl = url;
    }

    public String getArticle()
    {
        return mArticle;
    }

    public String getDate()
    {
        return mDate;
    }

    public String getSection()
    {
        return mSection;
    }

    public String getUrl() {
        return mUrl;
    }
}
