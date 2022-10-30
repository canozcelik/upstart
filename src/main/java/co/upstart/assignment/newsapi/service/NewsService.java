package co.upstart.assignment.newsapi.service;

import co.upstart.assignment.newsapi.domain.dto.response.Response;

public interface NewsService {

    Response getNews(String query, int size);

}
