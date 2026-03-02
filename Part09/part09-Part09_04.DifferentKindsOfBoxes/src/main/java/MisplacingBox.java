
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
public class MisplacingBox extends Box {

    private ArrayList<Item> boxMisplacing;

    public MisplacingBox() {
        this.boxMisplacing = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        this.boxMisplacing.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }

}
