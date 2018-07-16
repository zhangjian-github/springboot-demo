package com.example.springbootdemo.dao;

import com.alibaba.fastjson.JSON;
import com.example.springbootdemo.SpringbootDemoApplicationTests;
import com.example.springbootdemo.dao.user.UserDAO;
import com.example.springbootdemo.domain.user.UserDO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class DAOTest extends SpringbootDemoApplicationTests {

    @Autowired
    private UserDAO userDAO;

    @Test
    public void testDAO() {
        UserDO userDO = new UserDO();
        userDO.setUsername("名称");
        userDO.setPassword("密码");
        boolean insert = userDAO.insert(userDO);
        System.out.println("保存结果="+insert+",id="+userDO.getId());
        UserDO byId = userDAO.getById(userDO.getId());
        System.out.println(JSON.toJSONString(byId));
    }

}
