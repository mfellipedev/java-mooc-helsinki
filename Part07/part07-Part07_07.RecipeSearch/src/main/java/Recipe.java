
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
public class Recipe {

    private String name;
    private int time;
    private ArrayList<String> ingredient;

    public Recipe(String name, int time, ArrayList<String> ingredient) {
        this.name = name;
        this.time = time;
        this.ingredient = ingredient;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public ArrayList<String> getIngredient() {
        ArrayList<String> copyReceites = new ArrayList<>(this.ingredient);
        return copyReceites;
    }

    @Override
    public String toString() {
        return this.name + "," + " cooking time: " + this.time;
    }

}
