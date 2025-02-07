package dev.layseiras.encurtador.domain.service;

import dev.layseiras.encurtador.domain.entity.Link;
import dev.layseiras.encurtador.infra.repository.LinkRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class LinkService {

    private final LinkRepository linkRepository;

    public LinkService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public String generateRandomShortUrl() {
        return RandomStringUtils.randomAlphanumeric(5, 10);
    }

    public Link createLinkEncurtado(String originalUrl) {
        Link link = new Link();
        link.setUrlLonga(originalUrl);
        link.setUrlEncurtada(generateRandomShortUrl());
        link.setCreatedAt(LocalDateTime.now());

        return linkRepository.save(link);
    }

    public Link getOriginalUrl(String urlEncurtada) {
        Optional<Link> link = linkRepository.findByUrlEncurtada(urlEncurtada);

        return link.orElseThrow(() ->
                new RuntimeException("URL não encontrada: " + urlEncurtada)
        );
    }
}


