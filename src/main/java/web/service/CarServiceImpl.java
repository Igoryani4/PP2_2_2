package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    List<Car> cars = new ArrayList<>();

    @Override
    public void addCar() {

        Car car1 = new Car("Ford", "Explorer", "Green");
        Car car2 = new Car("LandRover", "Freelander2", "Black");
        Car car3 = new Car("Infinity", "QX80", "Grey");
        Car car4 = new Car("Mercedes-Benz", "GL450", "White");
        Car car5 = new Car("BMW", "X7", "Blue");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    @Override
    public void updateCar(Car car) {

    }

    @Override
    public void deleteCar(Car car) {

    }

    @Override
    public Car getCarByModel(String model) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getModel().equals(model)) {
                return cars.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Car> getAllCars() {
        if (cars.isEmpty()) {
            addCar();
        }
        return cars;
    }

    public List<Car> getCountCar(int count) {
        if (count == 0 || count >= 5) return getAllCars();
        return cars.subList(cars.size() - count, cars.size());
    }
}
