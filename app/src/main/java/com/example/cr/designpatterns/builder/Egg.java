package com.example.cr.designpatterns.builder;

public class Egg extends Filling
{
    @Override
    public String description()
    {
        return "EGG";
    }

    @Override
    public int kcalories()
    {
        return 100;
    }
}
