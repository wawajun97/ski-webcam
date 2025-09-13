package ski.resort.webcam.dto;

import lombok.Data;

@Data
public class AlertDto {
    private String resortKrName;
    private String resortEnName;
    private String liftName;
    private int waitingTime;
}
