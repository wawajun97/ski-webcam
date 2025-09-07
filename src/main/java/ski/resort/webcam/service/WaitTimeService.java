package ski.resort.webcam.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ski.resort.webcam.entity.WaitingTimeEntity;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class WaitTimeService {
    @KafkaListener(topics = "wait-time")
    public void handleWaitTime(String kafkaMessage) {
        log.info("Kafka Message : -> " + kafkaMessage);

        Map<Object, Object> map = new HashMap<>();

        // ObjectMapper를 통해 카프카로부터 받은 메시지를 Map 구조로 변환합니다.
        ObjectMapper mapper = new ObjectMapper();
        try {
            map = mapper.readValue(kafkaMessage, new TypeReference<Map<Object, Object>>() {});
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }

        log.info("결과 확인" + " " + map.get("name") + " " + map.get("price"));

    }
}
