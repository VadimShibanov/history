package com.bank.history.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Класс для передачи и принятия истории данного приложения
 */
@Data
@Component
public class HistoryDto {
    private Long id;
    private Long transferAuditId;
    private Long profileAuditId;
    private Long accountAuditId;
    private Long antiFraudAuditId;
    private Long publicBankInfoAuditId;
    private Long authorizationAuditId;
}
