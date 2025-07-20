package com.jorgeLuis.Restaurant.reservarion.system.Mesas;


import com.jorgeLuis.Restaurant.reservarion.system.Usuarios.UsuariosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "tb_mesas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MesasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    @Column(name = "status da mesa")
    @Enumerated(EnumType.STRING)
    private MesasStatusEnum status_mesa;

    @Column(name = "Número da mesa")
    private int numero;

    @Column(name = "Capacidade")
    private int capacidade;

}
