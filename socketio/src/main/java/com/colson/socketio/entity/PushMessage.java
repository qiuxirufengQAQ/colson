package com.colson.socketio.entity;

/**
 * @author wangwg
 */
public class PushMessage {
    /**
     * 登录用户
     */
    private String loginUserId;

    /**
     * 传输内容
     */
    private String content;

    /**
     * 传输类型
     */
    private String type;

    /**
     * 传输标识
     */
    private Boolean flag;

    public String getLoginUserId() {
        return loginUserId;
    }

    public void setLoginUserId(String loginUserId) {
        this.loginUserId = loginUserId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}
