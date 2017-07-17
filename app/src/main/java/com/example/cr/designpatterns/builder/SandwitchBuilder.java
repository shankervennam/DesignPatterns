package com.example.cr.designpatterns.builder;

public class SandwitchBuilder
{
    public Sandwitch build(Sandwitch sandwitch, Ingradient ingradient)
    {
        sandwitch.addIngradient(ingradient);
        return sandwitch;
    }
}
