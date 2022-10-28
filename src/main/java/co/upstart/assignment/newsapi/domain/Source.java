package co.upstart.assignment.newsapi.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Source {

    private String name;
    private String url;
}
