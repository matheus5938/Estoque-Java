package entities;
import java.util.Scanner;

import entities.enums.Status;

public class Product {
    Scanner ent = new Scanner(System.in);

    private String name;
    private double price;
    private int quantity;
    private Status status;

    public Product(){
        super();
    }

    public Product(String name, double price, int quantity, Status status){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double stockValue(){
        return price * quantity;
    }
}
