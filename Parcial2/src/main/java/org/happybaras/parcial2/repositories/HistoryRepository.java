package org.happybaras.parcial2.repositories;

import org.happybaras.parcial2.domain.entities.History;
import org.happybaras.parcial2.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface HistoryRepository extends JpaRepository<History, UUID> {
    Optional<History> findHistoryById(UUID id);

    // Get histories by user
    List<History> findHistoriesByUser(User user);
}
