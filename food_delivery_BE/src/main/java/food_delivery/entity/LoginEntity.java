package food_delivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "login")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "pass_word")
    private String password;

    @Column(name = "tipo_utente")
    private String tipoUtente;

    @OneToOne
    @JoinColumn(name = "email", referencedColumnName = "email", insertable=false, updatable=false)
    @JsonIgnore
    private RiderEntity rider;

    @OneToOne
    @JoinColumn(name = "email", referencedColumnName = "email", insertable=false, updatable=false)
    @JsonIgnore
    private ClienteEntity cliente;
}
