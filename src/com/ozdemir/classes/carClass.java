package com.ozdemir.classes;

public class carClass
{
    private int doors;
    private int wheels;
    private String model;
    private String engine;

    public int getDoors()
    {
        return doors;
    }

    public void setDoors(int doors)
    {
        this.doors = doors;
    }

    public int getWheels()
    {
        return wheels;
    }

    public void setWheels(int wheels)
    {
        this.wheels = wheels;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        String validModel = model.toLowerCase();
        if (validModel.equals("shelby") || validModel.equals("urus"))                               //We restricted models. Only 2 model allowed
        {
            this.model = model;
        }else {
            this.model = "Not Allowed.";
        }
    }

    public String getEngine()
    {
        return engine;
    }

    public void setEngine(String engine)
    {
        this.engine = engine;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    private String colour;
}
