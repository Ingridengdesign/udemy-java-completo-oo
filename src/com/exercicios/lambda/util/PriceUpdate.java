package com.exercicios.lambda.util;

import java.util.function.Consumer;

import com.exercicios.lambda.entites.Product;

public class PriceUpdate implements Consumer<Product>{

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
        
    }
    
}
