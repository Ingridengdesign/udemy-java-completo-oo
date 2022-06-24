package com.exercicios.lambda.util;

import java.util.function.Function;

import com.exercicios.lambda.entites.Product;

public class UpperCaseName implements Function<Product, String>{

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
    
}
