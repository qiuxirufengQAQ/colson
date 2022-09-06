package com.colson.socketio;

import com.colson.socketio.entity.PushMessage;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wangwg
 */
public class SocketIOTest {

    @Autowired
    private SocketIOService socketIOService;


    public void sendState(String userId) {
        PushMessage p = new PushMessage();
        p.setLoginUserId(userId);
        p.setContent("success");
        p.setType("stateChange");
        p.setFlag(true);
        socketIOService.pushMessageToUserAll(p);
    }
}
