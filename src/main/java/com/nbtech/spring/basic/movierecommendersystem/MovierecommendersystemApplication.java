package com.nbtech.spring.basic.movierecommendersystem;

import com.nbtech.spring.basic.movierecommendersystem.Lession4.CollaborativeFilter;
import com.nbtech.spring.basic.movierecommendersystem.Lession4.MovieRecommender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

//@SpringBootApplication
@ComponentScan(basePackages = "com.nbtech.spring.basic.movierecommendersystem.Lession4")
public class MovierecommendersystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MovierecommendersystemApplication.class, args);
		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		//ApplicationContext applicationContext = SpringApplication.run(MovierecommendersystemApplication.class,args);
		AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(MovierecommendersystemApplication.class);
		//create object of RecommenderImplementation class
		MovieRecommender recommender = appContext.getBean(MovieRecommender.class);
		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		//display results
		System.out.println(Arrays.toString(result));
	}

}
