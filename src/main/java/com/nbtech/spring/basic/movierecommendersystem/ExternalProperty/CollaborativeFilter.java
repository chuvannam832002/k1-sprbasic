package com.nbtech.spring.basic.movierecommendersystem.ExternalProperty;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CDF")
public class CollaborativeFilter implements MovieFilter {
    @Override
    public String[] getRecommendations(String movie) {
        return new String[]{"Moster","Alien","Ghost"};
    }
}
