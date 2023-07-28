package food_delivery.controller;

import food_delivery.dto.RiderDTO;
import food_delivery.service.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api-rider")
public class RiderController {
    @Autowired
    RiderService riderService;

    @GetMapping("/get-all")
    public List<RiderDTO> getAllRider(){
        return riderService.getAllRider();
    }
}
