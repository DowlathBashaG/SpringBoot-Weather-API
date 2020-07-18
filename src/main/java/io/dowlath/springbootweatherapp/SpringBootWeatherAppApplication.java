package io.dowlath.springbootweatherapp;

import io.dowlath.springbootweatherapp.config.WeatherAppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableConfigurationProperties(WeatherAppProperties.class)
@EnableCaching(proxyTargetClass = true)
public class SpringBootWeatherAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWeatherAppApplication.class, args);
	}

}
