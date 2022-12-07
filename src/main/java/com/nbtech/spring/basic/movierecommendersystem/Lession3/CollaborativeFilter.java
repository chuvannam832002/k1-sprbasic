package com.nbtech.spring.basic.movierecommendersystem.Lession3;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements MovieFilter {
    @Override
    public String[] getRecommendations(String movie) {
        return new String[]{"Moster","Alien","Ghost"};
    }
}
