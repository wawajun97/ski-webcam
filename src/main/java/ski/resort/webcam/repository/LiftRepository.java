package ski.resort.webcam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ski.resort.webcam.entity.LiftEntity;

import java.util.List;

public interface LiftRepository extends JpaRepository<LiftEntity, Integer> {
    List<LiftEntity> findByResortId(int resortId);
}
