package com.tong.spring.service.impl;

import com.tong.base.BaseTestApplication;
import com.tong.base.BaseTestApplicationTests;
import com.tong.base.spring.service.TransferDao;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-tx.xml")
class TransferDaoImplTest extends BaseTestApplicationTests {
    @Autowired
    TransferDao transferDao;
    @Test
    void transferMoney() throws Exception {
        transferDao.transferMoney(1,2,1);
    }
}