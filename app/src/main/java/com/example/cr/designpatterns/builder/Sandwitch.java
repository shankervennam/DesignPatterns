package com.example.cr.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Sandwitch
{
    List<Ingradient> ingradientList = new ArrayList<>();
    int kcal =0;

    public void addIngradient(Ingradient i)
    {
        ingradientList.add(i);
    }

    public int getKcal()
    {
        for(Ingradient i: ingradientList)
        {
            kcal = kcal + i.kcalories();
        }
        return kcal;
    }

    public String getSandwitch()
    {
        String sand="";

        for(Ingradient i:ingradientList)
        {
            sand = sand + i.description();
        }
        return sand;
    }
}
