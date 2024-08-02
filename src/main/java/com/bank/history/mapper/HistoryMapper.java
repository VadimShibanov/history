package com.bank.history.mapper;

import com.bank.history.dto.HistoryDto;
import com.bank.history.entity.History;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Маппер для преобразования сущности в Dto-объект и обратно
 */

@Mapper(componentModel = "spring")
public interface HistoryMapper {
    History toHistory(HistoryDto historyDto);
    HistoryDto toHistoryDto(History history);
    List<HistoryDto> toHistoryDtoList(List<History> histories);
}
