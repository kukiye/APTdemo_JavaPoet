package com.derry.new_modular_javapoet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.derry.arouter_annotations.ARouter;

@ARouter(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startMainActivity3(View view) {
        Class startClass = MainActivity3$$$$$$$$$ARouter.findTargetClass("/app/MainActivity3");
        startActivity(new Intent(this, startClass));
    }
}