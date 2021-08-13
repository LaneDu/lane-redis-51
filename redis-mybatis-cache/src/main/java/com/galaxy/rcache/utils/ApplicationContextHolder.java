package com.galaxy.rcache.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author lane
 * @date 2021年08月01日 下午7:15
 */
@Component
public class ApplicationContextHolder implements ApplicationContextAware {
    private static ApplicationContext ctx;

    @Override
//向工具类注入 applicationContext
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext; //ctx 就是注入的 applicationContext

    }

//外部调用 ctx
    public static ApplicationContext getCtx() {

        return ctx;

    }

    public static <T> T getBean(Class<T> tClass) {

        return ctx.getBean(tClass);

    }

    @SuppressWarnings("unchecked")

    public static <T> T getBean(String name) {

        return (T) ctx.getBean(name);

    }

}

