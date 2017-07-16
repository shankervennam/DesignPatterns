package com.example.cr.designpatterns.factory;

public class Baguette implements Bread
{
    @Override
    public String name()
    {
        return "Baguette";
    }

    @Override
    public String calories()
    {
        return "70Kcal";
    }
}
