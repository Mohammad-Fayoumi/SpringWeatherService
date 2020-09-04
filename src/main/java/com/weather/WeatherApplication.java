package com.weather;

import com.weather.services.AccuWeather;
import com.weather.services.WeatherService;
import com.weather.services.WorldWeatherService;
import com.weather.services.timezone.GlobalTimeZone;
import com.weather.services.timezone.LocalTimeZone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class WeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);
		
		WeatherService accuWeatherService = new AccuWeather(new LocalTimeZone());
		System.out.println("Accu Weather service time zone is \n" + accuWeatherService.getWeatherTimeZone());
		
		WeatherService worldWeatherService = new WorldWeatherService(new GlobalTimeZone());
		System.out.println("World Weather service time zone is \n" + worldWeatherService.getWeatherTimeZone());
		
		// Load the spring configuration file.
		// Container.
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from the spring container.
		WeatherService weatherService = context.getBean("accuService", WeatherService.class);
		
		// Call methods on the bean.
		weatherService.getRainRate();
		weatherService.getInsideHumidity();
		weatherService.getBarometer();
		System.out.println(weatherService.getWeatherTimeZone());
		System.out.println("The injected search service is: " + weatherService.getSearchService().getLocation());
		
		System.out.println("\n /////////////////////////////////////////////////////////////////////////////////// \n");
		
		weatherService = context.getBean("worldWeatherService", WeatherService.class);
		weatherService.getRainRate();
		weatherService.getInsideHumidity();
		weatherService.getBarometer();
		System.out.println(weatherService.getWeatherTimeZone());
		System.out.println("The injected search service is: " + weatherService.getSearchService().getLocation());
		
		WorldWeatherService worldWeatherService1 = context.getBean("worldWeatherService", WorldWeatherService.class);
		System.out.println("The injected endpoint is: " + worldWeatherService1.getApiEndPoint());
		System.out.println("The injected email address is: " + worldWeatherService1.getEmailAddress());
		System.out.println("The loaded property value is: " + worldWeatherService1.getApiKey());
		
		// Close the context.
		context.close();
	}

}
