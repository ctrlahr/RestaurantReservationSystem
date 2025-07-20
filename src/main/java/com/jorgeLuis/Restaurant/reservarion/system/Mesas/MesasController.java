package com.jorgeLuis.Restaurant.reservarion.system.Mesas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mesas")
public class MesasController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Boas vindas a tabela de mesas";
    }

}
