package co.upstart.assignment.newsapi.service.impl;

import co.upstart.assignment.newsapi.domain.dto.response.Response;
import co.upstart.assignment.newsapi.domain.dto.response.mapper.ResponseMapper;
import co.upstart.assignment.newsapi.newsclient.NewsClient;
import co.upstart.assignment.newsapi.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {

    private final NewsClient newsClient;
    private final ResponseMapper responseMapper;

    @Override
    public Response getNews(String query) {
        return responseMapper.toResponse(newsClient.getArticles(query));
    }
}
