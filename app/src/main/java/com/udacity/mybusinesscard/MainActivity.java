package com.udacity.mybusinesscard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*Java code for android:onClick attributes */
    public void facebook_bt(View v) {

        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com"));
        startActivity(i);
    }

    public void twitter_bt(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.twitter.com"));
        startActivity(i);
    }

    public void gplus_bt(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://plus.google.com"));
        startActivity(i);
    }

}
