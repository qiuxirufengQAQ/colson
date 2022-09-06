package com.closon.essence.eventListener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class EventPublisher implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void publish(Object object) {
        applicationContext.publishEvent(object);
    }

    @PostConstruct
    public void test(){
        publish(new OrderEvent(applicationContext,"dddd"));
        publish(new OrderEvent(applicationContext,"dddd1"));
        publish(new OrderEvent(applicationContext,"dddd2"));
        publish(new OrderEvent(applicationContext,"dddd3"));
    }
}
