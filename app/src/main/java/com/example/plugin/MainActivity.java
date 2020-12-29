package com.example.plugin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.meituan.android.walle.WalleChannelReader;

public class MainActivity extends AppCompatActivity {

    private TextView tvContent;
    private TextView tvChannel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 或者也可以直接根据key获取
        String channel = WalleChannelReader.getChannel(this.getApplicationContext());
        tvChannel = findViewById(R.id.tv_channel);
        tvChannel.setText(channel);

        tvContent = findViewById(R.id.tv_context);
        tvContent.setText(BuildConfig.APP_KEY);
    }
}