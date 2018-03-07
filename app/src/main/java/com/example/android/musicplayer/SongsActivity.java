package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        myToolbar.setTitle(R.string.songs);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Sting", "if i ever loose my faith in you", "4:29"));
        songs.add(new Song("*NSYNC", "tearin' up my heart", "3:29"));
        songs.add(new Song("*NSYNC", "i want you back", "3:20"));
        songs.add(new Song("*NSYNC", "bye bye bye", "3:20"));
        songs.add(new Song("Aistė Smilgevičiūtė", "60", "4:20"));
        songs.add(new Song("Script", "superheroes", "4:05"));
        songs.add(new Song("Sting", "mad about you", "3:54"));
        songs.add(new Song("Sting", "seven days", "4:39"));
        songs.add(new Song("Ed Sheeran", "perfect", "4:20"));

        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navigation, menu);
        menu.getItem(0).setVisible(false);
        return true;
    }
}
