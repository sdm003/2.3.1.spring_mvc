package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {


    @RequestMapping(method = RequestMethod.GET)
    public List<Car> printCars(ModelMap model, @RequestParam(name = "locale") String locale) {

        if(locale.equals("ru")){
            model.addAttribute("locale", "Машины");
        } else {
            model.addAttribute("locale", "Cars");
        }

        List<Car> cars = CarService.getCars();
        model.addAttribute("cars", cars);
        return cars;
    }

}
