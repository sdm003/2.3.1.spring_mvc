package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public static java.util.List<Car> getCars(){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1,"Toyota",1));
        carList.add(new Car(2,"Audi",5));
        carList.add(new Car(3,"BMW",2));
        carList.add(new Car(4,"Mercedes",2));
        return carList;
    }

}
