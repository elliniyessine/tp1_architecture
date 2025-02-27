public class CarFormatter
{
    private final CarRepository carDB;  
    public CarFormatter(CarRepository carRepository) {
        this.carDB = carRepository;
    }
    public String carToString(Car car)
    {
        if (car == null)
            return "";
        else
            return car.getBrand() + " " + car.getModel() + "\n";
    }

    public String getAllCarNames()
    {
        String result = new String();
        for (Car car: carDB.getCars()) {
           result += carToString(car);
        }
        return result;
    }
}
