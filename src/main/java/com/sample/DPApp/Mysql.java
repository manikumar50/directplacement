package com.sample.DPApp;

public class Mysql implements Database
{
    @Override
    public void connection()
    {
        System.out.println("mysql is connected...");
    }
}
