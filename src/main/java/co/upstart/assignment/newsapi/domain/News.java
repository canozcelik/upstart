package co.upstart.assignment.newsapi.domain;

import lombok.Data;

import java.util.List;

@Data
public class News {

    private int total;
    private String query;
    private List<Article> articles;

}
