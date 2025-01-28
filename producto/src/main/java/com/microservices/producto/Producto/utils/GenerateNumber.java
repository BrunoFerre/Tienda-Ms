package com.microservices.producto.Producto.utils;

public class GenerateNumber {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
