package com.directi.training.srp.exercise;
public class CarComparer
{
    private final CarRepository carDB;  
    public CarComparer(CarRepository carRepository) {
        this.carDB = carRepository;
    }
    public Car compareCar(Car c1, Car c2)
    {
        if (c1 == null)
            return c2;
        else if (c2 == null)
            return c1;
        else
            return c1.getModel().compareTo(c2.getModel()) > 0 ? c1 : c2;
    }
    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car: carDB.getCars())
        {
           bestCar = compareCar(bestCar, car);
        }
        return bestCar;
    }
}
