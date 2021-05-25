package com.bjsxt.service;

import com.bjsxt.pojo.Orders;
import com.bjsxt.pojo.Users;

public interface UsersService {
    void addUsersAndOrders(Users users, Orders orders);
}
