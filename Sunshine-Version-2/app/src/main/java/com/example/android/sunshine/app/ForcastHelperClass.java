package com.example.android.sunshine.app;

import android.net.Uri;

/**
 * Created by Roi on 06/05/2016.
 */
public class ForcastHelperClass {

    public static Uri uriBuilderOpenWeatherMap(String mID, int numDays){



        String format = "json";
        String units = "metric";

        String appid = "5e4790a7810243336de32ed9e48493c3";


        // Construct the URL for the OpenWeatherMap query
        // Possible parameters are available at OWM's forecast API page, at
        // http://openweathermap.org/API#forecast
        final String FORECAST_BASE_URL = "http://api.openweathermap.org/data/2.5/forecast/daily?";
        final String ID_PARAM = "id";
        final String FORMAT_PARAM = "mode";
        final String UNITS_PARAM = "units";
        final String DAYS_PARAM = "cnt";
        final String APPID_PARAM = "APPID";


        Uri builtUri = Uri.parse(FORECAST_BASE_URL).buildUpon()
                .appendQueryParameter(ID_PARAM, mID)
                .appendQueryParameter(FORMAT_PARAM, format)
                .appendQueryParameter(UNITS_PARAM, units)
                .appendQueryParameter(DAYS_PARAM, Integer.toString(numDays))
                .appendQueryParameter(APPID_PARAM,appid).build();


        return builtUri;
    }


    public static Uri uriLanLagBuilder(String lat, String lag){



        Uri loctionUri = Uri.parse("geo:" + lat + "," + lag);

        return loctionUri;

    }

    public static Uri uriLocationBuilder(String para){

        Uri locationUri = Uri.parse("geo:0,0?q=" + para);

        return locationUri;


    }

}
