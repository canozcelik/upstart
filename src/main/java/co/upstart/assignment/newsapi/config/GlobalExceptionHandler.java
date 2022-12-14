package co.upstart.assignment.newsapi.config;

import co.upstart.assignment.newsapi.domain.dto.response.ErrorResponse;
import co.upstart.assignment.newsapi.exception.ExternalApiException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(ExternalApiException.class)
    public ResponseEntity<ErrorResponse> handleExternalApiException(ExternalApiException ex) {
        log.error(ex.getMessage(), ex);
        return ResponseEntity.status(ex.getErrorCode())
                .body(ErrorResponse.builder().code(ex.getErrorCode()).message(ex.getMessage()).build());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleAllExceptions(Exception ex) {
        log.error(ex.getMessage(), ex);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorResponse.builder().code(HttpStatus.BAD_REQUEST.value()).message(ex.getMessage()).build());
    }

}
