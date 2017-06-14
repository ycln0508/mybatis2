package com.tarena;

import com.tarena.entity.User;
import com.tarena.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lining on 17/6/2.
 */
@RestController
public class TestController {
    @Autowired
    private UserDao userDao;
    @RequestMapping("/testasfd")
    public List<User> asfd(){

        List<User> users = userDao.findUsers();

        return users;
    }
    @Transactional
    @RequestMapping("/test")
    public String testTrans(){
        User user=new User();
        user.setCn_user_desc("5555");
        user.setCn_user_id("555");
        user.setCn_user_name("55566");
        user.setCn_user_password("123456");
        user.setCn_user_token("9999");
        int successCount = userDao.save(user);
        User user1=new User();
        user1.setCn_user_id("88888");
        user1.setCn_user_password("11111");
        int updatapassword = userDao.updatapassword(user1);
        String s=null;
        s.length();
        return "success";
    }





}
