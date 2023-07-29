package food_delivery.service;

import food_delivery.dto.LocaleDTO;
import food_delivery.entity.LocaleEntity;
import food_delivery.mapper.LocaleMapper;
import food_delivery.repository.LocaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocaleService {
    @Autowired
    LocaleRepository localeRepository;

    public List<LocaleEntity> getAllLocali(){
        return localeRepository.findAll();
    }

    public LocaleDTO getLocaleById(Long id){
        Optional<LocaleEntity> localeFound = localeRepository.findById(id);
        if (localeFound.isEmpty()) throw new NullPointerException("get failed");
        return LocaleMapper.LOCALE_MAPPER.entityToDto(localeFound.get());
    }

    public LocaleDTO saveLocale(LocaleDTO localeDTO){
        if(localeDTO == null) throw new NullPointerException("save failed");
        LocaleEntity localeToSave = LocaleMapper.LOCALE_MAPPER.dtoToEntity(localeDTO);
        return LocaleMapper.LOCALE_MAPPER.entityToDto(localeRepository.save(localeToSave));
    }

    public void deleteLocaleById(Long id){
        Optional<LocaleEntity> localeToDelete = localeRepository.findById(id);
        if(localeToDelete.isEmpty()) throw new NullPointerException("delete failed");
        localeRepository.deleteById(id);
    }

    public LocaleDTO updateLocaleById(LocaleDTO localeDTO, Long id){
        if(localeRepository.findById(id).isEmpty()) throw new NullPointerException("update failed");
        LocaleEntity localeToUpdate = LocaleMapper.LOCALE_MAPPER.dtoToEntity(localeDTO);
        localeToUpdate.setId(id);
        return LocaleMapper.LOCALE_MAPPER.entityToDto(localeRepository.save(localeToUpdate));
    }
}
