package com.example.android.musicalstructureapp;

public class Music {

    private String mSongName;

    private String mArtistName;

    private int mImageResourceId;


    public Music(String SongName, String ArtistName, int imageResourceId) {
        mSongName = SongName;
        mArtistName = ArtistName;
        mImageResourceId = imageResourceId;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}
