package co.upstart.assignment.newsapi.newsclient;


import co.upstart.assignment.newsapi.domain.News;

public interface NewsClient {

    News getArticles(String query, int size);

}
