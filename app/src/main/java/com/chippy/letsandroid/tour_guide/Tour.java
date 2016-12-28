package com.chippy.letsandroid.tour_guide;

/**
 * Created by chippy on 2016-12-23.
 */

public class Tour {

    private String mName;
    private String mAddress;
    private String mDetail;
    // Drawable resource ID
    private int mImageResourceId;

    public Tour(String name, String address, String detail, int imageResourceId)
    {
        mName = name;
        mAddress= address;
        mImageResourceId = imageResourceId;
        mDetail = detail;
    }

    /**
     * Get the name
     */
    public String getName() {
        return mName;
    }

    /**
     * Get THE ADDRESS
     */
    public String getAddress() {
        return mAddress;
    }
    public String getDetail() {
        return mDetail;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
