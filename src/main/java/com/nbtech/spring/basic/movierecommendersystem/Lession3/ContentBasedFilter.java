package com.nbtech.spring.basic.movierecommendersystem.Lession3;

public class ContentBasedFilter implements MovieFilter {
    public String[] getRecommendations(String Movie){
        return new String[]{"Happy Feet","Ice Ace","Up"};
    }
}
