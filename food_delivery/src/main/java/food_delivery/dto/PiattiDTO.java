package food_delivery.dto;

import food_delivery.entity.LocaleEntity;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PiattiDTO {
    private Long id;
    private String nome;
    private Double prezzo;
    private LocaleEntity locale;
}
