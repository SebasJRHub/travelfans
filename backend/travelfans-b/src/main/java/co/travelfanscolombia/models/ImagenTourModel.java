package co.travelfanscolombia.models;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "imagen_tour")
@Entity
public class ImagenTourModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tour_id")
    private TourModel tour;

    @ManyToOne
    @JoinColumn(name = "imagen_id")
    private ImagenModel imagen;
}
