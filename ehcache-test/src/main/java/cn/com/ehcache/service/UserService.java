package cn.com.ehcache.service;

import cn.com.ehcache.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: yanghantong
 * @time: 2023/10/27 14:19
 */
@Service
@Slf4j
public class UserService {

    private static List<User> users = new ArrayList<User>(){{
        add(new User("yang", "123456", "123456@qq.com"));
        add(new User("zhao", "123456", "123456@qq.com"));
        add(new User("qian", "123456", "123456@qq.com"));
        add(new User("sun", "123456", "123456@qq.com"));
        add(new User("li", "123456", "123456@qq.com"));
    }};

    @Cacheable(value = "dictCache", key = "#id")
    public User getUser(Integer id){
        log.info("没有使用本地缓存");
        int i = id % users.size();
        return users.get(i);
    }

    @CacheEvict(value = "dictCache", key = "#id")
    public void updateUser(User user){
        for (User userTemp : users) {
            if (userTemp.getUsername().equals(user.getUsername())){
                userTemp.setPassword(user.getPassword());
                userTemp.setEmail(user.getEmail());
            }
        }
    }
}
