package ma.youcode.device.feign;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import ma.youcode.device.model.History;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@FeignClient("HISTORY-SERVICE")
public interface HistoryClient {

    String BASE_URL = "/api/history";

    @GetMapping(BASE_URL)
    @CircuitBreaker(name = "history", fallbackMethod = "historyFallbackMethod")
    List<History> getAllHistory();

    @PostMapping(BASE_URL)
    History saveHistory(@RequestBody History history);

    default List<History> historyFallbackMethod(Exception exception) {
        return new ArrayList<>();
    }
}
