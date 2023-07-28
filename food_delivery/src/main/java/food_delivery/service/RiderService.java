package food_delivery.service;

import food_delivery.dto.RiderDTO;
import food_delivery.mapper.RiderMapper;
import food_delivery.repository.ClienteRepository;
import food_delivery.repository.RiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RiderService {
    @Autowired
    RiderRepository riderRepository;

    public List<RiderDTO> getAllRider(){
        List<RiderDTO> ridersDTO = new ArrayList<>();
        riderRepository.findAll().forEach(x ->
                ridersDTO.add(RiderMapper.RIDER_MAPPER.entityToDto(x)));
        if(!ridersDTO.isEmpty()) return ridersDTO;
        else throw new NullPointerException("get failed");
    }
}
