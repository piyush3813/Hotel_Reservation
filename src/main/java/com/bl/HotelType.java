package com.bl;

public class HotelType {
    private int hId;
    private int hRating;
    private String hName;

    @Override
    public String toString() {
        return "HotelType{" +
                "hId=" + hId +
                ", hRating=" + hRating +
                ", hName='" + hName + '\'' +
                '}';
    }



    public int gethId() {
        return hId;
    }

    public void sethId(int hId) {
        this.hId = hId;
    }

    public int gethRating() {
        return hRating;
    }

    public void sethRating(int hRating) {
        this.hRating = hRating;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }




}
