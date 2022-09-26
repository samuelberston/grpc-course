package com.sberston.protobuf;

import com.sberston.models.BodyStyle;
import com.sberston.models.Car;
import com.sberston.models.Dealer;

public class MapDemo {

    public static void main(String[] args) {

        Car nissan = Car.newBuilder()
                .setMake("Nissan")
                .setModel("Versa")
                .setBodyStyle(BodyStyle.COUPE)
                .setYear(2016)
                .build();

        Car mercedes = Car.newBuilder()
                .setMake("Mercedes")
                .setModel("C-Class")
                .setBodyStyle(BodyStyle.SEDAN)
                .setYear(2016)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putModel(2016, mercedes)
                .putModel(2020, nissan)
                .build();

        System.out.println(
                dealer.getModelOrThrow(2016).getBodyStyle()
        );

    }
}
