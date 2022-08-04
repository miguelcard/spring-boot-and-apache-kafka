package com.amigoscode.producer.data;

// this is currently not being used but maybe a good idea on how to organize topics
public enum TopicEnum {
    AMIGOS_CODE("amigoscode", 1),
    TOPIC2("topic2", 2),
    TOPIC3("topic3", 3);


     public String value;
     public Integer prio;

    TopicEnum(String s, Integer i) {
        value = s;
        prio = i;
    }
}
