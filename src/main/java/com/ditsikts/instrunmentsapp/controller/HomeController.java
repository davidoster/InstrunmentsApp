
package com.ditsikts.instrunmentsapp.controller;

import com.ditsikts.instrunmentsapp.dao.BrandDao;
import com.ditsikts.instrunmentsapp.entities.Brand;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/aaaaaaaaa")
public class HomeController {
        @Autowired
        public BrandDao service;
//    @RequestMapping(method = RequestMethod.GET)
//    public String sayHello(ModelMap model) {
//        System.out.println(service.findAllBrands());
//
//        return "index";
//    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello2(ModelMap model) {
        
        service.deleteBrandById(1);
        
        System.out.println(service.findAllBrands());

        return "index";
    }
    
    
    
}
