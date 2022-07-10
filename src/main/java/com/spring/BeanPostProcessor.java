package com.spring;

/**
 * @ClassName BeanPostProcessor
 * @Description TODO
 * @Author ktx
 * @Date 2022-07-10 20:30
 * @Version 1.0
 */
public interface BeanPostProcessor {
    public default Object postProcessBeforeInitialization(String beanName, Object bean){
        return bean;
    }
    public default Object postProcessAfterInitialization(String beanName, Object bean){
        return bean;
    }
}
