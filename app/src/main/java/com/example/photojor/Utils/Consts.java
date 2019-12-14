package com.example.photojor.Utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;

public class Consts {
    public static GsonBuilder gsonBuilder;
    public static Gson gson;

    public static Retrofit retrofit;
    public static ApiService service;

    public static final String baseUrl="http://2.59.43.166";
}
