package com.example.bubblewrap;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    MediaPlayer mediaPlayer;
    Handler handler = new Handler();
    Runnable runnable;


    public void pop(View view){

        imageView=(ImageView) view;

        imageView.setImageResource(R.drawable.img_2);
        mediaPlayer.start();
        imageView.setEnabled(false);
        imageView.postDelayed(new Runnable() {
            public void run() {
                imageView.setEnabled(true);
                imageView.setImageResource(R.drawable.img_1);
                Log.d(TAG,"resend1");
            }
        },2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer=MediaPlayer.create(this,R.raw.bubble);
    }
}