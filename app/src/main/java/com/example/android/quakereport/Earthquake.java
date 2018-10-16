package com.example.android.quakereport;

public class Earthquake {

    /**
     * Magnitude of the Earthquake
     */
    private String mMagnitude;

    /**
     * Location of the Earthquake
     */
    private String mLocation;

    /**
     * Time of the earthquake
     */
    private long mTimeInMilliseconds;

    /**
     * @param magnitude is the magnitude of the earthquake
     * @param location  is the location of the earthquake
     * @param timeInMilliseconds      is the date of the earthquake in UnixTime
     */

    public Earthquake(String magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /**
     * Get the Magnitude of the Earthquake.
     */

    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the Location of the Earthquake.
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the Date and time of the Earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
