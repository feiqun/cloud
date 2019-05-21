package cn.com.feiqun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author feiqun
 * @description:
 * @date 2019/3/14
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("cn.com.feiqun")
public class ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
