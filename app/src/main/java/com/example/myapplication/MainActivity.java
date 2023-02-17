package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//      VideoView mVideoURL = getIntent().getStringExtra("EXT_URL");
//        Log.i("VIDEO URL", " " + mVideoURL);

        WebView mWebView = findViewById(R.id.v);



        MediaController mc = new MediaController(this);

//     VideoView   mVideoStreamView = (VideoView) findViewById(R.id.vidPlayer);
//
//
//
//
//
//        mVideoStreamView.setVideoURI(Uri.parse(mVideoURL));
//        mVideoStreamView.setMediaController(mc);
//        mVideoStreamView.requestFocus();
//        mVideoStreamView.start();



                mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setPluginState(WebSettings.PluginState.ON);

        mWebView.loadData("<html><body>Hello, world!   <iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/RcOLNfUb0ak\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe> </body></html>",
                "text/html", "UTF-8");

                // mWebView.loadUrl();
        mWebView.setWebChromeClient(new WebChromeClient());
//


    }
}