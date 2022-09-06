package com.closon.essence.eventListener;

import org.springframework.context.ApplicationEvent;

public class OrderEvent extends ApplicationEvent {

    /**
     * 事件实体
     */
    private Object object;

    public OrderEvent(Object source, Object object) {
        super(source);
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
