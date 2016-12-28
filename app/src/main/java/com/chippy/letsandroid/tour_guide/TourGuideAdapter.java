package com.chippy.letsandroid.tour_guide;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TourGuideAdapter extends ArrayAdapter<Tour> {

    public TourGuideAdapter(Activity context, ArrayList<Tour> androidFlavors) {
        super(context, 0, androidFlavors);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_display , parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Tour currentTourGuide = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentTourGuide.getName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        addressTextView.setText(currentTourGuide .getAddress());
        TextView detailTextView = (TextView) listItemView.findViewById(R.id.detail);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        detailTextView.setText(currentTourGuide.getDetail());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentTourGuide.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}

