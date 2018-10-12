package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);

        // Create a fake list of earthquake locations.
        final ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("5.1", "San Francisco", "Feb 20, 2016"));
        earthquakes.add(new Earthquake("6.6", "London", "Dec 15, 2012"));
        earthquakes.add(new Earthquake("2.3", "Tokyo", "Jan 01, 2013"));
        earthquakes.add(new Earthquake("4.4", "Mexico City", "May 05, 2015"));
        earthquakes.add(new Earthquake("2.3", "Moscow", "Oct 12, 2018"));
        earthquakes.add(new Earthquake("1.5", "Rio de Janeiro", "March 14, 2014"));
        earthquakes.add(new Earthquake("4.1", "Paris", "Apr 30, 2012"));

        // Find a reference to the {@link ListView} in the layout
        QuakeAdapter adapter = new QuakeAdapter(this, earthquakes);

        // Create a new adapter that takes the list of the earthquakes as input.
        ListView listView = findViewById(R.id.listview_earthquake);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        listView.setAdapter(adapter);

    }

}