package food_delivery.service;

import food_delivery.dto.LoginDTO;
import food_delivery.entity.LoginEntity;
import food_delivery.mapper.LoginMapper;
import food_delivery.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    LoginRepository loginRepository;

    public List<LoginEntity> getAllLogin(){
        return loginRepository.findAll();
    }

    public LoginDTO getLoginById(Long id){
        Optional<LoginEntity> loginFound = loginRepository.findById(id);
        if(loginFound.isEmpty()) throw new NullPointerException("get failed");
        else return LoginMapper.LOGIN_MAPPER.entityToDto(loginFound.get());
    }

    public LoginDTO saveLogin(LoginDTO loginDTO){
        if (loginDTO == null) throw new NullPointerException("save failed");
        LoginEntity loginToSave = LoginMapper.LOGIN_MAPPER.dtoToEntity(loginDTO);
        return LoginMapper.LOGIN_MAPPER.entityToDto(loginRepository.save(loginToSave));
    }

    public void deleteLoginById(Long id){
        Optional<LoginEntity> loginToDelete = loginRepository.findById(id);
        if(loginToDelete.isEmpty()) throw new NullPointerException("delete failed");
        loginRepository.deleteById(id);
    }

    public LoginDTO updateLoginById(LoginDTO loginDTO,Long id){
        if(loginRepository.findById(id).isEmpty()) throw new NullPointerException("update failed");
        LoginEntity loginToUpdate = LoginMapper.LOGIN_MAPPER.dtoToEntity(loginDTO);
        loginToUpdate.setId(id);
        return LoginMapper.LOGIN_MAPPER.entityToDto(loginRepository.save(loginToUpdate));
    }
}
