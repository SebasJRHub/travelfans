package co.travelfanscolombia.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "opiniones")
@Entity
public class OpinionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String nombre_viajero;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "destino_id")
    private DestinoModel destino;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private LocalDateTime fecha;

    @Min(1)
    @Max(5)
    @Column(nullable = false)
    private Integer calificacion;
}
