
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MatheusPC
 */
public class JokeManager {
    
    private ArrayList<String> joke;
    
    public JokeManager() {
        this.joke = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        if (joke.isEmpty()) {
            return;
        }
        this.joke.add(joke);
    }
    
    public String drawJoke() {
        if (this.joke.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random randomJokes = new Random();
        
        int i = randomJokes.nextInt(this.joke.size());
        return this.joke.get(i);
        
    }
    
    public void printJokes() {
        for (String i : joke) {
            
            System.out.println(i);
        }
    }
    
}
