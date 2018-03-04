package com.example.android.musicplayer;

import org.apache.commons.text.WordUtils;


/**
 * Created by Inga on 2018-03-03.
 */

public class Song {

    // Song name
    private String mSongName;

    //artist name
    private String mArtistName;

    //duration
    private String mDuration;

    /**
     * Create a new Song object.
     *
     * @param artistName name of the artist
     * @param songName   name of the song
     * @param duration   song duration
     */

    public Song(String artistName, String songName, String duration) {
        mArtistName = artistName;
        mSongName = WordUtils.capitalize(songName);
        mDuration = duration;
    }

    /**
     * Get the name of the artist
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the name of the song
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the name of the song
     */
    public String getDuration() {
        return mDuration;
    }
}
