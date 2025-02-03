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
        Link link = linkService.createLinkEncurtado(urlOriginal);

        String generateUserRedirect = "http://localhost:8080/r/" + link.getUrlEncurtada();

        LinkResponse response = new LinkResponse(
                link.getId(),
                link.getUrlLonga(),
                generateUserRedirect,
                link.getCreatedAt()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/r/{urlEncurtada}")
    public void httpUrl(@PathVariable String urlEncurtada, HttpServletResponse response) throws IOException {
        Link link = linkService.getOriginalUrl(urlEncurtada);
        if (link != null){
            response.sendRedirect(link.getUrlLonga());
        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

}