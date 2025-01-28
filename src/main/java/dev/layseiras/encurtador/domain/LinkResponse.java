package dev.layseiras.encurtador.domain;

import java.time.LocalDateTime;

public class LinkResponse {
    private Long id;
    private String urlCommun;
    private String urlShorted;
    private LocalDateTime createdAt;

    public LinkResponse() {}

    public LinkResponse(Long id, String urlCommun, String urlShorted, LocalDateTime createdAt) {
        this.id = id;
        this.urlCommun = urlCommun;
        this.urlShorted = urlShorted;
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
        return urlShorted;
    }

    public void setUrlShorted(String urlShorted) {
        this.urlShorted = urlShorted;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
