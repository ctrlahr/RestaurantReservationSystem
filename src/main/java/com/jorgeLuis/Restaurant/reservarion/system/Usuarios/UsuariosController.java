package com.jorgeLuis.Restaurant.reservarion.system.Usuarios;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
public class UsuariosController {

    @RequestMapping("/boasvindas")
    public String boasVindas() {
        return "Bem vindo a tabela de usuários";
    }

}
