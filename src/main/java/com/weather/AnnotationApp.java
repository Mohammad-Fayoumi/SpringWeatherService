package com.weather;

import com.weather.services.WeatherService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
    WeatherService weatherService = context.getBean("annWorldWeather", WeatherService.class);
    System.out.println(weatherService.toString());
    
    // Default bean id.
    weatherService = context.getBean("accuWeather", WeatherService.class);
    System.out.println(weatherService.getBarometer());
    context.close();
    
  }
}
