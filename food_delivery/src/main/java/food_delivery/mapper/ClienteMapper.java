package food_delivery.mapper;

import food_delivery.dto.ClienteDTO;
import food_delivery.entity.ClienteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClienteMapper {

    ClienteMapper CLIENTE_MAPPER = Mappers.getMapper(ClienteMapper.class);
    @Mapping(source = "id", target = "id")
    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "cognome", target = "cognome")
    @Mapping(source = "telefono", target = "telefono")
    @Mapping(source = "indirizzo", target = "indirizzo")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "login", target = "login")
    @Mapping(source = "ordini", target = "ordini")
    ClienteDTO entityToDto(ClienteEntity clienteEntity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "cognome", target = "cognome")
    @Mapping(source = "telefono", target = "telefono")
    @Mapping(source = "indirizzo", target = "indirizzo")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "login", target = "login")
    @Mapping(source = "ordini", target = "ordini")
    ClienteEntity dtoToEntity(ClienteDTO clienteDTO);
}
