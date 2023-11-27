package com.example.springsecurity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.springsecurity.Models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class UsuarioController {

    @GetMapping("perfil")
    public String perfil(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Iker");
        usuario.setApellido("Rodriguez");
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil del usuario " + usuario.getNombre());
        return "perfil";
    }

}

