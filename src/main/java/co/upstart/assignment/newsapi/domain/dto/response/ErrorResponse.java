package co.upstart.assignment.newsapi.domain.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ErrorResponse {

    private int code;
    private String message;

}
