package adsd.app.bouwapp.controller;

import adsd.app.bouwapp.model.Grondstof;
import adsd.app.bouwapp.model.Test;
import adsd.app.bouwapp.repository.ServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
//rest controller

@RequestMapping("/api")
@RestController
public class RestUserController {

    @Autowired
    ServiceDao serviceDao;

    @GetMapping("/")
    public String check()
    {
        return "welcome";
    }



    @GetMapping("/getAll")
    public List<Test> getAllMaterials()
    {
        return serviceDao.findAllGrondstoffen();

    }


}


