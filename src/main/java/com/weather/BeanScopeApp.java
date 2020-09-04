package com.weather;

import com.weather.services.WeatherService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
    WeatherService weatherService = context.getBean("accuService", WeatherService.class);
    WeatherService accuService = context.getBean("accuService", WeatherService.class);
    // Check if the bean scope is singleton.
    System.out.println("Singleton\nResult is: " + (weatherService == accuService));
    System.out.println("Memory Location for weatherService is: " + weatherService);
    System.out.println("Memory Location for accuService is: " + accuService);
    
    WeatherService nws = context.getBean("natWeather", WeatherService.class);
    WeatherService natWeather = context.getBean("natWeather", WeatherService.class);
    // Check if the bean scope is prototype.
    System.out.println("\nPrototype\nResult is: " + (nws == natWeather));
    System.out.println("Memory Location for nws is: " + nws);
    System.out.println("Memory Location for natWeather is: " + natWeather);
    
    context.close();
  }
}
