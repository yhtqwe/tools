package cn.com.ehcache;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @description:
 * @author: yanghantong
 * @time: 2023/10/27 11:40
 */
@EnableCaching
@SpringBootApplication
public class EhcacheApplicationTest {
    public static void main(String[] args) {
        SpringApplication.run(EhcacheApplicationTest.class);
        String property = System.getProperty("java.io.tmpdir");
        System.out.println(property);
    }
}
