package com.sberston.protobuf;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.sberston.json.JPerson;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sberston.models.Person;

import java.io.IOException;

public class PerformanceTest {
    public static void main(String[] args) {

        // json
        JPerson person = new JPerson();
        person.setName("sam");
        person.setAge(10);

        ObjectMapper mapper = new ObjectMapper();

        Runnable json = () -> {
            try {
                byte[] bytes = mapper.writeValueAsBytes(person);
                JPerson person1 = mapper.readValue(bytes, JPerson.class);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        // protobuf
        Person sam = Person.newBuilder()
                .setName("sam")
                .setAge(10)
                .build();

        Runnable protobuf = () -> {
            try {
                byte[] bytes = sam.toByteArray();
                Person sam1 = Person.parseFrom(bytes);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 5; i++) {
            RunPerformanceTest(json, "json");
            RunPerformanceTest(protobuf, "protobuf" );
        }

    }

    private static void RunPerformanceTest(Runnable runnable, String method) {
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            runnable.run();
        }
        long time2 = System.currentTimeMillis();

        System.out.println(
                method + " : " + (time2 - time1) + "ms"
        );
    }
}
