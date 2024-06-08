package org.happybaras.parcial2.services;

import org.happybaras.parcial2.domain.entities.History;
import org.happybaras.parcial2.domain.entities.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface HistoryService {
    Optional<History> findHistoryById(UUID id);
    List<History> findHistoriesByUser(User user);
}
