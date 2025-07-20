package com.jorgeLuis.Restaurant.reservarion.system.Mesas;

import com.jorgeLuis.Restaurant.reservarion.system.Usuarios.UsuariosModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MesasDTO {

    private Long id;
    private MesasStatusEnum status_mesa;
    private int numero;
    private int capacidade;

}
