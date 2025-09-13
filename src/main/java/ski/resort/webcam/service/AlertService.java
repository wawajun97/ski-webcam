package ski.resort.webcam.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ski.resort.webcam.dto.AlertDto;

@Service
@RequiredArgsConstructor
@Slf4j
public class AlertService {
    private final KafkaTemplate kafkaTemplate;

    public void sendAlert(AlertDto alertDto) {
        kafkaTemplate.send("alert", alertDto);
    }
}
