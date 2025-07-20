package com.jorgeLuis.Restaurant.reservarion.system.Usuarios;

import org.springframework.stereotype.Component;

@Component
public class UsuariosMapper {

    public UsuariosModel map(UsuariosDTO usuariosDTO) {
        UsuariosModel usuario = new UsuariosModel();
        usuario.setId(usuario.getId());
        usuario.setNome(usuario.getNome());
        usuario.setMesa(usuario.getMesa());

        return usuario;
    }

    public UsuariosDTO map(UsuariosModel usuariosDTO) {
        UsuariosDTO usuario = new UsuariosDTO();
        usuario.setId(usuario.getId());
        usuario.setNome(usuario.getNome());
        usuario.setMesa(usuario.getMesa());

        return usuario;
    }

}
