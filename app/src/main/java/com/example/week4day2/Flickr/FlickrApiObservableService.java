package com.example.week4day2.Flickr;

import android.database.Observable;

import retrofit2.http.GET;
import retrofit2.http.Query;

import static com.example.week4day2.UrlConstants.PATH;

public class FlickrApiObservableService {

    @GET(PATH)
    ////////Pass Flickr POJO here, then grab images from PoJO
    Observable<ParsedFlickrJson> getImagesFromFlickr(


    ){



}
