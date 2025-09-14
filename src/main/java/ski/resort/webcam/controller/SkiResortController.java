package ski.resort.webcam.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ski.resort.webcam.service.SkiResortService;

@RestController
@Slf4j
@RequiredArgsConstructor
public class SkiResortController {
    private final SkiResortService skiResortService;

    @GetMapping("/resort/list")
    public ResponseEntity<?> findAllResort() {
        return skiResortService.findAllResort();
    }

    @GetMapping("/resort/lift")
    public ResponseEntity<?> findResortLift(@RequestParam(required = false) Integer resortId) {
        return skiResortService.findResortLift(resortId);
    }
}
