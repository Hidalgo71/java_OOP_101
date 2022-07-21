package com.ozdemir.classes;

public class BaseClass
{
    public static void main(String[] args)
    {
        carClass mustang = new carClass();
        carClass holden = new carClass();
        mustang.setModel("Shelby");
        System.out.println("Mustang's model is: " + mustang.getModel());
    }
}