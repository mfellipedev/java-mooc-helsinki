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

public class Hold {

    private ArrayList<Suitcase> hold;
    private final int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase == null) {
            return;
        }

        int currentWeigth = weightHold();
        int newWeigth = suitcase.totalWeight();

        if (currentWeigth + newWeigth > this.maxWeight) {
            return;
        }
        hold.add(suitcase);

    }

    public int weightHold() {

        int sum = 0;
        for (Suitcase i : hold) {
            sum += i.totalWeight();
        }
        return sum;
    }

    public int quantitySuitCaseInHold() {
        return this.hold.size();
    }

    @Override
    public String toString() {
        return String.format("%d suitcases (%d kg)", quantitySuitCaseInHold(), weightHold());
    }

    public void printItems() {
        for (Suitcase i : hold) {
            i.printItems();
        }
    }
}
