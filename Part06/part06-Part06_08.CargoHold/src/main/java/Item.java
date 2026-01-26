/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MatheusPC
 */
public class Item {

    private String name;
    private int weight;

    public Item(String Name, int Weigth) {
        this.name = Name;
        this.weight = Weigth;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return String.format("%s (%d) kg", this.name, this.weight);
    }

}
