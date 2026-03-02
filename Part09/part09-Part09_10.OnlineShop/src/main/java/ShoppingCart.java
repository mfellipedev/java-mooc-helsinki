
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MatheusPC
 */
public class ShoppingCart {

    private Map<String, Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.shoppingCart.containsKey(product)) {
            this.shoppingCart.get(product).increaseQuantity();
        } else {
            this.shoppingCart.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int price = 0;
        for (Item i : this.shoppingCart.values()) {
            price += i.price();
        }
        return price;
    }

    public void print() {
        for (Item itens : this.shoppingCart.values()) {
            System.out.println(itens);
        }
    }

}
