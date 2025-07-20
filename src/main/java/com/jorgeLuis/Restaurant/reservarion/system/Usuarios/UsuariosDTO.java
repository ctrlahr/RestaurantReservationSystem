package com.jorgeLuis.Restaurant.reservarion.system.Usuarios;

import com.jorgeLuis.Restaurant.reservarion.system.Mesas.MesasModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuariosDTO {

    private Long id;
    private String nome;
    private MesasModel mesa;

}
