package ico.fes.intro.controllers;

import ico.fes.intro.helpers.Peticion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Principal {

    @GetMapping(path = {"/", "/{data}"})
    public String getInicio(Model model){
        try{
            Peticion rq = new Peticion();
        }catch (Exception e){
            e.printStackTrace();
            return "404";
        }
        model.addAttribute("personajes", Peticion.personajes);
        return "index";
    }

}
