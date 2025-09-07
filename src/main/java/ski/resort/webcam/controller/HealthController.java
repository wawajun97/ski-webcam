package ski.resort.webcam.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Slf4j
public class HealthController {
    @PostMapping("/health")
    public String health(@RequestBody Map<String,String> map) {
        log.info("map : {}", map);
        return "OK";
    }
}
