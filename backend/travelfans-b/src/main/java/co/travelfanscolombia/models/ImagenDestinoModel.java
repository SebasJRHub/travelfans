package co.travelfanscolombia.models;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "imagen_destino")
@Entity
public class ImagenDestinoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "destino_id")
    private DestinoModel destino;

    @ManyToOne
    @JoinColumn(name = "imagen_id")
    private ImagenModel imagen;
}
