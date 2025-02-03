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
    private String urlLonga;

    @Column(name = "url_encurtada")
    private String urlEncurtada;

    @Column(name = "criada_em")
    private LocalDateTime createdAt;

    public Link() {
        this.id = id;
    }

    public Link(Long id, String urlLonga, String urlEncurtada, LocalDateTime createdAt) {
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

    public String getUrlEncurtada() {
        return urlEncurtada;
    }

    public void setUrlEncurtada(String urlEncurtada) {
        this.urlEncurtada = urlEncurtada;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
