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

public class Package {

    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        if (gift == null) {
            return;
        }

        gifts.add(gift);
    }

    public int totalWeight() {
        int total = 0;
        for (Gift i : gifts) {
            total += i.getWeight();
        }

        return total;
    }

}
