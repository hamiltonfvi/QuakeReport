package com.example.android.quakereport;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.app.Activity;

import java.util.ArrayList;

public class QuakeAdapter extends ArrayAdapter<Earthquake> {

    public QuakeAdapter(@NonNull Activity context, ArrayList<Earthquake> earthquakes) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        // Get the object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView with view ID magnitude
        TextView magnitudeView = listItemView.findViewById(R.id.magnitude_view);
        // Display the magnitude of the current earthquake in the TextView
        magnitudeView.setText(currentEarthquake.getMagnitude());

        // Find the TextView with view ID location
        TextView placeView = listItemView.findViewById(R.id.location_view);
        // Display the location of the current earthquake in the TextView
        placeView.setText(currentEarthquake.getLocation());

        // Find the TextView with view ID date
        TextView dateView = listItemView.findViewById(R.id.date_view);
        // Display the date of the current earthquake in the TextView
        dateView.setText(currentEarthquake.getDate());

        // Return the list item view tht is now showing the appropriate data
        return listItemView;
    }
}
