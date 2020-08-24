package com.alirnp.implementaion.interfaces;

import com.alirnp.implementaion.models.User;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("/users/{username}")
    Call<User> getUsers(@Path("username") String username);

}
