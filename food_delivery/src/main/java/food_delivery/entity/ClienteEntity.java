package food_delivery.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "cliente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClienteEntity {
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

    @Column(name = "indirizzo")
    private String indirizzo;

    @Column(name = "email")
    private String email;

    @OneToOne(mappedBy = "cliente")
    private LoginEntity login;

    @OneToMany(mappedBy = "cliente")
    private Set<OrdineEntity> ordini;
}
