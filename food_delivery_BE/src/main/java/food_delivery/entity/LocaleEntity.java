package food_delivery.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "locale")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LocaleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "indirizzo")
    private String indirizzo;

    @Column(name = "telefono")
    private String telefono;

    @OneToMany(mappedBy = "locale")
    private List<PiattiEntity> piatti;

    @OneToMany(mappedBy = "locale")
    private Set<OrdineEntity> ordini;
}
