package com.d.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.d.CatAnnotation;
import com.d.server.AsdService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Air
 * Date:  2019/3/6
 */
@Component
@Service(version = "1.0.0")
public class AsdServiceImpl implements AsdService {

    @Value("${server.port}")
    private int port;

    @CatAnnotation
    public String sayHello() {
        return "节点1，dubbo : provider端，端口："+port;
    }
}
