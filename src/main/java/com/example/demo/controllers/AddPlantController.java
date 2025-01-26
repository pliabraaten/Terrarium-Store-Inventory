<<<<<<< HEAD
package com.example.demo.controllers;

import com.example.demo.domain.Plant;
import com.example.demo.domain.Part;
import com.example.demo.service.PlantService;
import com.example.demo.service.PlantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 *
 *
 *
 *
 */
@Controller
public class AddPlantController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/showFormAddPlant")
    public String showFormAddPlant(Model theModel){
        Plant plant=new Plant();
        theModel.addAttribute("plant",plant);
        return "PlantForm";
    }

    @PostMapping("/showFormAddPlant")
    public String submitForm(@Valid @ModelAttribute("plant") Plant plant, BindingResult bindingResult, Model theModel){
        theModel.addAttribute("plant",plant);
        if(bindingResult.hasErrors()){
            return "PlantForm";
        }
        else{
        PlantService repo=context.getBean(PlantServiceImpl.class);
        Plant op=repo.findById((int)plant.getId());
        if(op!=null)plant.setProducts(op.getProducts());
        repo.save(plant);
        return "confirmationaddpart";}
    }
}
=======
package com.example.demo.controllers;

import com.example.demo.domain.Plant;
import com.example.demo.domain.Part;
import com.example.demo.service.PlantService;
import com.example.demo.service.PlantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 *
 *
 *
 *
 */
@Controller
public class AddPlantController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/showFormAddPlant")
    public String showFormAddPlant(Model theModel){
        Plant plant=new Plant();
        theModel.addAttribute("plant",plant);
        return "PlantForm";
    }

    @PostMapping("/showFormAddPlant")
    public String submitForm(@Valid @ModelAttribute("plant") Plant plant, BindingResult bindingResult, Model theModel){
        theModel.addAttribute("plant",plant);
        if(bindingResult.hasErrors()){
            return "PlantForm";
        }
        else{
        PlantService repo=context.getBean(PlantServiceImpl.class);
        Plant op=repo.findById((int)plant.getId());
        if(op!=null)plant.setProducts(op.getProducts());
        repo.save(plant);
        return "confirmationaddpart";}
    }
}
>>>>>>> 71bff175338eb4802fd49d5301a6d0474b4477fd
