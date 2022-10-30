package co.upstart.assignment.newsapi.domain.dto.response;

import lombok.Builder;
import lombok.Setter;

@Setter
@Builder
public class ErrorResponse {

    private int code;
    private String message;

}
