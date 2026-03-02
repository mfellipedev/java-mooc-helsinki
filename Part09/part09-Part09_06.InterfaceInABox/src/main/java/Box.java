
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MatheusPC
 */
public class Box implements Packable {

    private ArrayList<Packable> box;
    private double maxCapacity;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.box = new ArrayList<>();
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable i : this.box) {
            weight += i.weight();
        }
        return weight;
    }

    public void add(Packable packable) {
        if (packable.weight() + weight() > this.maxCapacity) {
            return;
        }
        this.box.add(packable);

    }

    @Override
    public String toString() {

        return "Box: " + this.box.size() + " items," + " total weight " + weight() + " kg";
    }

}
