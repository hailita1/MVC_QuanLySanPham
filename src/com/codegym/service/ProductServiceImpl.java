package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private static ArrayList<Product> products;

    static {
        products.add(new Product(1, "SamSung", 1500000, "mobile", "SamSung"));
        products.add(new Product(2, "Iphone", 3000000, "mobile", "Iphone"));
        products.add(new Product(2, "Oppo", 2500000, "mobile", "Oppo"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);

    }

    @Override
    public void update(int id, Product product) {
        products.set(id - 1, product);

    }

    @Override
    public void remove(int id) {
        products.remove(id - 1);

    }

    @Override
    public Product findByName(String name) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                index = i;
                break;
            }
        }
        return products.get(index);
    }
}
