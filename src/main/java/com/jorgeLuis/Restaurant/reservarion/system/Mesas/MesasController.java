package com.jorgeLuis.Restaurant.reservarion.system.Mesas;

import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/listar")
    public List<MesasDTO> listarMesas() {
        return mesasService.listarMesas();
    }


//    listar mesa cadastrada por id
    @GetMapping("/listarporid/{id}")
    public MesasDTO listarMesasPorId(@PathVariable Long id) {
        return mesasService.listarMesasPorId(id);
    }

//    Criar uma mesa
    @PostMapping("/criar")
    public MesasDTO criarMesas(@RequestBody MesasDTO mesa) {
        return mesasService.criarMesa(mesa);
    }

//    Status da mesa
    @GetMapping("/status/{id}")
    public MesasStatusEnum statusMesa(@PathVariable Long id) {
        return mesasService.statusMesa(id);
    }


}
