package com.upgrad.payment.Payment.Service.Dao;

import com.upgrad.payment.Payment.Service.entity.TransactionDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDao extends JpaRepository<TransactionDetailsEntity,Integer> {
}
