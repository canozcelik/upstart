package co.upstart.assignment.newsapi.config;

import co.upstart.assignment.newsapi.domain.dto.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class RestClient {


    // TODO generic type can be used here
    private final RestTemplate restTemplate;

    public Response createGetRequest(String url) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(url, HttpMethod.GET, entity, new ParameterizedTypeReference<Response>(){}).getBody();
    }

}
