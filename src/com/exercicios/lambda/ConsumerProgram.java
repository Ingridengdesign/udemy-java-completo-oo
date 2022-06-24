package com.exercicios.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.exercicios.lambda.entites.Product;
import com.exercicios.lambda.util.PriceUpdate;

public class ConsumerProgram {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double factor = 1.1;

        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        //expressão lambda declarada
        /* Consumer<Product> cons = p -> p.setPrice(p.getPrice()* factor);

        list.forEach(cons); */

        //referenciando method static
        // list.forEach(Product::staticPriceUpdate);

        //referenciando method   NO static
        // list.forEach(Product::noStaticPriceUpdate);

        //criando nova classe
        // list.forEach(new PriceUpdate());

        list.forEach(System.out::println);

    }
}