package com.atguigu.boot;

import com.atguigu.boot.bean.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//这是一个SpringBoot应用
//主程序类
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        // 1、返回IOC容器
        ConfigurableApplicationContext run =  SpringApplication.run(MainApplication.class, args);
        // 2、查看容器组件
        // String[] names = run.getBeanDefinitionNames();
        // for(String name: names) System.out.println(name);
        // 3、从容器中获取组件
        Pet cat01 = run.getBean("cat01", Pet.class);
        Pet cat02 = run.getBean("cat01", Pet.class);
        System.out.println("组件："+(cat01 == cat02));
    }
}
