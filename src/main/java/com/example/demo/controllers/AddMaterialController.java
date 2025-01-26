<<<<<<< HEAD
package com.example.demo.controllers;

import com.example.demo.domain.Material;
import com.example.demo.service.MaterialService;
import com.example.demo.service.MaterialServiceImpl;
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
public class AddMaterialController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/showFormAddMaterial")
    public String showFormAddMaterial(Model theModel){
        Material material=new Material();
        theModel.addAttribute("material",material);
        return "MaterialForm";
    }

    @PostMapping("/showFormAddMaterial")
    public String submitForm(@Valid @ModelAttribute("material") Material part, BindingResult theBindingResult, Model theModel){
        theModel.addAttribute("material",part);
        if(theBindingResult.hasErrors()){
            return "MaterialForm";
        }
        else{
        MaterialService repo=context.getBean(MaterialServiceImpl.class);
        Material ip=repo.findById((int)part.getId());
        if(ip!=null)part.setProducts(ip.getProducts());
            repo.save(part);

        return "confirmationaddpart";}
    }

}
=======
package com.example.demo.controllers;

import com.example.demo.domain.Material;
import com.example.demo.service.MaterialService;
import com.example.demo.service.MaterialServiceImpl;
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
public class AddMaterialController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/showFormAddMaterial")
    public String showFormAddMaterial(Model theModel){
        Material material=new Material();
        theModel.addAttribute("material",material);
        return "MaterialForm";
    }

    @PostMapping("/showFormAddMaterial")
    public String submitForm(@Valid @ModelAttribute("material") Material part, BindingResult theBindingResult, Model theModel){
        theModel.addAttribute("material",part);
        if(theBindingResult.hasErrors()){
            return "MaterialForm";
        }
        else{
        MaterialService repo=context.getBean(MaterialServiceImpl.class);
        Material ip=repo.findById((int)part.getId());
        if(ip!=null)part.setProducts(ip.getProducts());
            repo.save(part);

        return "confirmationaddpart";}
    }

}
>>>>>>> 71bff175338eb4802fd49d5301a6d0474b4477fd
