package food_delivery.mapper;

import food_delivery.dto.RiderDTO;
import food_delivery.entity.RiderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RiderMapper {

    RiderMapper RIDER_MAPPER = Mappers.getMapper(RiderMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "cognome", target = "cognome")
    @Mapping(source = "telefono", target = "telefono")
    @Mapping(source = "login", target = "login")
    @Mapping(source = "ordini", target = "ordini")
    RiderDTO entityToDto(RiderEntity riderEntity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "cognome", target = "cognome")
    @Mapping(source = "telefono", target = "telefono")
    @Mapping(source = "login", target = "login")
    @Mapping(source = "ordini", target = "ordini")
    RiderEntity dtoToEntity(RiderDTO riderDto);
}
