package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Songs activity
        TextView songLayout = findViewById(R.id.songs_layout);
        songLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(i);
            }
        });

        //Artist activity
        TextView artistLayout = findViewById(R.id.artist_layout);
        artistLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(i);
            }
        });

        //Albums activity
        TextView albumLayout = findViewById(R.id.albums_layout);
        albumLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(i);
            }
        });

        //Playlist activity
        final TextView playlistLayout = findViewById(R.id.playlist_layout);
        playlistLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(i);
            }
        });


    }


}
