package com.blues.tourguideapp;

/**
 * Created by blues on 2016/9/23.
 */

public class Location {
    private String mAddress;
    private String mName;
    private String mOpentime;

    private final static int NO_IMAGE = -1;
    private int mImageResourceId = NO_IMAGE;

    public Location(String address,String name,String openTime,int imageResourceId){
        mAddress = address;
        mName = name;
        mOpentime = openTime;
        mImageResourceId = imageResourceId;
    }

    public Location(String address,String name,String openTime){
        mAddress = address;
        mName = name;
        mOpentime = openTime;
    }

    public String getName(){
        return mName;
    }

    public String getAddress(){
        return mAddress;
    }

    public String getOpentime(){
        return mOpentime;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE;
    }

}
