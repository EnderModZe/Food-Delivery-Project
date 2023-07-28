package food_delivery.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ordine")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrdineEntity {
    public enum StatoOrdine{
        RITIRATO,
        DA_RITIRARE,
        CONSEGNATO
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "prodotti")
    private String prodotti;

    @Column(name = "stato")
    private StatoOrdine statoOrdine;

    @Column(name = "totale")
    private Double totale;

    @Column(name = "data_ordine")
    private String dataOrdine;

    @ManyToOne()
    @JoinColumn(name = "id_locale")
    private LocaleEntity locale;

    @ManyToOne()
    @JoinColumn(name = "id_rider")
    private RiderEntity rider;

    @ManyToOne()
    @JoinColumn(name = "id_cliente")
    private ClienteEntity cliente;
}