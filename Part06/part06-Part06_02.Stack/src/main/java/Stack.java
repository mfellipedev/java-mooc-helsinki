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

public class Stack {

    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void add(String value) {
        if (this.stack.contains(value)) {
            return;
        }
        this.stack.add(value);

    }

    public ArrayList<String> values() {
        ArrayList<String> copy = new ArrayList<>(this.stack);
        return copy;
    }

    public String take() {
        return this.stack.remove(this.stack.size() - 1);

    }

}
