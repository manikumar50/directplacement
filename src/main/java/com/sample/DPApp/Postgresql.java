package com.sample.DPApp;

public class Postgresql implements Database
{
    @Override
    public void connection()
    {
        System.out.println("postgresql is connected...");
    }
}