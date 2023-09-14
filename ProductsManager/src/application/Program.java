package application;

import model.entities.Deposit;
import model.entities.DurableProduct;
import model.entities.NotDurableProduct;
import model.entities.Product;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Deposit deposit = new Deposit();

        System.out.println("Is empty? " + deposit.isEmpty());

        deposit.addProduct(new NotDurableProduct("Chocolate", 2.99, "Garota", "Delicious", "15/09/2023", "30%"));
        deposit.addProduct(new NotDurableProduct("Detergent", 1.49, "Ab", "It cleans a lot", "25/12/2023", "Strawberry"));
        deposit.addProduct(new NotDurableProduct("Soap", 0.99, "Darx", "It cleans a lot", "01/12/2023", "Lemon"));

        System.out.println("Is empty? " + deposit.isEmpty());
        System.out.println("Most expensive product: " + deposit.getMostExpensiveProduct().getName());

        deposit.addProduct(new DurableProduct("Fridge", 999.90, "Brastemp", "It freezes a lot", 20));
        deposit.addProduct(new Product("Book", 49.99, "Arqueiro", "Will change your life"));
        deposit.addProduct(new DurableProduct("Cellphone", 4999.90, "Pineapple", "Extremely util", 3));

        System.out.println("Most expensive product: " + deposit.getMostExpensiveProduct().getName());
        System.out.println("Products quantity in deposit: " + deposit.getQuantity());
        deposit.showProducts();
    }
}
