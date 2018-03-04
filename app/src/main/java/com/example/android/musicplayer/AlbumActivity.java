package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        TextView title = findViewById(R.id.activityTitle);
        title.setText(R.string.albums);

        ArrayList<Song> albums = new ArrayList<>();
        albums.add(new Song("Sting", "Ten Summoner's Tales", "48:15"));
        albums.add(new Song("Ed Sheeran", "x (Deluxe Edition)", "58:15"));
        albums.add(new Song("Bruno Mars", "24K magic", "47:25"));
        albums.add(new Song("Justin Timberlake", "Say Something", "23:00"));
        albums.add(new Song("Rihanna", "DAMN", "19:12"));
        albums.add(new Song("Bob Marley", "Kaya", "26:59"));
        albums.add(new Song("Imagine Dragons", "Evolve", "15:30"));
        albums.add(new Song("P!nk", "what about us", "3:20"));
        albums.add(new Song("Destiny's Child", "Survivor", "6:15"));
        albums.add(new Song("Backstreet Boys", "black & blue", "35:12"));

        SongAdapter albumAdapter = new SongAdapter(this, albums);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(albumAdapter);
    }
}
