package model.services;

import model.entities.Drink;
import model.entities.enums.OrderStatus;
import model.exceptions.ChoiceException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SellingService {
    private ManagementService managementService;
    private OrderStatus orderStatus;
    private Drink chosenDrink;
    private Double amount;

    public SellingService(ManagementService managementService) {
        this.managementService = managementService;
        orderStatus = OrderStatus.WAITING_FOR_CUSTOMER;
        amount = 0.0;
    }

    private void setCustomerChoice(Integer id) {
        if (id < 1 || id > managementService.getQuantity()) {
            orderStatus = OrderStatus.CANCELED;
            throw new ChoiceException("The chosen number is not valid.");
        }
        chosenDrink = managementService.chooseADrink(id);
        orderStatus = OrderStatus.REQUESTED;
    }

    private OrderStatus isTheAmountEnough(Character customerChoice) {
        if (amount >= chosenDrink.getPrice()) {
            return OrderStatus.PAID;
        } else {
            if (customerChoice.toString().equalsIgnoreCase("y")) {
                return OrderStatus.WAITING_PAYMENT;
            } else {
                return OrderStatus.CANCELED;
            }
        }
    }

    private void processPayment(Scanner sc, boolean firstTry) {
        Character customerChoice;
        if (firstTry) {
            customerChoice = 'y';
        } else {
            do{
                System.out.print("The money isn't enough to buy that drink. Would you like to put more money in the machine? (y/n): ");
                customerChoice = sc.next().charAt(0);
            }while(!customerChoice.toString().equalsIgnoreCase("y") && !customerChoice.toString().equalsIgnoreCase("n"));
        }
        if (customerChoice.toString().equalsIgnoreCase("y")) {
            System.out.print("Money to put in the machine: ");
            double money = sc.nextDouble();
            amount += money;
        }
        orderStatus = isTheAmountEnough(customerChoice);
    }

    private void shipping() {
        System.out.println("\n################################################");
        System.out.println(chosenDrink + " - $" + chosenDrink.getPrice());
        System.out.println("Thanks for the preference. See you next soon. ;)");
        if (amount > chosenDrink.getPrice()) {
            double change = amount - chosenDrink.getPrice();
            System.out.println("Change: $" + String.format("%.2f", change));
        }
        System.out.println("################################################");
    }

    public void customerService() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Which drink would you like to drink? ");
            Integer id = sc.nextInt();
            setCustomerChoice(id);
            processPayment(sc, true);
            while (orderStatus == OrderStatus.WAITING_PAYMENT) {
                processPayment(sc, false);
            }
            if (orderStatus == OrderStatus.PAID) {
                shipping();
                orderStatus = OrderStatus.DELIVERED;
            } else if (orderStatus == OrderStatus.CANCELED) {
                throw new ChoiceException("The money isn't enough to buy that drink.");
            }
        } catch (InputMismatchException e) {
            System.out.println("The input must be a number.");
        }
    }

    @Override
    public String toString() {
        return managementService.showProducts();
    }
}
