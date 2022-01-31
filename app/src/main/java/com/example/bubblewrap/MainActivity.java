package com.example.bubblewrap;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    MediaPlayer mediaPlayer;


 public void refill(View view){
     GridLayout gridLayout= findViewById(R.id.grid);
     for(int i=0;i<gridLayout.getChildCount();i++){
         ImageView image=(ImageView) gridLayout.getChildAt(i);
         image.setImageResource(R.drawable.img_1);
         image.setEnabled(true);
     }

 }
    public void pop(View view){

        imageView=(ImageView) view;

        imageView.setImageResource(R.drawable.img_2);
        mediaPlayer.start();
        imageView.setEnabled(false);
//        Timer buttonTimer = new Timer();
//        buttonTimer.schedule(new TimerTask() {
//
//            @Override
//            public void run() {
//                runOnUiThread(new Runnable() {
//
//                    @Override
//                    public void run() {
//                        imageView.setEnabled(true);
//                        imageView.setImageResource(R.drawable.img_1);
//                        Log.d(TAG,"resend1");
//                    }
//                });
//            }
//        }, 2000);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer=MediaPlayer.create(this,R.raw.bubble);
    }
}