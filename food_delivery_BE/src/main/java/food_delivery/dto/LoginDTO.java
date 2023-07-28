package food_delivery.dto;

import food_delivery.entity.ClienteEntity;
import food_delivery.entity.LoginEntity;
import food_delivery.entity.RiderEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class LoginDTO {
    private String email;
    private String password;
    private LoginEntity.TipoUtente tipoUtente;
    private RiderEntity rider;
    private ClienteEntity cliente;
}
