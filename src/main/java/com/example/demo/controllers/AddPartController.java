<<<<<<< HEAD
package com.example.demo.controllers;

import com.example.demo.domain.Material;
import com.example.demo.domain.Plant;
import com.example.demo.domain.Part;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 *
 *
 *
 *
 */
@Controller
public class AddPartController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/showPartFormForUpdate")
    public String showPartFormForUpdate(@RequestParam("partID") int theId,Model theModel){

        PartService repo=context.getBean(PartServiceImpl.class);
        PlantService plantrepo=context.getBean(PlantServiceImpl.class);
        MaterialService materialrepo=context.getBean(MaterialServiceImpl.class);

        boolean materialItem=true;
        List<Plant> plants=plantrepo.findAll();
        for(Plant plant:plants) {
            if(plant.getId()==theId)materialItem=false;
        }
        String formtype;
        if(materialItem){
            Material material=materialrepo.findById(theId);
            theModel.addAttribute("material",material);
            formtype="MaterialForm";
        }
        else{
            Plant plant=plantrepo.findById(theId);
            theModel.addAttribute("plant",plant);
            formtype="PlantForm";
        }
        return formtype;
    }

    @GetMapping("/deletepart")
    public String deletePart(@Valid @RequestParam("partID") int theId,  Model theModel){
        PartService repo = context.getBean(PartServiceImpl.class);
        Part part=repo.findById(theId);
        if(part.getProducts().isEmpty()){
            repo.deleteById(theId);
            return "confirmationdeletepart";
        }
        else{
            return "negativeerror";
        }
    }

}
=======
package com.example.demo.controllers;

import com.example.demo.domain.Material;
import com.example.demo.domain.Plant;
import com.example.demo.domain.Part;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 *
 *
 *
 *
 */
@Controller
public class AddPartController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/showPartFormForUpdate")
    public String showPartFormForUpdate(@RequestParam("partID") int theId,Model theModel){

        PartService repo=context.getBean(PartServiceImpl.class);
        PlantService plantrepo=context.getBean(PlantServiceImpl.class);
        MaterialService materialrepo=context.getBean(MaterialServiceImpl.class);

        boolean materialItem=true;
        List<Plant> plants=plantrepo.findAll();
        for(Plant plant:plants) {
            if(plant.getId()==theId)materialItem=false;
        }
        String formtype;
        if(materialItem){
            Material material=materialrepo.findById(theId);
            theModel.addAttribute("material",material);
            formtype="MaterialForm";
        }
        else{
            Plant plant=plantrepo.findById(theId);
            theModel.addAttribute("plant",plant);
            formtype="PlantForm";
        }
        return formtype;
    }

    @GetMapping("/deletepart")
    public String deletePart(@Valid @RequestParam("partID") int theId,  Model theModel){
        PartService repo = context.getBean(PartServiceImpl.class);
        Part part=repo.findById(theId);
        if(part.getProducts().isEmpty()){
            repo.deleteById(theId);
            return "confirmationdeletepart";
        }
        else{
            return "negativeerror";
        }
    }

}
>>>>>>> 71bff175338eb4802fd49d5301a6d0474b4477fd
