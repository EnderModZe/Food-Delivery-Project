package food_delivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "piatti")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PiattiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "prezzo")
    private Double prezzo;

    @ManyToOne(targetEntity = LocaleEntity.class)
    @JoinColumn(name = "id_locale")
    @JsonIgnore
    private LocaleEntity locale;
}
