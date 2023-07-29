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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "prodotti")
    private String prodotti;

    @Column(name = "stato")
    private String statoOrdine;

    @Column(name = "totale")
    private Double totale;

    @Column(name = "data_ordine")
    private String dataOrdine;

    @Column(name = "tipo_pagamento")
    private String tipoPagamento;

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
