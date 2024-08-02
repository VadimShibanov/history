package com.bank.history.controller;

import com.bank.history.dto.HistoryDto;
import com.bank.history.entity.History;
import com.bank.history.mapper.HistoryMapper;
import com.bank.history.service.HistoryServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Контролллер историй изменения данного приложения ипользующий REST API
 */
@RestController
@AllArgsConstructor
@RequestMapping("/history")
public class HistoryController {
    private final HistoryServiceImpl historyService;
    private final HistoryMapper historyMapper;

    /**
     * Получение всех историй
     */
    @Operation(summary = "Get all histories")
    @GetMapping
    public List<HistoryDto> getAll () {
        return historyMapper.toHistoryDtoList(historyService.getAll());
    }

    /**
     * Получение истории по заданой id
     */
    @Operation(summary = "Get history by id")
    @GetMapping("/{id}")
    public HistoryDto getHistoryById(@PathVariable Long id) {
        return historyMapper.toHistoryDto(historyService.getHistoryById(id));
    }
/**
 * Удаление истории по id
 */
    @Operation(summary = "Delete history by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<History> delete(@PathVariable Long id) {
        historyService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
}
}
