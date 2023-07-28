package food_delivery.repository;

import food_delivery.entity.PiattiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PiattiRepository extends JpaRepository<PiattiEntity, Long> {
}
