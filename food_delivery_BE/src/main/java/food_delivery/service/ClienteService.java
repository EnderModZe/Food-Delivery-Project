package food_delivery.service;

import food_delivery.dto.ClienteDTO;
import food_delivery.entity.ClienteEntity;
import food_delivery.mapper.ClienteMapper;
import food_delivery.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteDTO> getAllClienti(){
        List<ClienteDTO> clientiDTO = new ArrayList<>();
        clienteRepository.findAll().forEach(x ->
            clientiDTO.add(ClienteMapper.CLIENTE_MAPPER.entityToDto(x)));
        if(!clientiDTO.isEmpty()) return clientiDTO;
        else throw new NullPointerException("get failed");
    }

    public ClienteDTO getCLienteById(Long id){
        Optional<ClienteEntity> clienteFound = clienteRepository.findById(id);
        if(clienteFound.isEmpty()) throw new NullPointerException("get failed");
        else return ClienteMapper.CLIENTE_MAPPER.entityToDto(clienteFound.get());
    }

    public ClienteEntity saveCliente(ClienteDTO clienteDTO){
        if(clienteDTO == null) throw new NullPointerException("save failed");
        ClienteEntity clienteEntity = ClienteMapper.CLIENTE_MAPPER.dtoToEntity(clienteDTO);
        return clienteRepository.save(clienteEntity);
    }

    public void deleteClienteById(Long id){
        clienteRepository.deleteById(id);
    }


}
