package food_delivery.mapper;

import food_delivery.dto.PiattiDTO;
import food_delivery.entity.PiattiEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PiattiMapper {

    PiattiMapper PIATTI_MAPPER = Mappers.getMapper(PiattiMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "prezzo", target = "prezzo")
    @Mapping(source = "locale", target = "locale")
    PiattiDTO entityToDto(PiattiEntity piattiEntity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "prezzo", target = "prezzo")
    @Mapping(source = "locale", target = "locale")
    PiattiEntity dtoToEntity(PiattiDTO piattiDTO);
}
