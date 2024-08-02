package com.bank.history.repository;

import com.bank.history.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Ключем по работы по БД будет  id
 */
@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {
}

