package com.example.android.quakereport;

public class Earthquake {
    // Magnitude of the earthquake
    private final String mMagnitude;

    // location of the earthquake
    private final String mLocation;

    // Date of the earthquake
    private final String mDate;
    /*
     * Create a new Earthquake object.
     *
     * @param magnitude is the magnitude of the earthquake
     * @param location is the location of the earthquake
     * @param date is the date of the earthquake
     * */
    public Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     * Get the magnitude of the earthquake
     */
    public String getMmagnitude() {
        return mMagnitude;
    }

    /**
     * Get the location of the earthquake
     */
    public String getMlocation() {
        return mLocation;
    }

    /**
     * Get the date of the earthquake
     */
    public String getMdate() {
        return mDate;
    }


}
