
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
public class OneItemBox extends Box {

    private final static int capacity = 1;
    private ArrayList<Item> boxOneItem;

    public OneItemBox() {
        this.boxOneItem = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.boxOneItem.size() < capacity) {
            this.boxOneItem.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.boxOneItem.contains(item);
    }
}
