package cn.com.ehcache.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: yanghantong
 * @time: 2023/10/27 14:03
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;

    private String password;

    private String email;

    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
