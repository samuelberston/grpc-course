package com.sberston.protobuf;

import com.sberston.models.Address;
import com.sberston.models.Car;
import com.sberston.models.Person;

import java.util.ArrayList;
import java.util.List;

public class CompositionDemo {
    public static void main(String[] args) {

        Address address = Address.newBuilder()
                .setPostbox(123)
                .setStreet("First Street")
                .setCity("San Francisco")
                .build();

        Car nissan = Car.newBuilder()
                .setMake("Nissan")
                .setModel("Versa")
                .setYear(2016)
                .build();

        Car mercedes = Car.newBuilder()
                .setMake("Mercedes")
                .setModel("C-Class")
                .setYear(2016)
                .build();

        List<Car> cars = new ArrayList<Car>();
        cars.add(nissan);
        cars.add(mercedes);


        Person sam = Person.newBuilder()
                .setName("Sam")
                .setAge(25)
                .addAllCar(cars)
                .setAddress(address)
                .build();

        System.out.println(
                sam
        );

    }
}
