package com.amigoscode.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Define each listener for each Topic and Read Data!
 * (kind of like a controller)
 */
@Component
public class KafkaListeners {

    // group id is so that if we have more instances of the same application they can all read from the same partition or topic
    // so if you have more listeners you want to change ir to a UID
    @KafkaListener(topics = "amigoscode", groupId = "foo")
    void listener(String data){
        // here we can then do anything we want with that data!! e.g. pass it to other components and so on
        System.out.println("Heyyy! Listener received data: "+ data);
    }
}
