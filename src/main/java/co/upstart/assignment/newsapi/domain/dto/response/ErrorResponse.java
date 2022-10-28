package co.upstart.assignment.newsapi.domain.dto.response;

import lombok.Setter;

import java.util.List;

@Setter
public class ErrorResponse {

    private List<Error> errors;

}
