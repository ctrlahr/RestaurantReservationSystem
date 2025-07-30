package com.jorgeLuis.Restaurant.reservarion.system.Mesas;

import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MesasService {

    private final MesasRepository mesasRepository;
    private final MesasMapper mesasMapper;

    public MesasService(MesasRepository mesasRepository, MesasMapper mesasMapper) {
        this.mesasRepository = mesasRepository;
        this.mesasMapper = mesasMapper;
    }



//    Método de listar todas as mesas
    public List<MesasDTO> listarMesas() {
        List<MesasModel> mesa = mesasRepository.findAll();
        return mesa.stream()
                .map(mesasMapper::map)
                .collect(Collectors.toList());
    }



//    Listar mesa por id
    public MesasDTO listarMesasPorId(Long id) {
        Optional<MesasModel> mesa = mesasRepository.findById(id);
        return mesa.map(mesasMapper::map).orElse(null);
    }


    // Status da mesa
    public MesasStatusEnum statusMesa(Long id) {
        Optional<MesasModel> mesa = mesasRepository.findById(id);
                return mesa.map(mesasMapper::map)
                .map(MesasDTO::getStatus_mesa)
                .orElse(null);
    }




}
