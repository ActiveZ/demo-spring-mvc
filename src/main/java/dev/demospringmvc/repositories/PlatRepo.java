package dev.demospringmvc.repositories;

import dev.demospringmvc.entities.Plat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatRepo extends JpaRepository<Plat,Integer> {
}
