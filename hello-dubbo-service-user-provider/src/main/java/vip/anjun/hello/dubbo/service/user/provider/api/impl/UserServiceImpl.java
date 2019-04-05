package vip.anjun.hello.dubbo.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import vip.anjun.hello.dubbo.service.user.api.UserService;

/**
 * @author anjun
 * @date 2019-04-05 18:36
 */
@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {
    @Value("${dubbo.protocol.port}")
    private String port;
    @Override
    public String sayHi() {
        return "hello dubbo ,i am from"+ port;
    }
}
