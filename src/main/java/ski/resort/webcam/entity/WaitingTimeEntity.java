package ski.resort.webcam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="waiting_time")
@Builder
public class WaitingTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "lift_id")
    int liftId;
    @Column(name = "waiting_time")
    int waitingTime;
    @Column(name = "calc_time")
    LocalDateTime calcTime;
}
