package food_delivery.repository;

import food_delivery.entity.OrdineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdineRepository extends JpaRepository<OrdineEntity, Long> {
}
