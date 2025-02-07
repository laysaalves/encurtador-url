package dev.layseiras.encurtador.infra.repository;

import dev.layseiras.encurtador.domain.entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LinkRepository extends JpaRepository<Link, Long> {
    Optional<Link> findByUrlEncurtada(String urlEncurtada);
}
