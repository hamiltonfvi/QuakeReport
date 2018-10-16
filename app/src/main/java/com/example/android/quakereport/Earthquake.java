package com.example.android.quakereport;

public class Earthquake {

    /**
     * Magnitude of the Earthquake
     */
    private double mMagnitude;

    /**
     * Location of the Earthquake
     */
    private String mLocation;

    /**
     * Time of the earthquake
     */
    private long mTimeInMilliseconds;

    /**
     * URL of the earthquake
     */
    private String mUrl;

    /**
     * @param magnitude is the magnitude of the earthquake
     * @param location  is the location of the earthquake
     * @param timeInMilliseconds      is the date of the earthquake in UnixTime
     * @param url is the url of the earthquake
     */

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Get the Magnitude of the Earthquake.
     */

    public double getMagnitude() {
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

    /**
     * Get the Url of the Earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
