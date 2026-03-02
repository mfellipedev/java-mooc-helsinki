
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MatheusPC
 */
public class Store {

    private Scanner scanner;
    private Warehouse wareHouse;

    public Store(Warehouse wareHouse, Scanner scanner) {
        this.scanner = scanner;
        this.wareHouse = wareHouse;
    }

    public void shop(String costumer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + costumer);
        System.out.println("our selection: ");

        for (String product : this.wareHouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }
            if (this.wareHouse.take(product)) {
                cart.add(product, this.wareHouse.price(product));
            }
        }
        System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());

    }
}
