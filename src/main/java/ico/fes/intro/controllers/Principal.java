package ico.fes.intro.controllers;

import ico.fes.intro.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Date;

@Controller
public class Principal {

    @GetMapping("/inicio")
    public String getInicio(Model model){
        Empleado empleado = new Empleado(1,  23000,"José Sosa", "Desarrollo", "12/12/2000");
        model.addAttribute("empleado", empleado);
        return "index";
    }
}
