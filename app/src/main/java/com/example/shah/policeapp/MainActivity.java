package com.example.shah.policeapp;

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

    public void website(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sindhpolice.gov.pk/"));
        startActivity(browserIntent);
    }

    public void twitter(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/sindhpolicedmc"));
        startActivity(browserIntent);
    }

    public void linkedin(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/company/sindh-police-digital-media"));
        startActivity(browserIntent);
    }

    public void instagram(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/policesindh"));
        startActivity(browserIntent);
    }


    public void facebook(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/sindhpolicedmc/"));
        startActivity(browserIntent);
    }


    public void youtube(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UChlhwMjYOycJu3gG3kYfIKQ"));
        startActivity(browserIntent);
    }


    public void contact(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/RizwanAlikhanRizz"));
        startActivity(browserIntent);
    }


}
