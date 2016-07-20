package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by davidstone on 7/20/16.
 */
public class AboutMeFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(android.R.layout.
                simple_list_item_1,container, false);
        TextView textView = (TextView) view.findViewById(android.R.id.text1);
        textView.setText("Current City: New York\nOccupation: Android Developer in-Training\nWhere: General Assembly");
        return view;
    }
}
