package ma.youcode.weather.resource;

import lombok.RequiredArgsConstructor;
import ma.youcode.weather.feignClient.WeatherClient;
import ma.youcode.weather.model.HourlyTemperatureResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/weather")
@RequiredArgsConstructor
public class WeatherResource {

    private final WeatherClient weatherClient;

    @GetMapping
    public ResponseEntity<HourlyTemperatureResponse> getWeatherData(
            @RequestParam(name = "latitude") String latitude,
            @RequestParam(name = "longitude") String longitude,
            @RequestParam(name = "hourly") String hourly
    ) {
        return ResponseEntity.ok(this.weatherClient.getWeatherData(latitude, longitude, hourly));
    }

}
