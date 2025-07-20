package com.jorgeLuis.Restaurant.reservarion.system.Mesas;

import org.springframework.stereotype.Component;

@Component
public class MesasMapper {

    public MesasModel map(MesasDTO mesasDTO) {
        MesasModel mesa = new MesasModel();
        mesa.setId(mesasDTO.getId());
        mesa.setStatus_mesa(mesasDTO.getStatus_mesa());
        mesa.setNumero(mesasDTO.getNumero());
        mesa.setCapacidade(mesasDTO.getCapacidade());

        return mesa;
    }

    public MesasDTO map(MesasModel mesasModel) {
        MesasDTO mesa = new MesasDTO();
        mesa.setId(mesasModel.getId());
        mesa.setStatus_mesa(mesasModel.getStatus_mesa());
        mesa.setNumero(mesa.getNumero());
        mesa.setCapacidade(mesa.getCapacidade());

        return mesa;
    }

}
