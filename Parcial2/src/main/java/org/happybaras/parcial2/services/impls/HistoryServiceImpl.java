package org.happybaras.parcial2.services.impls;

import org.happybaras.parcial2.repositories.HistoryRepository;
import org.happybaras.parcial2.services.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryServiceImpl implements HistoryService {
    private final HistoryRepository historyRepository;

    public HistoryServiceImpl(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }
}
