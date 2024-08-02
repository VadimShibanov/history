package com.bank.history.service;

import com.bank.history.entity.History;

import java.util.List;

public interface HistoryService {
    List<History> getAll ();

    History getHistoryById(Long id);
    void delete (Long id);
}
