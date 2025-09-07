package ski.resort.webcam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ski.resort.webcam.entity.SkiResortEntity;

public interface SkiResortRepository extends JpaRepository<SkiResortEntity, Integer> {
}
