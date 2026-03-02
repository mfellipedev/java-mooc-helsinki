
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MatheusPC
 */
public class Herd implements Movable {

    private ArrayList<Movable> herds;

    public Herd() {
        this.herds = new ArrayList<>();
    }

    public String toString() {
        String text = "";
        for (Movable i : this.herds) {
            text += i.toString() + "\n";
        }
        return text;
    }

    public void addToHerd(Movable movable) {
        if (!(movable instanceof Movable)) {
            return;
        }
        this.herds.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable i : this.herds) {
            i.move(dx, dy);
        }
    }

}
