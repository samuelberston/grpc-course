package com.sberston.protobuf;

import com.sberston.models.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo {

    public static void main(String[] args) {
//        Person sam = Person.newBuilder()
//                .setName("sam")
//                .setAge(10)
//                .build();

        Path path = Paths.get("sam.ser");
        try {
//            Files.write(path, sam.toByteArray());
            byte[] bytes = Files.readAllBytes(path);
            Person newSam = Person.parseFrom(bytes);
            System.out.println(newSam);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
