package com.bank.history.service;

import com.bank.history.entity.History;
import com.bank.history.repository.HistoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.security.auth.login.AccountNotFoundException;
import java.util.List;

@Service
public class HistoryServiceImpl implements HistoryService{
    private final HistoryRepository historyRepository;

    public HistoryServiceImpl(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

    /**
     * метод возвращает все имеющиеся записи в истории
     */
    @Transactional(readOnly = true)
    public List<History> getAll() {
        return historyRepository.findAll();
    }
    /**
     * Возвращает историю по заданному идендификатору. метод getById Idea подсвечивает как depricated
     */
    @Transactional(readOnly = true)
    public History getHistoryById(Long id) {
        return historyRepository.getReferenceById(id);
    }
    /**
     * Метод удаляет запись в БД по указанному ID
     */
    public void delete(Long id) {
        historyRepository.deleteById(id);
    }
}
