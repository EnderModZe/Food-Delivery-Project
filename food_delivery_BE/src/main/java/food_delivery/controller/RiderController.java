package food_delivery.controller;

import food_delivery.dto.ClienteDTO;
import food_delivery.dto.RiderDTO;
import food_delivery.entity.RiderEntity;
import food_delivery.service.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-rider")
public class RiderController {
    @Autowired
    RiderService riderService;

    @GetMapping("/get-all")
    public List<RiderEntity> getAllRider(){
        return riderService.getAllRider();
    }

    @GetMapping("/get-by-{id}")
    public RiderDTO getRiderById(@PathVariable Long id){
        return riderService.getRiderById(id);
    }

    @PostMapping("/save")
    public RiderDTO saveCliente(@RequestBody RiderDTO riderDTO){
        return riderService.saveRider(riderDTO);
    }

    @DeleteMapping("delete-by-{id}")
    public void deleteRiderById(@PathVariable Long id){
        riderService.deleteRiderById(id);
    }

    @PutMapping("update-by-{id}")
    public RiderDTO updateRiderById(@RequestBody RiderDTO riderDTO, @PathVariable Long id){
        return riderService.updateRiderById(riderDTO, id);
    }
}
