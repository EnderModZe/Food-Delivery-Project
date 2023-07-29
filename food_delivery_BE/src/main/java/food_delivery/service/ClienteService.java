package food_delivery.service;

import food_delivery.dto.ClienteDTO;
import food_delivery.entity.ClienteEntity;
import food_delivery.mapper.ClienteMapper;
import food_delivery.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteEntity> getAllClienti(){
        return clienteRepository.findAll();
    }

    public ClienteDTO getCLienteById(Long id){
        Optional<ClienteEntity> clienteFound = clienteRepository.findById(id);
        if(clienteFound.isEmpty()) throw new NullPointerException("get failed");
        else return ClienteMapper.CLIENTE_MAPPER.entityToDto(clienteFound.get());
    }

    public ClienteDTO saveCliente(ClienteDTO clienteDTO){
        if(clienteDTO == null) throw new NullPointerException("save failed");
        ClienteEntity clienteToSave = ClienteMapper.CLIENTE_MAPPER.dtoToEntity(clienteDTO);
        return ClienteMapper.CLIENTE_MAPPER.entityToDto(clienteRepository.save(clienteToSave));
    }

    public void deleteClienteById(Long id){
        Optional<ClienteEntity> clienteToDelete = clienteRepository.findById(id);
        if(clienteToDelete.isEmpty()) throw new NullPointerException("delete failed");
        clienteRepository.deleteById(id);
    }

    public ClienteDTO updateClienteById( ClienteDTO clienteDTO, Long id){
        if(clienteRepository.findById(id).isEmpty()) throw new NullPointerException("update failed");
        ClienteEntity clienteToUpdate = ClienteMapper.CLIENTE_MAPPER.dtoToEntity(clienteDTO);
        clienteToUpdate.setId(id);
        return ClienteMapper.CLIENTE_MAPPER.entityToDto(clienteRepository.save(clienteToUpdate));
    }


}
