package com.example.photojor.Utils;

import com.example.photojor.model.ServIngrResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {
    @Multipart
    @POST("/api/test")
    Call<ServIngrResponse> uploadImage(@Part MultipartBody.Part filePart);
}
