package com.exercicios.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.exercicios.lambda.entites.Product;
import com.exercicios.lambda.util.ProductPredicate;

public class PredicateProgram {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0;

        // Predicate<Product> pred = p -> p.getPrice() >= min;

        //referencia p
        // list.removeIf(Product:: staticProductPredicate);
        // list.removeIf(Product:: noStaticProductPredicate);
        // list.removeIf(pred);
        list.removeIf(p -> p.getPrice() >= min);

        for (Product p : list) {
            System.out.println(p);
        }

    }
}
