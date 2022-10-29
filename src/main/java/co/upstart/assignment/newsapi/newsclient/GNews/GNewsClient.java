package co.upstart.assignment.newsapi.newsclient.GNews;

import co.upstart.assignment.newsapi.config.RestClient;
import co.upstart.assignment.newsapi.domain.Result;
import co.upstart.assignment.newsapi.domain.dto.response.Response;
import co.upstart.assignment.newsapi.newsclient.NewsClient;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GNewsClient implements NewsClient {

    private final RestClient<GNewsResponse> restClient;

    // TODO move it to environment
    private static final String URL = "https://gnews.io/api/v4/search?q=dolar&token=0a7e7fc424e0ad437902a2a0bd771365";

    @Override
    public Result getArticles(String query) {


        GNewsResponse response = restClient.createGetRequest(URL, new ParameterizedTypeReference<GNewsResponse>() {});


        return null;
    }
}