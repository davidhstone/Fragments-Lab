package com.ga.android.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by alanjcaceres on 7/19/16.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    int mPageCount;

    public SectionsPagerAdapter(FragmentManager fm, int pageCount) {
        super(fm);
        mPageCount = pageCount;
    }

    @Override
    public Fragment getItem(int position) {

            //Complete this
        Fragment fragment;
        switch (position){
            case 0:
                fragment = new PlaceholderFragment();
                break;
            case 1:
                fragment = new AboutMeFragment();
                break;
            case 2:
                fragment = new ContactFragment();
                break;
            default: return new PlaceholderFragment();
        }
            return fragment;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        mPageCount = 3;
        return mPageCount;
     //   return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            default:
            case 0:
                return "Picture";
            case 1:
                return "About Me";
            case 2:
                return "Contact";
        }

    }
}
