package ma.youcode.weather.feignClient;

import ma.youcode.weather.model.HourlyTemperatureResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Docs Api url example
//https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m

@FeignClient(value = "WEATHER-SERVICE", url = "https://api.open-meteo.com/v1/forecast")
public interface WeatherClient {

    @GetMapping
    HourlyTemperatureResponse getWeatherData(
            @RequestParam(name = "latitude") String latitude,
            @RequestParam(name = "longitude") String longitude,
            @RequestParam(name = "hourly", defaultValue = "temperature_2m") String hourly
    );

}
