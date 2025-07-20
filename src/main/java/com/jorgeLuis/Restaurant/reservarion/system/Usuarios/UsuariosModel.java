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

    @OneToOne
    @JoinColumn(name = "mesa_id", nullable = false)
    private MesasModel mesa;

}
