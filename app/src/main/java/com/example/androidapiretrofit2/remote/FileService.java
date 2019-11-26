package com.example.androidapiretrofit2.remote;

import com.example.androidapiretrofit2.model.FileINfo;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;

public interface FileService {

    @Multipart
    @PUT("1")
    Call<FileINfo> upload(@Part MultipartBody.Part image);

}
