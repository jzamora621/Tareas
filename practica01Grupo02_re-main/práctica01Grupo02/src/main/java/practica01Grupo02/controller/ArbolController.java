package practica01Grupo02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import practica01Grupo02.domain.Arbol;
import practica01Grupo02.service.ArbolService;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
@RequestMapping("/Arbol")
public class ArbolController {
    
    @Autowired
    private ArbolService arbolService;

     @GetMapping("/crud")
    public String crudPage() {
        return "crud"; // Asegúrate de que hay un archivo crud.html en templates si usas Thymeleaf.
    }

    

    @PostMapping("/guardar")
    public String guardarArbol(@ModelAttribute Arbol arbol) {
        arbolService.save(arbol);
        return "redirect:/arboles/";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarArbol(@PathVariable Long id) {
        arbolService.delete(id);
        return "redirect:/arboles/";
        
    
    }
}
