package com.example.cr.designpatterns.activity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.cr.designpatterns.R;
import com.example.cr.designpatterns.builder.Bagel;
import com.example.cr.designpatterns.builder.Egg;
import com.example.cr.designpatterns.builder.Salt;
import com.example.cr.designpatterns.builder.Sandwitch;
import com.example.cr.designpatterns.builder.SandwitchBuilder;

public class BuilderActivity extends AppCompatActivity implements View.OnClickListener
{
    CheckBox cress_box, bagel_box, salt_box, egg_box;
    public TextView textView;
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.builder_pattern);

        cress_box = (CheckBox) findViewById(R.id.cress);
        bagel_box = (CheckBox) findViewById(R.id.bagel);
        salt_box = (CheckBox) findViewById(R.id.bun);
        egg_box = (CheckBox) findViewById(R.id.egg);
        textView = (TextView) findViewById(R.id.display_builder);
        button = (Button) findViewById(R.id.builder_ok);
    }

    public void onClick(View v)
    {
        SandwitchBuilder builder = new SandwitchBuilder();
        Sandwitch sandwitch = new Sandwitch();

        if(bagel_box.isChecked())
        {
            sandwitch = builder.build(sandwitch, new Bagel());
        }

        if(egg_box.isChecked())
        {
            sandwitch = builder.build(sandwitch, new Egg());
        }
        if (salt_box.isChecked())
        {
            sandwitch = builder.build(sandwitch, new Salt());
        }
        textView.setText(new StringBuilder().append(sandwitch.getSandwitch()).append(sandwitch.getKcal()).toString());
    }
}
