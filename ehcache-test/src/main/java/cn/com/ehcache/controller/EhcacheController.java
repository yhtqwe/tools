package cn.com.ehcache.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: yanghantong
 * @time: 2023/10/27 11:42
 */
@Slf4j
@RestController
@RequestMapping("/ehcache")
public class EhcacheController {

    @RequestMapping("/index")
    public String index(){
        return "success";
    }
}
