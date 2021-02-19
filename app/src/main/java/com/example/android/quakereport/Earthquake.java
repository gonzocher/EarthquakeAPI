package com.example.android.quakereport;

import java.util.Date;

public class Earthquake {
    // Magnitude of the earthquake
    private final double mMagnitude;

    // location of the earthquake
    private final String mLocation;

    // Date of the earthquake
    private long mTimeInMilliseconds;

    //URL of the earthquake
    private String mUrl;

    /*
     * Create a new Earthquake object.
     *
     * @param magnitude is the magnitude of the earthquake
     * @param location is the location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds of the earthquake from the Epoch
     * */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Get the magnitude of the earthquake
     */
    public double getMmagnitude() {
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
     * @return
     */
    public long getMtimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Get the URL of the earthquake
     * @return
     */
    public String getMurl() { return mUrl;}


}
