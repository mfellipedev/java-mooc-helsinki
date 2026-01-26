/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MatheusPC
 */
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int MaxWeigth) {
        this.maxWeight = MaxWeigth;
        this.items = new ArrayList<>();
    }

    @Override
    public String toString() {

        int totalWeigth = this.totalWeight();
        int quantity = this.items.size();

        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        if (quantity == 1) {
            return "1 item (" + totalWeigth + " kg)";
        }

        return String.format("%d items (%d kg)", quantityItems(), totalWeight());
    }

    public int quantityItems() {

        return this.items.size();
    }

    public int totalWeight() {
        int sum = 0;

        for (Item i : items) {
            sum += i.getWeight();
        }
        return sum;
    }

    public void addItem(Item item) {
        if (item == null) {
            return;
        }
        int currentWeigth = this.totalWeight();
        int newWeigth = item.getWeight();

        if (newWeigth + currentWeigth > this.maxWeight) {
            return;
        }
        this.items.add(item);

    }

    public void printItems() {
        for (Item i : items) {
            System.out.println(i);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviestItem = this.items.get(0);
        for (Item i : items) {
            if (i.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = i;
            }
        }
        return heaviestItem;
    }

}
