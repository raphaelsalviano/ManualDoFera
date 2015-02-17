package br.com.ufpb.dispositivosmoveis.manualdofera;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;


public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        startSplashScreen();
    }

    private void startSplashScreen() {
        int TIME_SCREEN = 2500;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,StartScreen.class);
                startActivity(intent);
                finish();
            }
        },TIME_SCREEN);
    }
}
