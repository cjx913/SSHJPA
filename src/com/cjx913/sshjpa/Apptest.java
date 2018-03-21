package com.cjx913.sshjpa;

import com.cjx913.sshjpa.dao.UserRepository;
import com.cjx913.sshjpa.entity.User;
import com.cjx913.sshjpa.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/*使用spring的单元测试，加载spring配置文件*/
@ContextConfiguration(locations = "classpath:config/spring-config.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class Apptest {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;


    @Test
    public void save(){
        /*User user = new User();
        user.setUsername("aaaaasswee");
        user.setPassword("123512312321");
        System.out.println(userRepository);
        try {
            userRepository.save(user);
        }catch (Exception e){
            e.printStackTrace();
        }*/

//        User u = userService.getByUsernameAndPassword("cjx913","cjx913****");
//        System.out.println(u.getId());
//        u.setPassword("cjx913");
//        userService.update(u);



//        User u = userService.findById(4);
//        System.out.println(u==null?null:u.getPassword());

            for(User u:userService.findAll()){
                System.out.println(u.toString());
            }


    }
}
