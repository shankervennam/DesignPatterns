package com.example.cr.designpatterns.factory;

public class BreadFactory
{
    public Bread getBread(String bread)
    {
        if(bread.equals("BRI"))
        {
            return new Brioche();
        }
        else  if(bread.equals("BAG"))
        {
            return new Baguette();
        }
        else if(bread.equals("ROLL"))
        {
            return new Roll();
        }
        return null;
    }
}
