package com.example.youtubeplayerforspecificvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        YouTubePlayerView youTubePlayerView1 = findViewById(R.id.youtube_player_view1);
        YouTubePlayerView youTubePlayerView2 = findViewById(R.id.youtube_player_view2);
        YouTubePlayerView youTubePlayerView3 = findViewById(R.id.youtube_player_view3);
        YouTubePlayerView youTubePlayerView4 = findViewById(R.id.youtube_player_view4);
        getLifecycle().addObserver(youTubePlayerView);
        getLifecycle().addObserver(youTubePlayerView1);
        getLifecycle().addObserver(youTubePlayerView2);
        getLifecycle().addObserver(youTubePlayerView3);
        getLifecycle().addObserver(youTubePlayerView4);
    }
}
