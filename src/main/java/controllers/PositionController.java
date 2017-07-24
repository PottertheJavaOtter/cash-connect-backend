package controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import structures.Position;

import java.util.Date;

/**
 * Created by nurudeenlawal on 7/16/17.
 */
public class PositionController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Position greeting(String deviceId) throws Exception {
        Thread.sleep(1000); // simulated delay
        Position currentPosition = new Position();
        currentPosition.setDateTime(new Date());
        currentPosition.setLatitude(2.4);
        currentPosition.setLongitude(5.66);
        currentPosition.setDeviceID(deviceId);
        return currentPosition;
    }

}
