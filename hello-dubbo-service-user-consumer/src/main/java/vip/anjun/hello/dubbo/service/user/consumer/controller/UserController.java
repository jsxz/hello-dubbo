package vip.anjun.hello.dubbo.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.anjun.hello.dubbo.service.user.api.UserService;

/**
 * @author anjun
 * @date 2019-04-05 18:42
 */
@RestController
public class UserController {
    @Reference(version = "${user.service.version}")
    UserService userService;
    @RequestMapping(value = "hi")
    public String sayHi() {
        return userService.sayHi();
    }
}
