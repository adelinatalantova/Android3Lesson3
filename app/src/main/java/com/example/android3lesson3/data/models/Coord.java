
package com.example.android3lesson3.data.models;

import com.google.gson.annotations.SerializedName;

public class Coord {

    @SerializedName("lat")
    private Double mLat;
    @SerializedName("lon")
    private Double mLon;

    public Double getLat() {
        return mLat;
    }

    public void setLat(Double lat) {
        mLat = lat;
    }

    public Double getLon() {
        return mLon;
    }

    public void setLon(Double lon) {
        mLon = lon;
    }

}
