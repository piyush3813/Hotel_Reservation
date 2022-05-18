package com.bl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelControl extends Thread {

    private Scanner scanner = new Scanner(System.in);
    HotelView hotelView = new HotelView();
    CustomerView customerView = new CustomerView();
    List<HotelType> hotelList = new ArrayList<>();

    @Override
    public void run() {
        int i = 0;
        do {
            access();
            System.out.println("press 1 to continue");
            System.out.println("press 0 to continue");
            i = scanner.nextInt();

        } while (i == 1);
    }

    private void access() {
        System.out.println("1.create the hotel list");
        System.out.println("2.create the customer list");
        System.out.println("3.read the hotel list");

        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                HotelType hotelDetails = hotelView.createHotel(hotelList);
                if(hotelDetails!=null){
                    hotelList.add(hotelDetails);
                }else
                {
                    System.out.println("hotel already exist");
                }
                break;
            case 3:
                hotelView.readHotel(hotelList);
                break;
        }

    }
}
