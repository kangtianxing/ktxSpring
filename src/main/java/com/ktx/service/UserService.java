package com.ktx.service;

import com.spring.*;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author ktx
 * @Date 2022-07-10 16:56
 * @Version 1.0
 */

@Component("userService")
@Scope("prototype") //singleton
public class UserService implements InitializingBean,UserInterface, BeanNameAware {

    @Autowried
    private OrderService orderService;

    private String beanName;
    @KtxValue("xxx")
    private String test;

    @Override
    public void test() {
        System.out.println(orderService);
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("初始化");
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
