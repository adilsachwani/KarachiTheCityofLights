package com.example.dell.karachi_thecityoflights;

public class Place {

    private String placeName;
    private String placeYear;
    private int placeImage;

    public Place(String placeName, String placeYear, int placeImage){

        this.placeName = placeName;
        this.placeYear = placeYear;
        this.placeImage = placeImage;

    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceYear() {
        return placeYear;
    }

    public int getPlaceImage() {
        return placeImage;
    }

}
