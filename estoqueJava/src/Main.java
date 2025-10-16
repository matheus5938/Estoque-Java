import entities.Product;
import entities.createNewProduct;
import entities.enums.Status;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        ArrayList<String> Product = new ArrayList<>();

        Product product = new createNewProduct();
        createNewProduct createProduct = new createNewProduct();

        createProduct.registerNewProduct();
        createProduct.registerNewEnterProduct();

        ent.close();
    }
}