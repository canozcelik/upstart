package co.upstart.assignment.newsapi.domain.dto.response.mapper;

import co.upstart.assignment.newsapi.domain.Article;
import co.upstart.assignment.newsapi.domain.News;
import co.upstart.assignment.newsapi.domain.Source;
import co.upstart.assignment.newsapi.domain.dto.response.ArticleDTO;
import co.upstart.assignment.newsapi.domain.dto.response.Response;
import co.upstart.assignment.newsapi.domain.dto.response.SourceDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResponseMapper {

    Response toResponse(News news);

    ArticleDTO toArticleDTO(Article article);

    SourceDTO toSourceDTO(Source source);

}
