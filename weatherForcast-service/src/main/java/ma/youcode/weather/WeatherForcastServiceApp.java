package ma.youcode.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class WeatherForcastServiceApp {
    public static void main(String[] args) { SpringApplication.run(WeatherForcastServiceApp.class, args); }
}
