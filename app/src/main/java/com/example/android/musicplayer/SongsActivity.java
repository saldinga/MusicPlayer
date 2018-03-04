package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        TextView title = findViewById(R.id.activityTitle);
        title.setText(R.string.songs);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Sting", "if i ever loose my faith in you", "4:29"));
        songs.add(new Song("*NSYNC", "tearin' up my heart", "3:29"));
        songs.add(new Song("*NSYNC", "i want you back", "3:20"));
        songs.add(new Song("*NSYNC", "bye bye bye", "3:20"));
        songs.add(new Song("Lorde", "everybody wants to rule the world", "2:35"));
        songs.add(new Song("Aistė Smilgevičiūtė", "60", "4:20"));
        songs.add(new Song("Script", "superheroes", "4:05"));
        songs.add(new Song("Sting", "mad about you", "3:54"));
        songs.add(new Song("Sting", "seven days", "4:39"));
        songs.add(new Song("Ed Sheeran", "perfect", "4:20"));


        SongAdapter songAdapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
