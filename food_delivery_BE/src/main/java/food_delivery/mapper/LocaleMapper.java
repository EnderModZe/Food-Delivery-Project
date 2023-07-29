package food_delivery.mapper;

import food_delivery.dto.LocaleDTO;
import food_delivery.entity.LocaleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LocaleMapper {

    LocaleMapper LOCALE_MAPPER = Mappers.getMapper(LocaleMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "indirizzo", source = "indirizzo")
    @Mapping(target = "telefono", source = "telefono")
    @Mapping(target = "piatti", source = "piatti")
    @Mapping(target = "ordini", source = "ordini")
    LocaleDTO entityToDto(LocaleEntity localeEntity);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "indirizzo", source = "indirizzo")
    @Mapping(target = "telefono", source = "telefono")
    @Mapping(target = "piatti", source = "piatti")
    @Mapping(target = "ordini", source = "ordini")
    LocaleEntity dtoToEntity(LocaleDTO localeDTO);
}
