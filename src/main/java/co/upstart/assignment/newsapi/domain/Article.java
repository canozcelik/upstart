package co.upstart.assignment.newsapi.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Article {

    private String title;
    private String description;
    private String content;
    private String url;
    private String image;
    private LocalDateTime publishDate;
    private Source source;

}
