package com.geekbrains.app;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<Product> products;

    public ProductList() {
        products = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            products.add(new Product(i, "product"+i, i*100));
        }

    }

    public List<Product> getProducts() {
        return products;
    }
}
