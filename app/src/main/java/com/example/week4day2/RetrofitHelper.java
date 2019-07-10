package com.example.week4day2;


import com.example.week4day2.Flickr.FlickrApiObservableService;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.week4day2.UrlConstants.BaseURL;

public class RetrofitHelper {

    // builds and establish connection to api
    public Retrofit getRetrofitInstance() {

        return new Retrofit.Builder().baseUrl(BaseURL).addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
    }
    public FlickrApiObservableService getFlickrObservableService(){

        return getRetrofitInstance().create(FlickrApiObservableService.class);
    }
}
