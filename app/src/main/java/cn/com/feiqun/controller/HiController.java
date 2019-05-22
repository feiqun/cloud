package cn.com.feiqun.controller;

import cn.com.feiqun.feign.ServiceHi;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author feiqun
 * @date 2019/5/21 17:12
 * @desc
 */
@RestController
public class HiController {
    @Autowired
    ServiceHi serviceHi;

    @GetMapping(value = "/hi")
    @HystrixCommand(fallbackMethod = "isError")
    public String sayHi(@RequestParam String name) {
        return serviceHi.sayHiFromClientOne(name);
    }

    public String isError(String name) {
        return "断路器生效";
    }
}
