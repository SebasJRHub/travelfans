package co.travelfanscolombia.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "detalles_paquete_tour")
@Entity
public class DetallesPaqueteTour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paquete_id")
    private PaqueteModel paqueteModel;

    @ManyToOne
    @JoinColumn(name = "tour_id")
    private TourModel tourModel;

    @Column()
    private LocalDateTime fecha;
}
