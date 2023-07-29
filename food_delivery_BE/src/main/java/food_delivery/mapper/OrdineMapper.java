package food_delivery.mapper;

import food_delivery.dto.OrdineDTO;
import food_delivery.entity.OrdineEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrdineMapper {

    OrdineMapper ORDINE_MAPPER = Mappers.getMapper(OrdineMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "prodotti", target = "prodotti")
    @Mapping(source = "statoOrdine", target = "statoOrdine")
    @Mapping(source = "totale", target = "totale")
    @Mapping(source = "dataOrdine", target = "dataOrdine")
    @Mapping(source = "tipoPagamento", target = "tipoPagamento")
    @Mapping(source = "locale", target = "locale")
    @Mapping(source = "rider", target = "rider")
    @Mapping(source = "cliente", target = "cliente")
    OrdineDTO entityToDto(OrdineEntity ordineEntity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "prodotti", target = "prodotti")
    @Mapping(source = "statoOrdine", target = "statoOrdine")
    @Mapping(source = "totale", target = "totale")
    @Mapping(source = "dataOrdine", target = "dataOrdine")
    @Mapping(source = "tipoPagamento", target = "tipoPagamento")
    @Mapping(source = "locale", target = "locale")
    @Mapping(source = "rider", target = "rider")
    @Mapping(source = "cliente", target = "cliente")
    OrdineEntity dtoToEntity(OrdineDTO ordineDTO);
}
