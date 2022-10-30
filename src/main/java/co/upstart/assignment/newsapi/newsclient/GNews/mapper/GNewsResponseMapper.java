package co.upstart.assignment.newsapi.newsclient.GNews.mapper;

import co.upstart.assignment.newsapi.domain.Article;
import co.upstart.assignment.newsapi.domain.News;
import co.upstart.assignment.newsapi.domain.Source;
import co.upstart.assignment.newsapi.newsclient.GNews.GNewsArticle;
import co.upstart.assignment.newsapi.newsclient.GNews.GNewsResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GNewsResponseMapper {

    @Mapping(source = "totalArticles", target = "total")
    News toResponse(GNewsResponse gNewsResponse);

    @Mapping(source = "publishedAt", target = "publishDate")
    Article toArticle(GNewsArticle article);

    List<Article> toArticleList(List<GNewsArticle> articles);

    Source toSource(co.upstart.assignment.newsapi.newsclient.GNews.Source source);
}
