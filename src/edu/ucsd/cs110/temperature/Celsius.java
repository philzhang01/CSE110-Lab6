package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float value = this.getValue();

        Celsius toReturn = new Celsius(value);
        return toReturn;
    }

    @Override
    public Temperature toFahrenheit() {
        float value = this.getValue();
        value = value*9/5+32;
        Fahrenheit toReturn = new Fahrenheit(value);
        return toReturn;
    }

    public String toString()
    {
        // TODO: Complete this method
        float value = this.getValue();
        String toReturn = " C";
        return value+toReturn;
    }
}