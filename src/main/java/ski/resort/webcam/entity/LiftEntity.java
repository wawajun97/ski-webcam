package ski.resort.webcam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="lift")
@Builder
public class LiftEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lift_id")
    int liftId;
    @Column(name = "resort_id")
    int resortId;
    @Column(name = "en_name")
    String enName;
    @Column(name = "ko_name")
    String koName;
    @Column(name = "seat_cnt")
    Integer seatCnt;
    @Column(name = "speed")
    Integer speed;
    @Column(name = "cam_url")
    String camUrl;
    @OneToOne
    @JoinColumn(name = "last_waiting_time_id")
    private WaitingTimeEntity waitingTime;
}
