package co.travelfanscolombia.models;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "admins")
@Entity
public class AdminModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String apellidos;

    @Column(nullable = false, length = 60)
    private String email;

    @Column( nullable = false)
    private String contraseña;

    @Column( nullable = false)
    private LocalDateTime fecha_creacion;

    @PrePersist
    protected void creadoAhora(){
        this.fecha_creacion = LocalDateTime.now();
    }
}
