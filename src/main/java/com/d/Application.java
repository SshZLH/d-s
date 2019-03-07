package com.d;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import net.dubboclub.catmonitor.DubboCat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Air
 * Date:  2019/3/6
 */
@EnableDubbo
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //开启
        DubboCat.enable();
        SpringApplication.run(Application.class, args);
    }
}
