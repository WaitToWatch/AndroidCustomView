package com.allen.androidcustomview;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.allen.androidcustomview.widget.WaveAnimatorView;
import com.allen.androidcustomview.widget.WaveViewByBezier;

public class WaveByBezierActivity extends AppCompatActivity {

    private WaveAnimatorView waveAnimatorView;
    private WaveViewByBezier waveViewByBezier;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wave_by_bezier);

        waveAnimatorView = (WaveAnimatorView) findViewById(R.id.wave_animator);

        waveViewByBezier = (WaveViewByBezier) findViewById(R.id.wave_bezier);
    }

    @Override
    protected void onPause() {
        super.onPause();
        waveViewByBezier.pauseAnimation();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        waveViewByBezier.resumeAnimation();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        waveViewByBezier.resumeAnimation();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        waveViewByBezier.stopAnimation();
    }
}
