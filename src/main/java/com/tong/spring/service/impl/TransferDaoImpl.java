package com.tong.spring.service.impl;

import com.tong.spring.bean.Bank;
import com.tong.spring.dao.BankDao;
import com.tong.spring.service.TransferDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("transferDao")
public class TransferDaoImpl implements TransferDao {
    @Autowired
    private BankDao bankDao;

    @Transactional
    @Override
    public void transferMoney(int fromId, int toId, double money) throws Exception {
        bankDao.updateFrom(fromId,money);
        bankDao.updateTo(toId,money);
    }
}
