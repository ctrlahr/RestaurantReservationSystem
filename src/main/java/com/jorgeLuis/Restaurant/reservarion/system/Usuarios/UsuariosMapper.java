package com.jorgeLuis.Restaurant.reservarion.system.Usuarios;

import org.springframework.stereotype.Component;

@Component
public class UsuariosMapper {

    public UsuariosModel map(UsuariosDTO usuariosDTO) {
        UsuariosModel usuario = new UsuariosModel();
        usuario.setId(usuario.getId());
        usuario.setNome(usuario.getNome());
        usuario.setEmail(usuario.getEmail());
        usuario.setRole(usuario.getRole());

        return usuario;
    }

    public UsuariosDTO map(UsuariosModel usuariosDTO) {
        UsuariosDTO usuario = new UsuariosDTO();
        usuario.setId(usuario.getId());
        usuario.setNome(usuario.getNome());
        usuario.setEmail(usuario.getEmail());
        usuario.setRole(usuario.getRole());

        return usuario;
    }

}
