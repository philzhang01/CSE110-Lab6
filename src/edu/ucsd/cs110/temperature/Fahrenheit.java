package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float value = this.getValue();
        value = (value-32)*5/9;
        Celsius toReturn = new Celsius(value);
        return toReturn;
    }

    @Override
    public Temperature toFahrenheit() {
        float value = this.getValue();

        Fahrenheit toReturn = new Fahrenheit(value);
        return toReturn;
    }

    public String toString()
    {
        // TODO: Complete this method
        float value = this.getValue();
        String toReturn = " F";
        return value+toReturn;
    }
}