package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by Inga on 2018-03-06.
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_songs:
                Intent i1 = new Intent(this, SongsActivity.class);
                startActivity(i1);
                return true;
            case R.id.menu_albums:
                Intent i2 = new Intent(this, AlbumActivity.class);
                startActivity(i2);
                return true;
            case R.id.menu_artists:
                Intent i3 = new Intent(this, ArtistsActivity.class);
                startActivity(i3);
                return true;
            case R.id.menu_nowplaying:
                Intent i4 = new Intent(this, NowPlayingActivity.class);
                startActivity(i4);
                return true;
            case R.id.menu_playlists:
                Intent i5 = new Intent(this, PlaylistActivity.class);
                startActivity(i5);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
