package food_delivery.controller;

import food_delivery.dto.PiattiDTO;
import food_delivery.entity.PiattiEntity;
import food_delivery.mapper.PiattiMapper;
import food_delivery.service.PiattiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-piatti")
public class PiattiController {
    @Autowired
    PiattiService piattiService;

    @GetMapping("/get-all")
    public List<PiattiEntity> getAllPiatti(){
        return piattiService.getAllPiatti();
    }

    @GetMapping("/get-by-{id}")
    public PiattiDTO getPiattoById(@PathVariable Long id){
        return piattiService.getPiattoById(id);
    }

    @PostMapping("/save")
    public PiattiDTO savePiatto(@RequestBody PiattiDTO piattoDTO){
        return piattiService.savePiatto(piattoDTO);
    }

    @DeleteMapping("/delete-by-{id}")
    public void deletePiattoById(@PathVariable Long id){
        piattiService.deletePiattoById(id);
    }

    @PutMapping("/update-by-{id}")
    public PiattiDTO updatePiattoById(@RequestBody PiattiDTO piattoDTO, @PathVariable Long id){
        return piattiService.updatePiattoById(piattoDTO, id);
    }
}
