package dev.layseiras.encurtador.domain.entity;

import java.time.LocalDateTime;

public class LinkResponse {
    private Long id;
    private String urlCommun;
    private String urlShortened;
    private LocalDateTime createdAt;

    public LinkResponse() {}

    public LinkResponse(Long id, String urlCommun, String urlShortened, LocalDateTime createdAt) {
        this.id = id;
        this.urlCommun = urlCommun;
        this.urlShortened = urlShortened;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlCommun() {
        return urlCommun;
    }

    public void setUrlCommun(String urlCommun) {
        this.urlCommun = urlCommun;
    }

    public String getUrlShorted() {
        return urlShortened;
    }

    public void setUrlShorted(String urlShortened) {
        this.urlShortened = urlShortened;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
