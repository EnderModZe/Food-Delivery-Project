package food_delivery.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "rider")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RiderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "telefono")
    private Integer telefono;

    @Column(name = "email")
    private String email;

    @OneToOne(mappedBy = "rider")
    private LoginEntity login;

    @OneToMany(mappedBy = "rider")
    private Set<OrdineEntity> ordini;
}
