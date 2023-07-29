package food_delivery.controller;

import food_delivery.dto.LocaleDTO;
import food_delivery.entity.LocaleEntity;
import food_delivery.service.LocaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-locale")
public class LocaleController {
    @Autowired
    LocaleService localeService;

    @GetMapping("/get-all")
    public List<LocaleEntity> getAllLocali(){
        return localeService.getAllLocali();
    }

    @GetMapping("/get-by-{id}")
    public LocaleDTO getLocaleById(@PathVariable Long id){
        return localeService.getLocaleById(id);
    }

    @PostMapping("/save")
    public LocaleDTO saveLocale(@RequestBody LocaleDTO localeDTO){
        return localeService.saveLocale(localeDTO);
    }

    @DeleteMapping("/delete-by-{id}")
    public void deleteLocaleById(@PathVariable Long id){
        localeService.deleteLocaleById(id);
    }

    @PutMapping("/update-by-{id}")
    public LocaleDTO updateLocaleById(@RequestBody LocaleDTO localeDTO, @PathVariable Long id){
        return localeService.updateLocaleById(localeDTO, id);
    }
}
