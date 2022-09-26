package com.sberston.protobuf;

import com.sberston.models.Person;

public class DefaultValueDemo {
    public static void main(String[] args) {
        Person person = Person.newBuilder().build();

        System.out.println(
          "City : " + person.getAddress().getCity()
        );

        System.out.println(
                person.hasAddress()
        );
    }
}
