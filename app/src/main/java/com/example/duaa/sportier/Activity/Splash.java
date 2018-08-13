package com.example.duaa.sportier.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.duaa.sportier.R;

public class Splash extends AppCompatActivity {

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        context = Splash.this;
        new Loading().execute();

    }

    public class Loading extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
//            if (ApplicationController.getInstance().IsUserLoggedIn()) {
//                Intent intent = new Intent(context, SplashSliderActivity.class);
//                startActivity(intent);
//                finish();
//            } else {

//                prefManager = new PrefManager(SplashActivity.this);
//                if (prefManager.isFirstTimeLaunch()) {
//                    prefManager.setFirstTimeLaunch(false);
//                    SplashActivity.this.startActivity(new Intent(SplashActivity.this, IntroActivity.class));
//                    SplashActivity.this.finish();
//                } else {
                    Intent intent = new Intent(context, MainActivity.class);
//                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    Splash.this.startActivity(intent);
                    Splash.this.finish();
//                }
//            }

        }
    }


    // Configuration in Android API 21 to set window to full screen.
//    @Override
//    public void onWindowFocusChanged(boolean hasFocus) {
//        super.onWindowFocusChanged(hasFocus);
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
//            if (hasFocus) {
//                getWindow().getDecorView()
//                        .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
//                                | View.SYSTEM_UI_FLAG_FULLSCREEN
//                                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
//            }
//        }
//    }
}


