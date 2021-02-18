package com.example.android.quakereport;

import java.util.Date;

public class Earthquake {
    // Magnitude of the earthquake
    private final String mMagnitude;

    // location of the earthquake
    private final String mLocation;

    // Date of the earthquake
    private long mTimeInMilliseconds;
    /*
     * Create a new Earthquake object.
     *
     * @param magnitude is the magnitude of the earthquake
     * @param location is the location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds of the earthquake from the Epoch
     * */
    public Earthquake(String magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
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
     * @return
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }


}
