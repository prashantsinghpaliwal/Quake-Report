package com.example.android.quakereport;



class Earthquake {
    private String mMag,url;
    private String mLoc,mDate,mTime;



    public Earthquake(String mMag, String mLoc, String mDate, String mTime, String url) {
        this.mDate = mDate;
        this.mLoc = mLoc;
        this.mMag = mMag;
        this.mTime=mTime;
        this.url=url;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmLoc() {
        return mLoc;
    }

    public String getmMag() {
        return mMag;
    }

    public String getmTime() {
        return mTime;
    }

    public String getUrl() {
        return url;
    }
}
