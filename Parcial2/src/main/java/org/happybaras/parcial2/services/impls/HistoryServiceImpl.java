package org.happybaras.parcial2.services.impls;

import org.happybaras.parcial2.domain.entities.History;
import org.happybaras.parcial2.domain.entities.User;
import org.happybaras.parcial2.repositories.HistoryRepository;
import org.happybaras.parcial2.services.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HistoryServiceImpl implements HistoryService {
    private final HistoryRepository historyRepository;

    public HistoryServiceImpl(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

    @Override
    public Optional<History> findHistoryById(UUID id) {
        return historyRepository.findHistoryById(id);
    }

    @Override
    public List<History> findHistoriesByUser(User user) {
        return historyRepository.findHistoriesByUser(user);
    }
}
