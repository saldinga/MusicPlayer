package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaylistActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        myToolbar.setTitle(R.string.playlists);

        ArrayList<Song> playlist = new ArrayList<>();
        playlist.add(new Song("Number of tracks: 10", "love songs", "40:15"));
        playlist.add(new Song("Number of tracks: 15", "jazz", "58:15"));
        playlist.add(new Song("Number of tracks: 12", "Relax", "47:25"));
        playlist.add(new Song("Number of tracks: 8", "Best of 90's", "23:00"));
        playlist.add(new Song("Number of tracks: 5", "For running", "19:12"));
        playlist.add(new Song("Number of tracks: 7", "Work", "26:59"));
        playlist.add(new Song("Number of tracks: 4", "Slow", "15:30"));
        playlist.add(new Song("Number of tracks: 1", "Dance", "3:20"));
        playlist.add(new Song("Number of tracks: 2", "Classical", "6:15"));
        playlist.add(new Song("Number of tracks: 9", "Instrumental", "35:12"));

        SongAdapter playlistAdapter = new SongAdapter(this, playlist);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(playlistAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navigation, menu);
        menu.getItem(3).setVisible(false);
        return true;
    }
}
