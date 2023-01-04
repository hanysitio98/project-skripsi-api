package com.train4best.springbootbackend.service;

import com.train4best.springbootbackend.entity.History;
import com.train4best.springbootbackend.exception.ResourceNotFoundException;
import com.train4best.springbootbackend.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HistoryService {
    @Autowired
    private HistoryRepository historyRepository;

    public History findById(String id) {
        return historyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("History dengan id" + id + " tidak ditemukan"));
    }

    public List<History> findAll() {
        return historyRepository.findAll();
    }

    public History create(History history) {
        history.setId(UUID.randomUUID().toString());
        return  historyRepository.save(history);
    }

    public History edit(History history) {
        return historyRepository.save(history);
    }

    public void deleteById(String id) {
        historyRepository.deleteById(id);
    }
}
