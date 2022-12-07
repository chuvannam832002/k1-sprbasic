package com.nbtech.spring.basic.movierecommendersystem;

import com.nbtech.spring.basic.movierecommendersystem.Lession3.CollaborativeFilter;
import com.nbtech.spring.basic.movierecommendersystem.Lession3.MovieRecommender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovierecommendersystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MovierecommendersystemApplication.class, args);
		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		ApplicationContext applicationContext = SpringApplication.run(MovierecommendersystemApplication.class,args);
		//create object of RecommenderImplementation class
		MovieRecommender recommender = applicationContext.getBean(MovieRecommender.class);
		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		//display results
		System.out.println(Arrays.toString(result));
	}

}
