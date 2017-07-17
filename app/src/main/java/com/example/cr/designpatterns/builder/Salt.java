package com.example.cr.designpatterns.builder;

public class Salt implements Ingradient
{
    @Override
    public String description()
    {
        return "SALT";
    }

    @Override
    public int kcalories()
    {
        return 20;
    }
}
