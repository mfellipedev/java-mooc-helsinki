
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MatheusPC
 */
public class RecipeRepository {

    private ArrayList<Recipe> recipes;

    public RecipeRepository() {
        this.recipes = new ArrayList<>();
    }

    public void recipeReader(String fileName) {
        try {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNextLine()) {
                String name = file.nextLine();
                int time = Integer.parseInt(file.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while (file.hasNextLine()) {
                    String line = file.nextLine();
                    if (line.isEmpty()) {
                        break;
                    }
                    ingredients.add(line);
                }
                recipes.add(new Recipe(name, time, ingredients));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Recipe> list() {
        return this.recipes;
    }

    public ArrayList<Recipe> findName(String name) {
        ArrayList<Recipe> found = new ArrayList();

        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                found.add(recipe);
            }
        }
        return found;
    }

    public ArrayList<Recipe> findCookingTime(int cookingTime) {
        ArrayList<Recipe> found = new ArrayList<>();
        for (Recipe recipes : recipes) {
            if (recipes.getTime() <= cookingTime) {
                found.add(recipes);
            }
        }
        return found;
    }

    public ArrayList<Recipe> findIngredient(String ingredient) {
        ArrayList<Recipe> found = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getIngredient().contains(ingredient)) {
                found.add(recipe);
            }
        }
        return found;
    }

}
