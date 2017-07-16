package com.example.cr.designpatterns.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cr.designpatterns.R;
import com.example.cr.designpatterns.factory.Bread;
import com.example.cr.designpatterns.factory.BreadFactory;

public class FactoryActivity extends AppCompatActivity implements View.OnClickListener
{
    Button brioche, baguette, roll;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factory_pattern);
        textView = (TextView) findViewById(R.id.text_view);
        brioche = (Button) findViewById(R.id.brioche);
        baguette = (Button) findViewById(R.id.baguette);
        roll = (Button) findViewById(R.id.roll);
        baguette.setOnClickListener(this);
        brioche.setOnClickListener(this);
        roll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        BreadFactory b = new BreadFactory();
        String temp = null;

        switch(v.getId())
        {
            case R.id.brioche:  temp = "BRI"; break;
            case R.id.baguette:  temp = "BAG"; break;
            case R.id.roll:      temp = "ROLL"; break;
        }
        Bread bread = b.getBread(temp);
        textView.setText(new StringBuilder().append(bread.name()).toString());
    }
}
