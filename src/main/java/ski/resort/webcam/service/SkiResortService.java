package ski.resort.webcam.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ski.resort.webcam.entity.LiftEntity;
import ski.resort.webcam.repository.LiftRepository;
import ski.resort.webcam.repository.RegionRepository;
import ski.resort.webcam.repository.SkiResortRepository;
import ski.resort.webcam.repository.WaitingTimeRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class SkiResortService {
    private final SkiResortRepository skiResortRepository;
    private final LiftRepository liftRepository;
    private final WaitingTimeRepository waitingTimeRepository;
    private final RegionRepository regionRepository;

    public ResponseEntity<?> findAllResort() {
        return ResponseEntity.ok(skiResortRepository.findAll());
    }

    public ResponseEntity<?> findResortLift(Integer resortId) {
        List<LiftEntity> liftEntityList = new ArrayList<>();
        if(resortId != null) {
            liftEntityList = liftRepository.findByResortId(resortId);
        }
        return ResponseEntity.ok(liftEntityList);
    }

    public ResponseEntity<?> findRegion() {
        return ResponseEntity.ok(regionRepository.findAll());
    }
}
