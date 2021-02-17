/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * EarthquakeActivity shows a list of earthquake events.
 * For each earthquake, display the magnitude, location, and date.
 */
public class EarthquakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        //Create an ArrayList of Earthquake objects
        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("4.0","San Francisco","Feb 2, 2019"));
        earthquakes.add(new Earthquake("4.2","London","Feb 2, 2019"));
        earthquakes.add(new Earthquake("3.6","Tokyo","Feb 2, 2019"));
        earthquakes.add(new Earthquake("4.8","Mexico City","Feb 2, 2019"));
        earthquakes.add(new Earthquake("5.5","Moscow","Feb 2, 2019"));
        earthquakes.add(new Earthquake("4.6","Rio de Janeiro","Feb 2, 2019"));
        earthquakes.add(new Earthquake("2.1","Paris","Feb 2, 2019"));

        // Create an EarthquakeArrayAdapter, whose data source is a list of
        // Earthquakes. The adapter knows how to create list item views for each item
        // in the list.
        EarthquakeArrayAdapter earthquakeArrayAdapter = new EarthquakeArrayAdapter(this, earthquakes);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(earthquakeArrayAdapter);
    }
}
