package com.example.cr.designpatterns.factory;

public class Brioche implements Bread
{

    @Override
    public String name()
    {
        return "Brioche";
    }

    @Override
    public String calories()
    {
        return "60kcal";
    }
}
