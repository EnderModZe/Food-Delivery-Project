package food_delivery.dto;

import food_delivery.entity.LoginEntity;
import food_delivery.entity.OrdineEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ClienteDTO {
    private Long id;
    private String nome;
    private String cognome;
    private Integer telefono;
    private String indirizzo;
    private String email;
    private LoginEntity login;
    private Set<OrdineEntity> ordini;
}
