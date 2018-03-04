package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        TextView title = findViewById(R.id.activityTitle);
        title.setText(R.string.artist);

        ArrayList<Song> artists = new ArrayList<>();
        artists.add(new Song("Number of tracks: 10", "Sting", "40:15"));
        artists.add(new Song("Number of tracks: 15", "Ed Sheeran", "58:15"));
        artists.add(new Song("Number of tracks: 12", "Bruno Mars", "47:25"));
        artists.add(new Song("Number of tracks: 8", "Justin Timberlake", "23:00"));
        artists.add(new Song("Number of tracks: 5", "Rihanna", "19:12"));
        artists.add(new Song("Number of tracks: 7", "Bob Marley", "26:59"));
        artists.add(new Song("Number of tracks: 4", "Imagine Dragons", "15:30"));
        artists.add(new Song("Number of tracks: 1", "P!nk", "3:20"));
        artists.add(new Song("Number of tracks: 2", "Destiny Child", "6:15"));
        artists.add(new Song("Number of tracks: 9", "Backstreet Boys", "35:12"));

        SongAdapter artistAdapter = new SongAdapter(this, artists);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(artistAdapter);
    }
}
