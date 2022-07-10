package com.ktx;

import com.ktx.service.OrderService;
import com.ktx.service.UserInterface;
import com.ktx.service.UserService;
import com.spring.KtxApplicationContext;

/**
 * @ClassName Test
 * @Description TODO
 * @Author ktx
 * @Date 2022-07-10 16:55
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {

        // 扫描 --> 创建单例bean
        KtxApplicationContext applicationContext = new KtxApplicationContext(AppConfig.class);

        UserInterface userService = (UserInterface) applicationContext.getBean("userService");
        System.out.println(userService);
//        OrderService orderService = (OrderService) applicationContext.getBean("orderService");
//        System.out.println(orderService);
        userService.test();
    }
}
