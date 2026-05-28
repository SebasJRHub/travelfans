package co.travelfanscolombia.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "imagenes")
@Entity
public class ImagenModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private String tipoDeImagen;

    @Column(nullable = false)
    private String tamaño;

    @Column(nullable = false)
    private LocalDateTime fecha = java.time.LocalDateTime.now();

}
