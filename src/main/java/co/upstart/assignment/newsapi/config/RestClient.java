package co.upstart.assignment.newsapi.config;

import co.upstart.assignment.newsapi.exception.ExternalApiException;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class RestClient<T> {

    private final RestTemplate restTemplate;

    public T createGetRequest(String url, ParameterizedTypeReference<T> type) {

        restTemplate.setErrorHandler(new RestTemplateResponseErrorHandler());
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<T> responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, type);
        HttpStatus httpStatus = responseEntity.getStatusCode();
        if (httpStatus != HttpStatus.OK) {
           throw new ExternalApiException("An error has been occured!", httpStatus.value());
        }

        return restTemplate.exchange(url, HttpMethod.GET, entity, type).getBody();
    }

}
