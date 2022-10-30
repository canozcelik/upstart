package co.upstart.assignment.newsapi.exception;

import lombok.Data;

@Data
public class ExternalApiException extends RuntimeException {

    private int errorCode;
    public ExternalApiException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }


}
