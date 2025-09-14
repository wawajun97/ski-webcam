package ski.resort.webcam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ski.resort.webcam.entity.LiftEntity;
import ski.resort.webcam.entity.RegionEntity;

public interface RegionRepository extends JpaRepository<RegionEntity, Integer> {
}
