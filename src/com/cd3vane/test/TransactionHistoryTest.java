package com.cd3vane.test;

import com.cd3vane.model.Transaction;
import com.cd3vane.model.TransactionHistory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionHistoryTest {
    TransactionHistory transactionHistory;

    @BeforeEach
    void init(){
        transactionHistory = new TransactionHistory();
        transactionHistory.push(new Transaction());
    }
    @Test
    void push() {
        var sizeBeforePush = transactionHistory.transactionList.size();

        transactionHistory.push(new Transaction());

        assertEquals(sizeBeforePush + 1, transactionHistory.transactionList.size());
    }

    @Test
    void getTransactionById() {
        var target = transactionHistory.getTransactionById(1);

        assertEquals("Amazon", target.getCompanyName());
    }
}