package com.example.android.quakereport;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/*
 * EarthquakeArrayAdapter is an ArrayAdapter that can provide the layout for each list
 * based on a data source, which is a list of Earthquake objects.
 * */
public class EarthquakeArrayAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOG_TAG = EarthquakeArrayAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param earthquakes A List of AndroidFlavor objects to display in a list
     */
    public EarthquakeArrayAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // The second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, earthquakes);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Earthquake object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID mag
        TextView magTextView = (TextView) listItemView.findViewById(R.id.mag);
        // Get the magnitude from the current Earthquake object and
        // set this text on the mag TextView
        magTextView.setText(currentEarthquake.getMmag());

        // Find the TextView in the list_item.xml layout with the ID location
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);
        // Get the magnitude from the current Earthquake object and
        // set this text on the location TextView
        locationTextView.setText(currentEarthquake.getMlocation());

        // Find the date in the list_item.xml layout with the ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Get the date from the current Earthquake object and
        // set this text on the date TextView
        dateView.setText(currentEarthquake.getMdate());

        // Return the whole list item layout (containing 2 TextViews and an ImageView (right now 3 text views)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
