package com.bl;

import java.util.List;
import java.util.Scanner;

public class HotelView {
    private Scanner scanner = new Scanner(System.in);
    public HotelType createHotel(List<HotelType> hotelsList){
        HotelType hotel = new HotelType();
        System.out.println("enter hId");
        int id = scanner.nextInt();
        hotel.sethId(id);

        System.out.println("enter hRating");
        int rate = scanner.nextInt();
        hotel.sethRating(rate);

        System.out.println("enter Hotel name ");
        String name = scanner.next();
        hotel.sethName(name);
    return hotel;
    }

    public void readHotel(List<HotelType> hotelsList){
        System.out.println("Hotels details");
        System.out.println(hotelsList);

    }
}
