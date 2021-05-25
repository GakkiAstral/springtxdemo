package com.bjsxt.service.impl;

import com.bjsxt.dao.UsersDao;
import com.bjsxt.pojo.Orders;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
public class UsersServiceImpl implements UsersService {
    private UsersDao usersDao;

    public UsersDao getUsersDao() {
        return usersDao;
    }

    public void setUsersDao(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    /**
     * 添加用户与订单
     * @param users
     * @param orders
     */
    @Override
    public void addUsersAndOrders(Users users, Orders orders) {
        this.usersDao.insertUsers(users);
        this.usersDao.insertOrders(orders);
    }
}
