package co.travelfanscolombia.models;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "imagen_experiencia")
@Entity
public class ImagenExperienciaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_experiencia")
    private ExperienciaModel experiencia;

    @ManyToOne
    @JoinColumn(name = "imagen_id")
    private ImagenModel imagen;
}
