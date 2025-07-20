package com.jorgeLuis.Restaurant.reservarion.system.Mesas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mesas")
public class MesasController {

    private MesasService mesasService;

    public MesasController(MesasService mesasService) {
        this.mesasService = mesasService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Boas vindas a tabela de mesas";
    }

    @GetMapping("/listarmesasid/{id}")
    public MesasDTO listarMesasPorId(@PathVariable Long id) {
        return mesasService.listarMesasPorId(id);
    }

}
