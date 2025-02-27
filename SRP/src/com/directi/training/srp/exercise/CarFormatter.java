package com.directi.training.srp.exercise;
public class CarFormatter
{
    public String carToString(Car car)
    {
        if (car == null)
            return "";
        else
            return car.getBrand() + " " car.getModel() + "\n";
    }

    public String getAllCarNames()
    {
        String result = new String;
        for (Car car: CarDB._carsDb) {
           result += carToString(car);
        }
        return result;
    }
}
