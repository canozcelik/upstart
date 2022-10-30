package co.upstart.assignment.newsapi.newsclient.GNews;

import co.upstart.assignment.newsapi.config.RestClient;
import co.upstart.assignment.newsapi.domain.News;
import co.upstart.assignment.newsapi.newsclient.GNews.mapper.GNewsResponseMapper;
import co.upstart.assignment.newsapi.newsclient.NewsClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GNewsClient implements NewsClient {

    private final RestClient<GNewsResponse> restClient;
    private final GNewsResponseMapper mapper;

    @Value("${news.client.url}")
    private String URL;

    @Value("${news.client.token}")
    private String token;

    @Override
    public News getArticles(String query, int size) {

        String url = new StringBuilder(URL)
                .append("?lang=en")
                .append("&q=")
                .append(query)
                .append("&token=")
                .append(token)
                .toString();

        GNewsResponse response = restClient.createGetRequest(url, new ParameterizedTypeReference<GNewsResponse>() {});
        return mapper.toResponse(response);
    }
}
