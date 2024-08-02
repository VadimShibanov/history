package com.bank.history.entity;

import lombok.Data;

import javax.persistence.*;


/**
 * Сущность, представляющая историю операций со всех микросервисов проекта
 */
@Data
@Entity
@Table(name = "history", schema = "history")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "transfer_audit_id")
    private Long transferAuditId;

    @Column(name = "profile_audit_id")
    private Long profileAuditId;

    @Column(name = "account_audit_id")
    private Long accountAuditId;

    @Column(name = "anti_fraud_audit_id")
    private Long antiFraudAuditId;

    @Column(name = "public_bank_info_audit_id")
    private Long publicBankInfoAuditId;

    @Column(name = "authorization_audit_id")
    private Long authorizationAuditId;
}
