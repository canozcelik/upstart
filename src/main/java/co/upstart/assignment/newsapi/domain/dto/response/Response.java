package co.upstart.assignment.newsapi.domain.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Response {
    private int total;
    private List<ArticleDTO> articles;
}
