package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class NowPlayingActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navigation, menu);
        menu.getItem(4).setVisible(false);
        return true;
    }
}
