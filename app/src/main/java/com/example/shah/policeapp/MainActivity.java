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

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/sindh-police-digital-media-b751a119a"));
        startActivity(browserIntent);
    }

    public void instagram(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/policesindh"));
        startActivity(browserIntent);
    }


    public void facebook(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/pages/category/Government-Organization/Sindh-Police-CPO-1905216799716807/"));
        startActivity(browserIntent);
    }


    public void youtube(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCRsS4qUxeej46Z8KNSNp9fA"));
        startActivity(browserIntent);
    }


    public void contact(View view) {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/RizwanAlikhanRizz"));
        startActivity(browserIntent);
    }


}
