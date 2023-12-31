package food_delivery.dto;

import food_delivery.entity.ClienteEntity;
import food_delivery.entity.LocaleEntity;
import food_delivery.entity.OrdineEntity;
import food_delivery.entity.RiderEntity;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrdineDTO {
    private Long id;
    private String prodotti;
    private String statoOrdine;
    private Double totale;
    private String dataOrdine;
    private String tipoPagamento;
    private LocaleEntity locale;
    private RiderEntity rider;
    private ClienteEntity cliente;
}
