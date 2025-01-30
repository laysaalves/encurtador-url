package dev.layseiras.encurtador.domain.service;

import dev.layseiras.encurtador.domain.entity.Link;
import dev.layseiras.encurtador.infra.repository.LinkRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LinkService {
    private LinkRepository linkRepository;

    public LinkService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public String generateRandomShortUrl() {
        return RandomStringUtils.randomAlphanumeric(5, 10);
    }

    public Link createShortenedLink(String originalUrl) {
        Link link = new Link();
        link.setUrlCommun(originalUrl);
        link.setUrlShortened(generateRandomShortUrl());
        link.setCreatedAt(LocalDateTime.now());

        return linkRepository.save(link);
    }

    public Link getOriginalUrl(String shortenedUrl) {
        try {
            return linkRepository.findByUrl(shortenedUrl);
        } catch (Exception error) {
            throw new RuntimeException("url not found: ", error);
        }
    }
}

