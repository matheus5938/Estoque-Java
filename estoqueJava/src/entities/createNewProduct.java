package entities;
import java.util.Scanner;
import java.util.ArrayList;

import entities.enums.Status;

public class createNewProduct extends Product{
    Scanner ent = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();

    private int kg;
    private String marck;
    private int id;
    private int lote;

    public createNewProduct() {
        super();
    }

    public createNewProduct(String name, double price, int quantity, Status status,int kg, String marck, int id, int lote){
        super(name,price,quantity,status);
        this.kg = kg;
        this.marck = marck;
        this.id = id;
        this.lote = lote;
    }

    public int getKg() {
        return kg;
    }

    public String getMarck() {
        return marck;
    }

    public int getId() {
        return id;
    }

    public int getLote() {
        return lote;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public void setMarck(String marck) {
        this.marck = marck;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public void registerNewProduct(){
        System.out.print("Name of product: ");
        String name = ent.nextLine();
        setName(name);

        System.out.print("Marck of product: ");
        String marck = ent.nextLine();
        setMarck(marck);

        System.out.print("Price of product: ");
        double price = ent.nextDouble();
        setPrice(price);
    }

    public void registerNewEnterProduct(){
        System.out.print("Lote: ");
        int lote = ent.nextInt();
        setLote(lote);

        System.out.print("Number of quantity: ");
        int quantity = ent.nextInt();
        setQuantity(quantity);

        System.out.println();

        System.out.println(toString());
    }

    public double somaKgTotal(double kg){
        return this.kg + kg;
    }

    public void ver(){
        if (getQuantity() > 0){
            System.out.println("Product " + Status.INSTOCK + " Quantity: " + getQuantity());
        }
        else {
            System.out.println("Product " + Status.NOTSTOCK + " Quantity " + getQuantity());
        }
    }

    public  String toString(){
        return "One new product register: " + "\n"
                + "Description: " + "\n"
                + "Name of product: " + getName() + "\n"
                + "Price of product: " + getPrice() + "\n"
                + "Marck of product: " + getMarck() + "\n"
                + "Quantity in stock: " + getQuantity() + "\n"
                + "Lote: " + getLote() + "\n"
                + "----------------------------------------------";
    }

    public void saveProduct(){
        list.add(toString());
    }

    public ArrayList<String> getList() {
        return list;
    }
}
