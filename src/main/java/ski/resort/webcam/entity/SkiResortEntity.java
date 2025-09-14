package ski.resort.webcam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="ski_resort")
@Builder
public class SkiResortEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "en_name")
    String enName;
    @Column(name = "ko_name")
    String koName;
    @ManyToOne
    @JoinColumn(name = "region_id")
    private RegionEntity region;
}
