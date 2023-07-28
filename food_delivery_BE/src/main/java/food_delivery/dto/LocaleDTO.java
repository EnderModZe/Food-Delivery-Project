package food_delivery.dto;

import food_delivery.entity.OrdineEntity;
import food_delivery.entity.PiattiEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class LocaleDTO {
    private Long id;
    private String nome;
    private String indirizzo;
    private Integer telefono;
    private List<PiattiEntity> piatti;
    private Set<OrdineEntity> ordini;
}
