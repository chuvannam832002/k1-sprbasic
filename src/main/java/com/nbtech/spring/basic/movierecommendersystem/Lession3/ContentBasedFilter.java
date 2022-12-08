package com.nbtech.spring.basic.movierecommendersystem.Lession3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class ContentBasedFilter implements MovieFilter {
    public String[] getRecommendations(String Movie){
        return new String[]{"Happy Feet","Ice Ace","Up"};
    }
}
