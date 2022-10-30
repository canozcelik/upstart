package co.upstart.assignment.newsapi.newsclient.GNews;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class GNewsArticle {

    private String title;
    private String description;
    private String content;
    private String url;
    private String image;
    private LocalDateTime publishedAt;
    private Source source;
}
