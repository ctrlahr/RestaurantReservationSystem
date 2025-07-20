package com.jorgeLuis.Restaurant.reservarion.system.Usuarios;


import com.jorgeLuis.Restaurant.reservarion.system.Mesas.MesasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuariosModel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Email", unique = true)
    private String email;

//    TODO: armazenar a senha, ver como posso fazer isso de forma segura.


    @Column(name = "Role")
    @Enumerated(EnumType.STRING)
    private UsuarioRoleEnum role;

}
