package food_delivery.service;

import food_delivery.dto.PiattiDTO;
import food_delivery.entity.PiattiEntity;
import food_delivery.mapper.PiattiMapper;
import food_delivery.repository.PiattiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PiattiService {
    @Autowired
    PiattiRepository piattiRepository;

    public List<PiattiEntity> getAllPiatti(){
        return piattiRepository.findAll();
    }

    public PiattiDTO getPiattoById(Long id){
        Optional<PiattiEntity> piattoFound = piattiRepository.findById(id);
        if (piattoFound.isEmpty()) throw new NullPointerException("get failed");
        return PiattiMapper.PIATTI_MAPPER.entityToDto(piattoFound.get());
    }

    public PiattiDTO savePiatto(PiattiDTO piattoDTO){
        if (piattoDTO == null) throw new NullPointerException("save failed");
        PiattiEntity piattoToSave = PiattiMapper.PIATTI_MAPPER.dtoToEntity(piattoDTO);
        return PiattiMapper.PIATTI_MAPPER.entityToDto(piattiRepository.save(piattoToSave));
    }

    public void deletePiattoById(Long id){
        Optional<PiattiEntity> piattoToDelete = piattiRepository.findById(id);
        if (piattoToDelete.isEmpty()) throw new NullPointerException("delete failed");
        piattiRepository.deleteById(id);
    }

    public PiattiDTO updatePiattoById(PiattiDTO piattoDTO, Long id){
        if(piattiRepository.findById(id).isEmpty()) throw new NullPointerException("update failed");
        PiattiEntity piattoToUpdate = PiattiMapper.PIATTI_MAPPER.dtoToEntity(piattoDTO);
        piattoToUpdate.setId(id);
        return PiattiMapper.PIATTI_MAPPER.entityToDto(piattiRepository.save(piattoToUpdate));
    }
}
