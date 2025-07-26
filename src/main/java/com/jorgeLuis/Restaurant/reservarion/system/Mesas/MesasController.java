package com.jorgeLuis.Restaurant.reservarion.system.Mesas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mesas")
public class MesasController {

    private final MesasService mesasService;

    public MesasController(MesasService mesasService) {
        this.mesasService = mesasService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Boas vindas a tabela de mesas";
    }

//    Listar todas as mesas cadastradas
    @GetMapping("/listarmesas")
    public List<MesasDTO> listarMesas() {
        return mesasService.listarMesas();
    }


//    listar mesa cadastrada por id
    @GetMapping("/listarmesas/{id}")
    public MesasDTO listarMesasPorId(@PathVariable Long id) {
        return mesasService.listarMesasPorId(id);
    }

}
