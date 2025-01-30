package com.microservices.ventas.ventas.utils;

public class GenerateNumber {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
