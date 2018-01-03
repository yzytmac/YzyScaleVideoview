package com.example.yzy.yzyscalevideoview;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private YzyScaleVideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVideoView = (YzyScaleVideoView) findViewById(R.id.id_vv);
        mVideoView.post(new Runnable() {
            @Override
            public void run() {
                mVideoView.setFixedSize(mVideoView.getWidth(), mVideoView.getHeight());
                mVideoView.invalidate();
                mVideoView.setVideoPath("https://raw.githubusercontent.com/yzytmac/YzyScaleVideoview/master/桂林.mp4");
                mVideoView.start();
            }
        });
    }
}
