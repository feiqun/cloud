package cn.com.feiqun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author feiqun
 * @description:
 * @date 2019/3/14
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@ComponentScan("cn.com.feiqun")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
