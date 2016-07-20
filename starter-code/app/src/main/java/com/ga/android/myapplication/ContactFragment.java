package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by davidstone on 7/20/16.
 */
public class ContactFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(android.R.layout.simple_list_item_1,container, false);
        TextView textView = (TextView) view.findViewById(android.R.id.text1);
        textView.setText("Phone: (987)437-6543\nEmail: davehstone@gmail.com\nLinkedIn: https://www.linkedin.com/in/dave-stone");
        return view;
    }


}
