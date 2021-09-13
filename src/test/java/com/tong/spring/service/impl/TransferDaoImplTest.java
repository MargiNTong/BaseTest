package com.tong.spring.service.impl;

import com.tong.spring.service.TransferDao;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringJUnit4ClassRunner.class)
class TransferDaoImplTest {

    @Autowired
    TransferDao transferDao;
    @Test
    void transferMoney() throws Exception {
        transferDao.transferMoney(1,2,1);
    }
}