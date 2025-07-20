package com.jorgeLuis.Restaurant.reservarion.system.Mesas;

import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class MesasService {

    private MesasRepository mesasRepository;
    private MesasMapper mesasMapper;

    public MesasService(MesasRepository mesasRepository, MesasMapper mesasMapper) {
        this.mesasRepository = mesasRepository;
        this.mesasMapper = mesasMapper;
    }



//    Método de listar todas as mesas
public MesasDTO listarMesasPorId(Long id) {
        Optional<MesasModel> mesa = mesasRepository.findById(id);
        return mesa.map(mesasMapper::map).orElse(null);
}
}
