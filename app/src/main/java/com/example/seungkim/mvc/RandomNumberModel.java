package com.example.seungkim.mvc;


public class RandomNumberModel {
    public RandomNumberModel(){}

    public int getNumber() {
        return (int) (Math.random() * 99);
    }
}

