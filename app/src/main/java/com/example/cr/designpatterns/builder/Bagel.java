package com.example.cr.designpatterns.builder;


public class Bagel extends Bread
{
    @Override
    public String description()
    {
        return "Bagel";
    }

    @Override
    public int kcalories()
    {
        return 60;
    }
}
