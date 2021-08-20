package com.geekbrains.app.Domain;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<Product> products;

    public ProductList() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

}

