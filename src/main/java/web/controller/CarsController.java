package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Car> printCars(ModelMap model) {
        List<Car> cars = CarService.getCars();
        model.addAttribute("cars", cars);
        return cars;
    }

}
