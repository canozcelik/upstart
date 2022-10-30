package co.upstart.assignment.newsapi.controller;


import co.upstart.assignment.newsapi.domain.dto.response.Response;
import co.upstart.assignment.newsapi.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/news")
@RequiredArgsConstructor
public class NewsController {

    private final NewsService newsService;

    @GetMapping
    public ResponseEntity<Response> test(@RequestParam String query, @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok().body(newsService.getNews(query, size));
    }
}
