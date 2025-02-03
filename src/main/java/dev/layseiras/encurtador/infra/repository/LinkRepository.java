package dev.layseiras.encurtador.infra.repository;

import dev.layseiras.encurtador.domain.entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
    Link findByUrl(String urlEncurtada);
}
