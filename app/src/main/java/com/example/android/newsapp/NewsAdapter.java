package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.DecimalFormat;

import static android.R.attr.format;

/**
 * Created by Maino96-10022 on 12/5/2016.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, ArrayList<News> articles) {
        super(context, 0, articles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //first get the list item view you can use
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }
        News currentNews = getItem(position);

        TextView articleView = (TextView) listItemView.findViewById(R.id.news_article);
        articleView.setText(currentNews.getArticle());

        TextView dateView = (TextView) listItemView.findViewById(R.id.news_date);
        String currentDateFormat = "2016-09-26T15:57:34Z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss");
        Date date = null;
        try {
            date = simpleDateFormat.parse(currentNews.getDate());
        } catch (ParseException e) {
            e.printStackTrace();
        }
       dateView.(currentNews.getDate();




        TextView sectionView = (TextView) listItemView.findViewById(R.id.news_section);
        sectionView.setText(currentNews.getSection());

        return listItemView;
    }

}


