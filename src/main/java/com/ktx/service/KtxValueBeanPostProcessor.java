package com.ktx.service;

import com.spring.BeanPostProcessor;
import com.spring.Component;

import java.lang.reflect.Field;
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
public class KtxValueBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(String beanName, Object bean) {
        for (Field field : bean.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(KtxValue.class)) {
                field.setAccessible(true);
                try {
                    field.set(bean,field.getAnnotation(KtxValue.class).value());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return bean;
    }

}
