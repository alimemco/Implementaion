package com.alirnp.implementaion.ui;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.alirnp.implementaion.R;
import com.alirnp.implementaion.base.MyApplication;
import com.alirnp.implementaion.interfaces.ApiService;
import com.alirnp.implementaion.models.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Inject;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Inject
    ApiService apiService ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication)getApplication()).getApiServiceComponent().inject(this);

        apiService.getUsers("alipapital")
                .enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(@NonNull Call<User> call, @NonNull Response<User> response) {
                        if (response.isSuccessful() && response.body() != null){
                            User user = response.body() ;

                            Toast.makeText(MainActivity.this, user.getName(), Toast.LENGTH_SHORT).show();
                        }else {
                            showError("Is Not Successful");
                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<User> call,@NonNull Throwable t) {
                        showError(t.getMessage());
                    }
                });




    }

    private void showError(String message) {
        Toast.makeText(MainActivity.this,message, Toast.LENGTH_SHORT).show();
    }

}