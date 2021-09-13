package com.tong.spring.service;

public interface TransferDao {
    void transferMoney(int fromId, int toId, double money) throws Exception;
}
