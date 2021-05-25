package com.bjsxt.dao;

import com.bjsxt.pojo.Orders;
import com.bjsxt.pojo.Users;

public interface UsersDao {
    void insertUsers(Users users);
    void insertOrders(Orders orders);
}
