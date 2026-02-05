
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeRepository recipes = new RecipeRepository();

        System.out.println("File to read: ");
        String file = scanner.nextLine();
        recipes.recipeReader(file);

        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time\n"
                + "find ingredient - searches recipes by ingredient");

        while (true) {

            System.out.println("Enter Command: ");

            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            processCommand(command, scanner, recipes);
        }

    }

    public static void processCommand(String command, Scanner scanner, RecipeRepository repository) {
        if (command.equals("list")) {
            System.out.println("Recipes: ");
            for (Recipe recipe : repository.list()) {
                System.out.println(recipe);
            }
        } else if (command.equals("find name")) {
            System.out.println("Searched word:");
            String searched = scanner.nextLine();
            ArrayList<Recipe> recipesList = new ArrayList<>(repository.findName(searched));
            if (recipesList.isEmpty()) {
                System.out.println("Recipe not found");
            } else {
                for (Recipe recipes : repository.findName(searched)) {
                    System.out.println(recipes);
                }
            }
        } else if (command.equals("find cooking time")) {
            System.out.println("Max cooking time:");
            String time = scanner.nextLine();
            int maxTime = Integer.valueOf(time);
            ArrayList<Recipe> recipeList = new ArrayList<>(repository.findCookingTime(maxTime));
            if (recipeList.isEmpty()) {
                System.out.println("Recipe not found");
            } else {
                for (Recipe recipes : recipeList) {
                    System.out.println(recipes);
                }
            }

        } else if (command.equals("find ingredient")) {
            System.out.println("Ingredient:");
            String ingredient = scanner.nextLine();
            ArrayList<Recipe> recipeList = new ArrayList<>(repository.findIngredient(ingredient));
            if (recipeList.isEmpty()) {
                System.out.println("Recipe not found");
            } else {
                for (Recipe recipes : recipeList) {
                    System.out.println(recipes);
                }
            }

        }
    }

}
