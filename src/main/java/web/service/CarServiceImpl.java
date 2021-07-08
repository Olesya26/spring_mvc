package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    public List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Toyota", 2010, "V8"));
        cars.add(new Car("Honda", 2020, "VR6"));
        cars.add(new Car("Lada", 1995, "V4"));
        cars.add(new Car("Suzuki", 1998, "V6"));
        cars.add(new Car("Reno", 2018, "VR6"));
    }


    @Override
    public List<Car> getByCountCars(int countCar) {
        if (countCar >= cars.size()) {
            return cars;
        }
        return cars.subList(0, countCar);
    }
}
