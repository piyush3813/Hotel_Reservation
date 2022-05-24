package com.bl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelView {
    public void hotellist(){
        List<HotelType> hotellist=new ArrayList<HotelType>();
        HotelType h1= new HotelType(101,3,"Lakewood",110.0,80);
        HotelType h2= new HotelType(102,4,"Bridgewood",160.0,110);
        HotelType h3= new HotelType(103,5,"Ridgewood",220.0,100);

        hotellist.add(h1);
        hotellist.add(h2);
        hotellist.add(h3);
        System.out.println("hotel-ID    hotel-rating    hotel-name      hotel-prices-regular    hotel-prices-rewarded");

        for (HotelType h:hotellist)
        {
            System.out.println(h.hId+"              "+h.hRating+"            "+h.hName+"              "+h.hrRates+"            "+h.hRewardRates );
        }


    }

}
