package co.upstart.assignment.newsapi.domain.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class ArticleDTO {

    private String title;
    private String description;
    private String content;
    private String url;
    private String image;
    private LocalDateTime publishDate;
    private SourceDTO source;
}
