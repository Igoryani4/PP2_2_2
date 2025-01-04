package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    void addCar();
    void updateCar(Car car);
    void deleteCar(Car car);
    Car getCarByModel(String model);
    List<Car> getAllCars();
    List<Car> getCountCar(int count);
}
