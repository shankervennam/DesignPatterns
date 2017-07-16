package com.example.cr.designpatterns.factory;

public class Roll implements Bread
{
    @Override
    public String name()
    {
        return "Roll";
    }

    @Override
    public String calories()
    {
        return "100kcal";
    }
}
