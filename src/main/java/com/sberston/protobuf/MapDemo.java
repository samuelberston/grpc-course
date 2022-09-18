package com.sberston.protobuf;

import com.sberston.models.Car;
import com.sberston.models.Dealer;

public class MapDemo {

    public static void main(String[] args) {

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

        Dealer dealer = Dealer.newBuilder()
                .putModel(2016, mercedes)
                .putModel(2016, nissan)
                .build();

        System.out.println(
                dealer.getModelOrThrow(2010)
        );

    }
}
