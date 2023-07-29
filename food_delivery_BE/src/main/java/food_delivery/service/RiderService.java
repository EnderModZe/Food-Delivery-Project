package food_delivery.service;

import food_delivery.dto.RiderDTO;
import food_delivery.entity.RiderEntity;
import food_delivery.mapper.RiderMapper;
import food_delivery.repository.RiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class RiderService {
    @Autowired
    RiderRepository riderRepository;

    public List<RiderEntity> getAllRider(){
        return riderRepository.findAll();
    }

    public RiderDTO getRiderById(Long id){
        Optional<RiderEntity> riderFound = riderRepository.findById(id);
        if(riderFound.isEmpty()) throw new NullPointerException("get failed");
        return RiderMapper.RIDER_MAPPER.entityToDto(riderFound.get());
    }

    public RiderDTO saveRider(RiderDTO riderDTO){
        if(riderDTO == null) throw new NullPointerException("save failed");
        RiderEntity riderToSave = RiderMapper.RIDER_MAPPER.dtoToEntity(riderDTO);
        return RiderMapper.RIDER_MAPPER.entityToDto(riderRepository.save(riderToSave));
    }

    public void deleteRiderById(Long id){
        Optional<RiderEntity> riderToDelete = riderRepository.findById(id);
        if(riderToDelete.isEmpty()) throw new NullPointerException("delete failed");
        riderRepository.deleteById(id);
    }

    public RiderDTO updateRiderById(@RequestBody RiderDTO riderDTO, @PathVariable Long id){
        if(riderRepository.findById(id).isEmpty()) throw new NullPointerException("update failed");
        RiderEntity riderToUpdate = RiderMapper.RIDER_MAPPER.dtoToEntity(riderDTO);
        riderToUpdate.setId(id);
        return RiderMapper.RIDER_MAPPER.entityToDto(riderRepository.save(riderToUpdate));
    }
}
