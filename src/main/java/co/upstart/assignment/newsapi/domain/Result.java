package co.upstart.assignment.newsapi.domain;

import lombok.Data;

import java.util.List;

@Data
public class Result {

    private int total;
    private String query;
    private List<Article> articles;

}
