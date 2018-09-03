package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static java.lang.String.valueOf;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes)
    {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the earthquake_list_item.xml layout with the ID version_name
        TextView magniudeView = (TextView) listItemView.findViewById(R.id.magnitude_textview);

        // set this text on the name TextView
        magniudeView.setText(currentEarthquake.getMagnitude());

        // Find the TextView in the earthquake_list_item.xml layout with the ID version_number
        TextView locationView = (TextView) listItemView.findViewById(R.id.location_textview);
        // set this text on the number TextView
        locationView.setText(currentEarthquake.getCity());

        // date
        // 1. Create a Date object, the Date constructor takes in a long
        Date quakeDate = new Date(currentEarthquake.getTimeInMilliseconds());
        // 2. Set up the TextView for displaying the date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date_textview);
        // 4. Get a formatted date with the Date object into a String using a helper method
        String formattedDate = formatDate(quakeDate);
        // 5. Display the formatted date in a TextView
        dateView.setText(formattedDate);

        // time
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        String formattedTime = formatTime(quakeDate);
        timeView.setText(formattedTime);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

    // create helper methods to format the date and time (Step 3 of formatting the date)
    private String formatDate(Date dateObject)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);  // SimpleDateFormat.format(Date) returns a String
    }

    private String formatTime(Date dateObject)
    {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a"); // (hour:minute am/pm)
        return timeFormat.format(dateObject);
    }


}
