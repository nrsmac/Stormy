package com.nrsmac.stormy.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.ActionBarActivity;

import com.nrsmac.stormy.R;
import com.nrsmac.stormy.weather.Hour;

import java.util.Arrays;


public class HourlyForecastActivity extends ActionBarActivity {

    private Hour[] mHours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_forecast);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.HOURLY_FORECAST);
        mHours = Arrays.copyOf(parcelables, parcelables.length, Hour[].class);
    }
}
