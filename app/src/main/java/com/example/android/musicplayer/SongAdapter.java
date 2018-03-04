package com.example.android.musicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Inga on 2018-03-04.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(@NonNull Context context, @NonNull ArrayList<Song> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songName = listItemView.findViewById(R.id.song_name);
        songName.setText(currentSong.getSongName());

        TextView artistName = listItemView.findViewById(R.id.artist_name);
        artistName.setText(currentSong.getArtistName());

        TextView duration = listItemView.findViewById(R.id.duration);
        duration.setText(currentSong.getDuration());

        return listItemView;
    }
}
