package ma.youcode.history.resource;

import lombok.RequiredArgsConstructor;
import ma.youcode.history.model.History;
import ma.youcode.history.service.HistoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/history")
@RequiredArgsConstructor
public class HistoryResource {

    private final HistoryService deviceService;

    @GetMapping
    public ResponseEntity<List<History>> getAll() {
        return ResponseEntity.ok(this.deviceService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<History> getById(@PathVariable("id") Long historyId) {
        return ResponseEntity.ok(this.deviceService.getById(historyId));
    }

    @PostMapping
    public ResponseEntity<History> add(@RequestBody History history) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.deviceService.add(history));
    }

}
