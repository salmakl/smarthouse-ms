package ma.youcode.device.resource;

import lombok.RequiredArgsConstructor;
import ma.youcode.device.feign.HistoryClient;
import ma.youcode.device.model.History;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class HistoryResource {
    private final HistoryClient historyClient;

    @GetMapping
    public ResponseEntity<List<History>> getAllHistory() {
        return ResponseEntity.ok(this.historyClient.getAllHistory());
    }

    @PostMapping
    ResponseEntity<History> saveHistory(@RequestBody History history) {
        return ResponseEntity.ok(this.historyClient.saveHistory(history));
    }

}
