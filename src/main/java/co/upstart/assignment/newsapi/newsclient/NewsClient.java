package co.upstart.assignment.newsapi.newsclient;


import co.upstart.assignment.newsapi.domain.Result;

public interface NewsClient {

    Result getArticles(String query);

}
