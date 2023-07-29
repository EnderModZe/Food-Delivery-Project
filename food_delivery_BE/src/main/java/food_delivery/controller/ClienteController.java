package food_delivery.controller;

import food_delivery.dto.ClienteDTO;
import food_delivery.entity.ClienteEntity;
import food_delivery.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/get-all")
    public List<ClienteEntity> getAllClienti(){
        return clienteService.getAllClienti();
    }

    @GetMapping("/get-by-{id}")
    public ClienteDTO getClienteById(@PathVariable Long id){
        return clienteService.getCLienteById(id);
    }

    @PostMapping("/save")
    public ClienteDTO saveCliente(@RequestBody ClienteDTO clienteDTO){
        return clienteService.saveCliente(clienteDTO);
    }

    @DeleteMapping("/delete-by-{id}")
    public void deleteClienteById(@PathVariable Long id){
        clienteService.deleteClienteById(id);
    }

    @PutMapping("update-by-{id}")
    public ClienteDTO updateClienteById(@RequestBody ClienteDTO clienteDTO, @PathVariable Long id){
        return clienteService.updateClienteById(clienteDTO, id);
    }
}
