package co.travelfanscolombia.models;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "consultas")
@Entity
public class ConsultaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime fecha;

    @Column
    private Long telefono;

    @Column(length = 150)
    private String mensaje;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "consulta_id")
    private Set<PaqueteModel> paquete;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "destino_id")
    private DestinoModel destino;

    @Column(length = 50, nullable = false)
    private String estado;

    @Column
    private String canal;
}
