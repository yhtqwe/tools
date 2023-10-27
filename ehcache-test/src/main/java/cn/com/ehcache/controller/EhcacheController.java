package cn.com.ehcache.controller;

import cn.com.ehcache.domain.User;
import cn.com.ehcache.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: yanghantong
 * @time: 2023/10/27 11:42
 */
@Slf4j
@RestController
@RequestMapping("/ehcache")
public class EhcacheController {

    @Resource
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        return "success";
    }


    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return userService.getUser(id);
    }

    @PostMapping("/updateUser")
    public String updateUser(@RequestBody User user){
        userService.updateUser(user);
        return "success";
    }

}
