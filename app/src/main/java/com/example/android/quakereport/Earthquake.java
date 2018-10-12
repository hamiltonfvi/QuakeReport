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
     * Date of the Earthquake
     */
    private String mDate;

    /**
     * @param magnitude is the magnitude of the earthquake
     * @param location  is the location of the earthquake
     * @param date      is the date of the earthquake
     */

    public Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
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
     * Get the Date of the Earthquake.
     */
    public String getDate() {
        return mDate;
    }
}
