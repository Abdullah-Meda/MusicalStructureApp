package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        ArrayList<Music> songs = new ArrayList<>();
        songs.add(new Music("Run Wild2", "FRENSHIP", R.drawable.run_wild));
        songs.add(new Music("Blue Lounge", "Just Simon", R.drawable.blue_lounge));
        songs.add(new Music("Feeling Pretty Good", "Deorro", R.drawable.feeling_pretty_good));
        songs.add(new Music("On My Mind", "3LAU", R.drawable.on_my_mind));
        songs.add(new Music("I Don't Care", "Justin Beiber", R.drawable.i_dont_care));
        songs.add(new Music("HUMBLE", "Kendrick Lamar", R.drawable.kendrick_lamar));
        songs.add(new Music("Savage Remix", "Megan Thee Stallion", R.drawable.savage_remix));
        songs.add(new Music("I Can't Give Everything Away", "David Bowie", R.drawable.i_cant_give_everything_away));

        MusicAdapter adapter = new MusicAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
                Intent to_now_playing = new Intent(LibraryActivity.this, NowPlayingActivity.class);
                Music itemAtPosition = (Music) adapter.getItemAtPosition(position);
                to_now_playing.putExtra("songName", itemAtPosition.getSongName());
                to_now_playing.putExtra("artistName", itemAtPosition.getArtistName());
                to_now_playing.putExtra("imageResourceId", itemAtPosition.getImageResourceId());
                startActivity(to_now_playing);
            }
        });

    }

}
