package com.atguigu.boot.config;

import com.atguigu.boot.bean.Person;
import com.atguigu.boot.bean.Pet;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//告诉Spring Boot这是一个配置类
//@Import导入自定义组件，默认组件的名字就是全类名
@Import(Person.class)
@Configuration
//如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有。
// proxyBeanMethods是代理bean的方法，有两种模式：
// Full ： proxyBeanMethods = true
// Lite：proxyBeanMethods = false
//@ConditionalOnBean当类中有括号内指定的组件时，配置才会生效
// @ConditionalOnBean(name = "cat01")
public class MyConfig {
    // @ImportResource("classpath:beans.xml") 允许导入.xml的原生配置文件
    @Bean //给容器中添加组件。以方法名作为组件的id。返回类型就是组件类型。返回的值，就是组件在容器中的实例
    public Person person01() {
        Person xiaochen =  new Person("xiaochen", 18);

        return xiaochen;
    }
    @Bean
    public Pet cat01() {
        return new Pet("喵喵");
    }
}
