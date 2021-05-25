package com.bjsxt.test;

import com.bjsxt.pojo.Orders;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"applicationContext-service.xml","applicationContext-tx.xml"});
        UsersService usersService = (UsersService) applicationContext.getBean("usersService");
        Users users = new Users();
        users.setUsername("suibian5555");
        users.setUsersex("male");
        Orders orders = new Orders();
        orders.setOrderprice(1000);
        usersService.addUsersAndOrders(users,orders);
    }
}
