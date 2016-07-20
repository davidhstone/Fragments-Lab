package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by alanjcaceres on 7/19/16.
 */

public class PlaceholderFragment extends Fragment {

   //This is a blank fragment
   //Implement your own version of Fragments for this lab

   public static final String LIST_NUMBER = "list_number";

  // ListView mListView;

   private int position;

   public static Fragment newInstance(int sectionNumber) {
      PlaceholderFragment fragment = new PlaceholderFragment();
      Bundle args = new Bundle();
      args.putInt(LIST_NUMBER, sectionNumber);
      fragment.setArguments(args);

      return fragment;
   }


   @Nullable
   @Override
   public View onCreateView(LayoutInflater inflater,
                            @Nullable ViewGroup container,
                            @Nullable Bundle savedInstanceState) {

      //   ArrayAdapter<String> adapter;

      View view = null;
     // listNumber = getArguments().getInt(LIST_NUMBER, 0);
//
      switch (position) {

         case 0:
            view = inflater.inflate(R.layout.picture_fragment, container, false);
            //     adapter = new ArrayAdapter<>(getContext(),
            //  android.R.layout.simple_list_item_1,
            //  getResources().getStringArray(R.drawable.ic_launcher);
            break;
         case 1:
            //   adapter = new ArrayAdapter<>(getContext(),
            //           android.R.layout.simple_list_item_1,
            //           getResources().getStringArray(R.array.about_me));
            view = inflater.inflate(R.layout.activity_main, container, false);
            TextView aboutMe = (TextView) view.findViewById(R.id.stuff_about_me);
            aboutMe.setText(getResources().getString(R.string.about_me));
            break;
         case 2:
            //   stringAdapter = new ArrayAdapter<>(getContext(),
            //           android.R.layout.simple_list_item_1,
            //           getResources().getStringArray(R.array.contact));
            view = inflater.inflate(R.layout.activity_main, container, false);
            TextView aboutMe2 = (TextView) view.findViewById(R.id.stuff_about_me);
            aboutMe2.setText(getResources().getString(R.string.contact));
            break;
         default:
            break;
         //   View rootView = inflater.inflate(R.layout.fragment_list,
         //           container, false);
         //   mListView = (ListView) rootView.findViewById(R.id.listview_fragment);


      }
      return view;
   }

   @Override
   public void onViewCreated (View view, @Nullable Bundle savedInstanceState) {
      super.onViewCreated(view, savedInstanceState);


   //   ArrayAdapter<String> stringAdapter;
//
   //   listNumber = getArguments().getInt(LIST_NUMBER, 0);
//
   //   switch (listNumber) {
   //      default:
   //      case 0:
   //         adapter = new ArrayAdapter<>(getContext(),
   //                 android.R.layout.simple_list_item_1,
   //                 getResources().getStringArray(R.drawable.ic_launcher);
   //         break;
   //      case 1:
   //         stringAdapter = new ArrayAdapter<>(getContext(),
   //                 android.R.layout.simple_list_item_1,
   //                 getResources().getStringArray(R.array.about_me));
   //         break;
   //      case 2:
   //         stringAdapter = new ArrayAdapter<>(getContext(),
   //                 android.R.layout.simple_list_item_1,
   //                 getResources().getStringArray(R.array.contact));
   //         break;

      }

}
