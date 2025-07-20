package com.jorgeLuis.Restaurant.reservarion.system.Mesas;

import com.jorgeLuis.Restaurant.reservarion.system.Usuarios.UsuariosModel;
import org.springframework.stereotype.Component;

@Component

public class MesasMapper {

    public MesasModel map(MesasDTO mesasDTO) {
        MesasModel mesa = new MesasModel();
        mesa.setId(mesasDTO.getId());
        mesa.setStatus_mesa(mesasDTO.getStatus_mesa());
        mesa.setUsuario(mesasDTO.getUsuario());

        return mesa;
    }

    public MesasDTO map(MesasModel mesasModel) {
        MesasDTO mesa = new MesasDTO();
        mesa.setId(mesasModel.getId());
        mesa.setStatus_mesa(mesasModel.getStatus_mesa());
        mesa.setUsuario(mesasModel.getUsuario());

        return mesa;
    }

}
