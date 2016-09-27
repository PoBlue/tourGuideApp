package com.blues.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;

/**
 * Created by blues on 2016/9/26.
 */

public class CategoryAdapter extends FragmentPagerAdapter  {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new HotPlaceFragment();
        } else if (position == 1){
            return new HotelFragment();
        } else if (position == 2){
            return new ShopingFragment();
        } else {
            return new RestaurantsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString(R.string.hot_place_tag);
        } else if (position == 1){
            return mContext.getString(R.string.hotel_tag);
        } else if (position == 2){
            return mContext.getString(R.string.shoping_tag);
        } else {
            return mContext.getString(R.string.restaurant_tag);
        }
    }
}
