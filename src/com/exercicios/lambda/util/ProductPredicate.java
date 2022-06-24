package com.exercicios.lambda.util;

import java.util.function.Predicate;

import com.exercicios.lambda.entites.Product;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        
        return p.getPrice() >= 100.0;
    }
    
}
