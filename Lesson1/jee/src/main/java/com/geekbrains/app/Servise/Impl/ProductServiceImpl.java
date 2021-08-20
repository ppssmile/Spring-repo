package com.geekbrains.app.Servise.Impl;

import com.geekbrains.app.Domain.Product;
import com.geekbrains.app.Domain.ProductList;
import com.geekbrains.app.Servise.ProductService;

public class ProductServiceImpl implements ProductService {

    ProductList list;

    public ProductServiceImpl(int i) {
        this.list = new ProductList();
        addTestProduct(i);
    }

    @Override
    public void addTestProduct(int b) {
        for (int i = 0; i < b; i++) {
            list.getProducts().add(new Product(i, "product" + i, i * 100));
        }

    }

    @Override
    public String getTextHTML() {
        StringBuilder sb =new StringBuilder();
        sb.append("<html><body><h1>Products</h1><br>");
        sb.append("<h2>");
        sb.append(String.format("%50s %50s %50s", "ID", "Title", "Cost"));
        sb.append("</h1>");
        for (Product iter : list.getProducts()) {
            sb.append("<h3>");
            sb.append(String.format("%50d %50s %50d", iter.getId(),iter.getTitle(),iter.getCost()));
            sb.append("</h3>");
        }
        sb.append("</body></html>");
        return sb.toString();
    }
}
