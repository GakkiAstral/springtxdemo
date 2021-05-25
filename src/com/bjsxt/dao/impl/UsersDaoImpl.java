package com.bjsxt.dao.impl;

import com.bjsxt.dao.UsersDao;
import com.bjsxt.pojo.Orders;
import com.bjsxt.pojo.Users;
import org.springframework.jdbc.core.JdbcTemplate;

public class UsersDaoImpl implements UsersDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * 添加用户
     * @param users
     */
    @Override
    public void insertUsers(Users users) {
        String sql = "insert into users values(default,?,?)";
        Object[] args = new Object[]{users.getUsername(),users.getUsersex()};
        this.jdbcTemplate.update(sql,args);
    }

    /**
     * 添加订单
     * @param orders
     */
    @Override
    public void insertOrders(Orders orders) {
        String sql = "insert into orders values(default,?,null)";
        Object[] args = new Object[]{orders.getOrderprice()};
        this.jdbcTemplate.update(sql,args);
    }
}
