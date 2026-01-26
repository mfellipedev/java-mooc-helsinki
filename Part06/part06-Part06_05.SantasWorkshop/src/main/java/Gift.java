/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MatheusPC
 */
public class Gift {

    private String name;
    private int weight;

    public Gift(String name, int Weight) {
        this.name = name;
        this.weight = Weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format(" %s (%.0f kg)" , this.name, this.weight);
    }
}
