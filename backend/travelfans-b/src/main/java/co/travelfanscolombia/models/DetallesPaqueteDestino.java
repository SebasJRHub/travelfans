package co.travelfanscolombia.models;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "detalles_paquete_destino")
@Entity
public class DetallesPaqueteDestino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paquete_id")
    private PaqueteModel paqueteModel;

    @ManyToOne
    @JoinColumn(name = "destino_id")
    private DestinoModel destinoModel;

    @Column(length = 200)
    private String notas;

}
