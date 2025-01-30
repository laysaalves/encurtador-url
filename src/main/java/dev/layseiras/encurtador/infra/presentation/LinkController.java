package dev.layseiras.encurtador.infra.presentation;
import dev.layseiras.encurtador.domain.entity.Link;
import dev.layseiras.encurtador.domain.entity.LinkResponse;
import dev.layseiras.encurtador.domain.service.LinkService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@RestController
public class LinkController {

    private LinkService linkService;

    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @PostMapping("/encurtei")
    public ResponseEntity<LinkResponse>GenerateShorterUrl(@RequestBody Map<String, String> req){
        String urlOriginal = req.get("urlOriginal");
        Link link = linkService.createShortenedLink(urlOriginal);

        String generateUserRedirect = "http://localhost:8080/r/" + link.getUrlShortened();

        LinkResponse response = new LinkResponse(
                link.getId(),
                link.getUrlCommun(),
                generateUserRedirect,
                link.getCreatedAt()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/r/{urlShortened}")
    public void httpUrl(@PathVariable String urlShortened, HttpServletResponse response) throws IOException {
        Link link = linkService.getOriginalUrl(urlShortened);
        if (link != null){
            response.sendRedirect(link.getUrlCommun());
        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

}