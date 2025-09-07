package ski.resort.webcam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ski.resort.webcam.entity.WaitingTimeEntity;

public interface WaitingTimeRepository extends JpaRepository<WaitingTimeEntity, Long> {
}
