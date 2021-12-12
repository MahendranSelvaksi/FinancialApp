package com.financial.bala.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.financial.bala.R;
import com.financial.bala.utility.BaseActivity;


public class SplashActivity extends BaseActivity {
    ImageView logoImg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        logoImg = findViewById(R.id.splash_logo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 100ms
              /*  if (new AppSessionManager(SplashActivity.this).isEmailID()) {
                    Intent nextIntent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(nextIntent);
                    finishAffinity();
                } else {*/
                Intent nextIntent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(nextIntent);
                finishAffinity();
                //}

            }
        }, 2000);
    }


    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
