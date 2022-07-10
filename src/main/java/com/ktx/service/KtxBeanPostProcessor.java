package com.ktx.service;

import com.spring.BeanPostProcessor;
import com.spring.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName KtxBeanPostProcessor
 * @Description TODO
 * @Author ktx
 * @Date 2022-07-10 20:31
 * @Version 1.0
 */
@Component
public class KtxBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(String beanName, Object bean) {
        if(beanName.equals("userService")){
            System.out.println("postProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(String beanName, Object bean) {
        if(beanName.equals("userService")){
            System.out.println("postProcessAfterInitialization");
        }
        if(beanName.equals("userService")){
            Object proxyInstance = Proxy.newProxyInstance(
                    KtxBeanPostProcessor.class.getClassLoader(),
                    bean.getClass().getInterfaces(),
                    new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            System.out.println("切面逻辑");

                            return method.invoke(bean,args);
                        }
                    }
            );
            return proxyInstance;
        }
        return bean;
    }
}
