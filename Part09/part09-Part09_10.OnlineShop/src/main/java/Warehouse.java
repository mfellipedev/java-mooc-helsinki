
import java.util.AbstractMap;
import java.util.ArrayList;
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
public class Warehouse {

    private Map<String, Integer> productAndPrice;
    private Map<String, Integer> productAndStock;

    public Warehouse() {
        this.productAndPrice = new HashMap<String, Integer>();
        this.productAndStock = new HashMap<String, Integer>();
    }

    public void addProduct(String name, int price, int stock) {
        if (name.isEmpty() || price < 0 || stock < 0) {
            return;
        }

        this.productAndPrice.putIfAbsent(name, price);
        this.productAndStock.put(name, stock);
    }

    public int price(String product) {

        return this.productAndPrice.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.productAndStock.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (this.productAndStock.getOrDefault(product, 0) == 0 || !this.productAndStock.containsKey(product)) {
            return false;
        }
        this.productAndStock.put(product, this.productAndStock.get(product) - 1);
        return true;
    }

    public Set<String> products() {
        Set<String> copyProducts = new HashSet<>();
        for (String product : this.productAndStock.keySet()) {
            if (product == null || product.isEmpty()) {

            } else {
                copyProducts.add(product);
            }
        }
        return copyProducts;
    }

}
