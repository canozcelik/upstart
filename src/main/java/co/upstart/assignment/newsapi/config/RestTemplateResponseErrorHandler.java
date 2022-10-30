package co.upstart.assignment.newsapi.config;

import co.upstart.assignment.newsapi.exception.ExternalApiException;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;
import java.util.Map;

import static org.springframework.http.HttpStatus.Series.CLIENT_ERROR;
import static org.springframework.http.HttpStatus.Series.SERVER_ERROR;

@Component
public class RestTemplateResponseErrorHandler implements ResponseErrorHandler {


    private static final Map<HttpStatus, String> statusCodeMap = Map.of(HttpStatus.BAD_REQUEST, "Your request is invalid.",
            HttpStatus.UNAUTHORIZED, "An error has been occurred. Please try again later.",
            HttpStatus.FORBIDDEN, "An error has been occurred. Please try again later.",
            HttpStatus.TOO_MANY_REQUESTS, "You have made more requests per second than you are allowed",
            HttpStatus.INTERNAL_SERVER_ERROR, "An error has been occurred. Please try again later.",
            HttpStatus.SERVICE_UNAVAILABLE, "An error has been occurred. Please try again later.");

    @Override

    public boolean hasError(ClientHttpResponse response) throws IOException {
        return (response.getStatusCode().series() == CLIENT_ERROR || response.getStatusCode().series() == SERVER_ERROR);
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        throw new ExternalApiException(statusCodeMap.get(response.getStatusCode()), response.getStatusCode().value());
    }
}
