package com.nrsmac.stormy.weather;

import android.graphics.Color;

import com.nrsmac.stormy.R;

/**
 * Created by nrsmac on 3/5/15.
 */

public class Forecast {
    private Current mCurrent;
    private Hour[] mHourlyForecast;
    private Day[] mDailyForecast;

    public Day[] getDailyForecast() {
        return mDailyForecast;
    }

    public void setDailyForecast(Day[] dailyForecast) {
        mDailyForecast = dailyForecast;
    }

    
    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Hour[] getHourlyForecast() {
        return mHourlyForecast;
    }

    public void setHourlyForecast(Hour[] hourlyForecast) {
        mHourlyForecast = hourlyForecast;
    }

    public static int getIconId(String iconString) {
        int iconId = R.drawable.clear_day;

        if (iconString.equals("clear-day")) {
            iconId = R.drawable.clear_day;
        }
        else if (iconString.equals("clear-night")) {
            iconId = R.drawable.clear_night;
        }
        else if (iconString.equals("rain")) {
            iconId = R.drawable.rain;
        }
        else if (iconString.equals("snow")) {
            iconId = R.drawable.snow;
        }
        else if (iconString.equals("sleet")) {
            iconId = R.drawable.sleet;
        }
        else if (iconString.equals("wind")) {
            iconId = R.drawable.wind;
        }
        else if (iconString.equals("fog")) {
            iconId = R.drawable.fog;
        }
        else if (iconString.equals("cloudy")) {
            iconId = R.drawable.cloudy;
        }
        else if (iconString.equals("partly-cloudy-day")) {
            iconId = R.drawable.partly_cloudy;
        }
        else if (iconString.equals("partly-cloudy-night")) {
            iconId = R.drawable.cloudy_night;
        }

        return iconId;
    }

    public static int getBackgroundColor(String colorKey) {

        String mBackgroundColor;

        if (colorKey.equals("clear-day")) {
            mBackgroundColor = "#FFB300";
        }
        else if (colorKey.equals("clear-night")) {
            mBackgroundColor = "#ff222a36";
        }
        else if (colorKey.equals("rain")) {
            mBackgroundColor = "#3079ab";
        }
        else if (colorKey.equals("snow")) {
            mBackgroundColor = "#b7c0c7";
        }
        else if (colorKey.equals("sleet")) {
            mBackgroundColor = "#888888";
        }
        else if (colorKey.equals("wind")) {
            mBackgroundColor = "#39add1";
        }
        else if (colorKey.equals("fog")) {
            mBackgroundColor = "#C0C0C0";
        }
        else if (colorKey.equals("cloudy")) {
            mBackgroundColor = "#C0C0C0";
        }
        else if (colorKey.equals("partly-cloudy-day")) {
            mBackgroundColor = "#FFB300";
        }
        else if (colorKey.equals("partly-cloudy-night")) {
            mBackgroundColor = "#ff222a36";
        } else {
            mBackgroundColor = "#ffffffff";
        }

        String color = mBackgroundColor;
        int colorAsInt;
        colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }

}
