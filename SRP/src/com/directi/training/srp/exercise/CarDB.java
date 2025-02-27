import java.util.Arrays;
import java.util.List;

public class CarDB implements CarRepository {
    private static CarDB instance;
    private static List<Car> _carsDB = Arrays
        .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault"));

    private CarDB() {
    }

    public static CarRepository getInstance() {
        if (instance == null) {
            instance = new CarDB();
        }
        return instance;
    }

    @Override
    public Car getFromDb(final String carId) {
        for (Car car : _carsDB) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public List<Car> getCars() {
        return _carsDB;
    }
}