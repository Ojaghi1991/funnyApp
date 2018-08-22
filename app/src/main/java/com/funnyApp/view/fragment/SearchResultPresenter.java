package com.funnyApp.view.fragment;

import com.funnyApp.data.model.Article;

import java.util.ArrayList;

/**
 * Created by hussein on 6/7/17.
 */

public class SearchResultPresenter {

    View mView;
    ArrayList<Article> articles;
    public SearchResultPresenter(View view) {
        this.mView = view;
        articles =new ArrayList<>();
    }
    public void getKnowledgeModels()
    {
        articles = preparData();
        mView.updateKnowledgeRecycler(articles);
    }
    //dummy data
    private ArrayList<Article> preparData() {
        Article model=new Article();
        model.setId("1231231232");
        model.setTitle("sdfsdafsad");
        model.setDescription("sdfsdafqeqwe qwqweqwewsad");
        model.setCategoryName("sadsss");
        model.setCategoryId("123123123");

        articles.add(model);
        model.setId("1231212231232");
        model.setTitle("sdfsdasdasdafsad");
        model.setDescription("sdf232sdafqeqwe qwqweqwewsad");
        model.setCategoryName("sadsdasdsss");
        model.setCategoryId("1231212323123");
        articles.add(model);

        return articles;
    }
    public interface  View
    {
        void updateKnowledgeRecycler(ArrayList<Article> articles);

        void addFavorite(Article articleModels);
        void deleteFavorite(Article articleModels);
    }
}
