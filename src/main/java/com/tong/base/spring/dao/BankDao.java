package com.tong.base.spring.dao;

import com.tong.base.spring.bean.Bank;

public interface BankDao {
    //根据序号查询账户信息
    Bank findBankById(int id);
    //更新bank表中金额信息 转走
    void updateFrom(int fromId, double money) throws Exception;
    //转入
    void updateTo(int toId, double money);

}
