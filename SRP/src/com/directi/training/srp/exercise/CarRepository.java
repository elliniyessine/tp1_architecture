import java.util.List;

public interface CarRepository {
    Car getFromDb(String carId);
    List<Car> getCars();
}