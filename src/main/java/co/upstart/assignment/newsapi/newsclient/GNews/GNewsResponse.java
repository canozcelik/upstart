package co.upstart.assignment.newsapi.newsclient.GNews;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GNewsResponse {

    private int totalArticles;
    private List<GNewsArticle> articles;

}
