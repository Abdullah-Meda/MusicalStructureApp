package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        Intent intent = getIntent();

        String songName = intent.getStringExtra("songName");
        String artistName = intent.getStringExtra("artistName");
        int imageResourceId = intent.getIntExtra("imageResourceId", R.drawable.music);

        TextView songView = findViewById(R.id.now_playing_song_text_view);
        TextView artistView = findViewById(R.id.now_playing_artist_text_view);
        ImageView imageView = findViewById(R.id.now_playing_music_image_view);

        songView.setText(songName);
        artistView.setText("By " + artistName);
        imageView.setImageResource(imageResourceId);
    }
}