package dev.layseiras.encurtador.domain.entity;

import java.time.LocalDateTime;

public class LinkResponse {
    private Long id;
    private String urlLonga;
    private String urlEncurtada;
    private LocalDateTime createdAt;

    public LinkResponse() {
    }

    public LinkResponse(Long id, String urlLonga, String urlEncurtada, LocalDateTime createdAt) {
        this.id = id;
        this.urlLonga = urlLonga;
        this.urlEncurtada = urlEncurtada;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlLonga() {
        return urlLonga;
    }

    public void setUrlLonga(String urlLonga) {
        this.urlLonga = urlLonga;
    }

    public String getUrlurlEncurtada() {
        return urlEncurtada;
    }

    public void setUrlurlEncurtada(String urlurlEncurtada) {
        this.urlEncurtada = urlurlEncurtada;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
