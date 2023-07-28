package food_delivery.repository;

import food_delivery.entity.RiderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiderRepository extends JpaRepository<RiderEntity, Long> {
}
