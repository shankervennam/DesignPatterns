package com.example.cr.designpatterns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cr.designpatterns.activity.BuilderActivity;
import com.example.cr.designpatterns.activity.FactoryActivity;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button factory_pattern = (Button) findViewById(R.id.factory_pattern);
        factory_pattern.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, FactoryActivity.class));
            }
        });

        final Button builder_pattern = (Button) findViewById(R.id.builder_pattern);
        builder_pattern.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, BuilderActivity.class));
            }
        });
    }
}