package com.tong.spring.dao.impl;

import com.tong.spring.bean.Bank;
import com.tong.spring.dao.BankDao;
import com.tong.spring.exception.BankException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bankDao")
public class BankDaoImpl implements BankDao {
    @Autowired
    private JdbcTemplate template;

    @Override
    public Bank findBankById(int id) {
        String sql = "select *from bank where id = ?";
        Bank bank = template.queryForObject(sql,new BeanPropertyRowMapper<>(Bank.class),id);
        return bank;
    }

    @Override
    public void updateFrom(int fromId, double money) throws BankException {
        Bank bank = findBankById(fromId);
        double balance = bank.getMoney();
        if(balance <= 0){
            throw new BankException("已经没有余额了！");
        }else if (balance < money){
            throw new BankException("余额不足！");
        }
        String sql = "update bank set money = money - ? where id = ?";
        int update = template.update(sql,money,fromId);
        System.out.println(update);
    }

    @Override
    public void updateTo(int toId, double money) {
        String sql = "update bank set money = money + ? where id = ?";
        int update = template.update(sql,money,toId);
        System.out.println(update);
    }
}
