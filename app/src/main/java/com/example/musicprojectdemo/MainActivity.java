package com.example.musicprojectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 请求读写权限
        /*RxPermissions rxPermissions = new RxPermissions(this);
        rxPermissions.request(
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
        ).subscribe(aBoolean -> {
            if (!aBoolean) {
                showToast("缺少存储权限，将会导致部分功能无法使用");
            } else {
                // 获取到读写权限 进行业务操作
                // ...

            }
        });*/
    }
}