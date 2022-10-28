package co.upstart.assignment.newsapi.domain.dto.response;

import lombok.Setter;

@Setter
public class Error {
    private int code;
    private String message;
}
