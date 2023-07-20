package com.spring.project.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



import javax.validation.Valid;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "firstView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-Employee-Details-view";
    }


    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee")Employee employee, BindingResult result){
        if(result.hasErrors()){
            return "ask-Employee-Details-view";
        } else {
            return "show-employee-details-view";
        }

    }

}
