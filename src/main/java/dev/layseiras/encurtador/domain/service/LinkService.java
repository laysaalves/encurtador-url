package dev.layseiras.encurtador.domain.service;

import dev.layseiras.encurtador.domain.entity.Link;
import dev.layseiras.encurtador.infra.LinkRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LinkService {
    private LinkRepository linkRepository;

    public LinkService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public String generateRandomUrl(){
        return RandomStringUtils.randomAlphanumeric(5, 10);
    }

    public Link createLink(String urlCommun){
        Link link = new Link();
        link.setUrlCommun(urlCommun);
        link.setUrlShortened(generateRandomUrl());
        link.setCreatedAt(LocalDateTime.now());

        return linkRepository.save(link);
    }

    public Link getLinkFinished(String urlShortened){
        return linkRepository.findByUrl(urlShortened);
    }
}
