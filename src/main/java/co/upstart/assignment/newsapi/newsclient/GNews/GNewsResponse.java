package co.upstart.assignment.newsapi.newsclient.GNews;

import lombok.Getter;

import java.util.List;

@Getter
public class GNewsResponse {

    private int totalArticles;
    private List<GNewsArticle> articles;

}
