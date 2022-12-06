package com.nbtech.spring.basic.movierecommendersystem.Lession2;

public class CollaborativeFilter implements MovieFilter{
    @Override
    public String[] getRecommendations(String movie) {
        return new String[]{"Moster","Alien","Ghost"};
    }
}
