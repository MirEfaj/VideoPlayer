package com.efaj.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    WebView myWeb;
    LinearLayout song1,song2,song3,song4,song5,song6,song7,song8,song9,song10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWeb = findViewById(R.id.myWeb);
        myWeb.getSettings().setJavaScriptEnabled(true);


        //...............................................................
        song1 =findViewById(R.id.song1);
        song2 =findViewById(R.id.song2);
        song3 =findViewById(R.id.song3);
        song4 =findViewById(R.id.song4);
        song5 =findViewById(R.id.song5);
        song6 =findViewById(R.id.song6);
        song7 =findViewById(R.id.song7);
        song8 =findViewById(R.id.song8);
        song9 =findViewById(R.id.song9);
        song10 =findViewById(R.id.song10);




//...................................................................................
        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWeb.loadUrl("https://www.youtube.com/embed/UTx4fSMaYus");
            }
        });

        ///...................................................................


        song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWeb.loadUrl("https://www.youtube.com/embed/rMI9xmWlk1s");
            }
        });

        //.........................................................................


        song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWeb.loadUrl("https://www.youtube.com/embed/dG8n5xdeadI");
            }
        });
//...................................................................................
        song4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWeb.loadUrl("https://www.youtube.com/embed/NtpZEBEVf9U");
            }
        });



        //............5.............................................................


        song5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWeb.loadUrl("https://www.youtube.com/embed/LolUVl3nSu4");
            }
        });
//................................6...................................................
        song6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWeb.loadUrl("https://www.youtube.com/embed/_b_fXw4MLqA");
            }
        });

        ///............7.......................................................


        song7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWeb.loadUrl("https://www.youtube.com/embed/UmCFXk9ss2s");
            }
        });

        //..................8.......................................................


        song8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWeb.loadUrl("https://www.youtube.com/embed/3HeBXE8Wn0w");
            }
        });
        //......................9...................................................


        song9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWeb.loadUrl("https://www.youtube.com/embed/nuF0W4LOw7Q");
            }
        });
        ///.................10..................................................


        song10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWeb.loadUrl("https://www.youtube.com/embed/lZdkWrPhXqA");
            }
        });

    }
}