package food_delivery.repository;

import food_delivery.entity.LocaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocaleRepository extends JpaRepository<LocaleEntity, Long> {
}
