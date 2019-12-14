package com.example.photojor;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.photojor.Utils.ApiService;
import com.example.photojor.Utils.Consts;
import com.google.gson.GsonBuilder;

import javax.crypto.SecretKey;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Consts.retrofit = new Retrofit.Builder()
                .baseUrl(Consts.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Consts.service = Consts.retrofit.create(ApiService.class);

        Consts.gsonBuilder = new GsonBuilder();
        //Consts.gsonBuilder.registerTypeAdapter(SecretKey.class, new SecretKeyAdapter());
        Consts.gson = Consts.gsonBuilder.create();

        Button button = findViewById(R.id.button);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, List.class);
                startActivity(intent);
            }
        };
        button.setOnClickListener(listener);

    }
}
