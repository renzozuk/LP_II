package model.entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Deposit {
    List<Product> products;

    public Deposit() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public int getQuantity(){
        return products.size();
    }

    public boolean isEmpty(){
        return products.size() == 0;
    }

    public Product getMostExpensiveProduct(){
        return products.stream().max(Comparator.comparing(Product::getPrice)).orElseThrow(NoSuchElementException::new);
    }

    public void showProducts(){
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
