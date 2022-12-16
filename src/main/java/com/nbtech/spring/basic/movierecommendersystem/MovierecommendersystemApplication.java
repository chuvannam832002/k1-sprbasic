package com.nbtech.spring.basic.movierecommendersystem;

import com.nbtech.spring.basic.movierecommendersystem.ExternalProperty.CollaborativeFilter;
import com.nbtech.spring.basic.movierecommendersystem.ExternalProperty.MovieRecommender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

//@SpringBootApplication
@PropertySource("classpath:app.properties")
@ComponentScan(basePackages = "com.nbtech.spring.basic.movierecommendersystem.ExternalProperty")
public class MovierecommendersystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MovierecommendersystemApplication.class, args);
		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		//ApplicationContext applicationContext = SpringApplication.run(MovierecommendersystemApplication.class,args);
		AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(MovierecommendersystemApplication.class);
		//create object of RecommenderImplementation class
		//== XML App Config: load the configuration file
//		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		MovieRecommender recommender = appContext.getBean(MovieRecommender.class);
		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(recommender.getFavoriteMovie());

		//display results
		System.out.println(Arrays.toString(result));
	}

}
