package food_delivery.mapper;

import food_delivery.dto.LoginDTO;
import food_delivery.entity.LoginEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LoginMapper {
    LoginMapper LOGIN_MAPPER = Mappers.getMapper(LoginMapper.class);

    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "tipoUtente", target = "tipoUtente")
    @Mapping(source = "rider", target = "rider")
    @Mapping(source = "cliente", target = "cliente")
    LoginDTO entityToDto(LoginEntity loginEntity);

    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "tipoUtente", target = "tipoUtente")
    @Mapping(source = "rider", target = "rider")
    @Mapping(source = "cliente", target = "cliente")
    LoginEntity dtoToEntity(LoginDTO loginDTO);
}
