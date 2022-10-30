package co.upstart.assignment.newsapi.service.impl;

import co.upstart.assignment.newsapi.domain.dto.response.Response;
import co.upstart.assignment.newsapi.domain.dto.response.mapper.ResponseMapper;
import co.upstart.assignment.newsapi.newsclient.NewsClient;
import co.upstart.assignment.newsapi.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {

    private static Pattern regex = Pattern.compile("[^A-Za-z0-9]");

    private final NewsClient newsClient;
    private final ResponseMapper responseMapper;

    @Override
    public Response getNews(String query, int size) {
        return responseMapper.toResponse(newsClient.getArticles(validateQuery(query), size));
    }

    private String validateQuery(String query) {

        if(regex.matcher(query).find() && !query.startsWith("\"") && query.charAt(query.length()-1) != '"') {
            return new StringBuilder("\"")
                    .append(query)
                    .append("\"").toString();
        }

        return query;
    }
}
