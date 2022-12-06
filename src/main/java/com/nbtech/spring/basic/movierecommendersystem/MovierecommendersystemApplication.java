package com.nbtech.spring.basic.movierecommendersystem;

import com.nbtech.spring.basic.movierecommendersystem.Lession2.CollaborativeFilter;
import com.nbtech.spring.basic.movierecommendersystem.Lession2.MovieRecommender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovierecommendersystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovierecommendersystemApplication.class, args);
		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//create object of RecommenderImplementation class
		MovieRecommender recommender = new MovieRecommender(new CollaborativeFilter());

		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		//display results
		System.out.println(Arrays.toString(result));
	}

}
