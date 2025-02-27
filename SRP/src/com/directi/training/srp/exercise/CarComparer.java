public class CarComparer
{
    public Car compareCar(Car c1, Car c2)
    {
        if (c1 == null)
            return c2;
        else if (c2 == null)
            return c1;
        else
            return c1.getModel().compareTo(bestCar.getModel()) > 0;
    }
    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car: CarDB._carsDB)
        {
           bestCar = compareCar(bestCar, car);
        }
        return bestCar;
    }
}
