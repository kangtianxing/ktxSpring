package com.spring;

/**
 * @ClassName BeanDefinition
 * @Description TODO
 * @Author ktx
 * @Date 2022-07-10 17:35
 * @Version 1.0
 */
public class BeanDefinition {
    private Class type;
    private String scope;
    private Boolean isLazyLoad;

    public BeanDefinition() {
    }

    public BeanDefinition(Class type, String scope) {
        this.type = type;
        this.scope = scope;
    }

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Boolean getLazyLoad() {
        return isLazyLoad;
    }

    public void setLazyLoad(Boolean lazyLoad) {
        isLazyLoad = lazyLoad;
    }
}
