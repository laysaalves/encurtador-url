package dev.layseiras.encurtador.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_link")
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "url_longa")
    private String urlCommun;

    @Column(name = "url_encurtada")
    private String urlShortened;

    @Column(name = "criada_em")
    private LocalDateTime createdAt;

    public Link() {
        this.id = id;
    }

    public Link(Long id, String urlCommun, String urlShortened, LocalDateTime createdAt) {
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

    public String getUrlShortened() {
        return urlShortened;
    }

    public void setUrlShortened(String urlShortened) {
        this.urlShortened = urlShortened;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
