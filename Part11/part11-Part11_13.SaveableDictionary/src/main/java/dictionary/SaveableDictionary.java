/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

/**
 *
 * @author MatheusPC
 */
public class SaveableDictionary {

    private HashMap<String, String> directionary;
    private String fileName;

    public SaveableDictionary() {
        this.directionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.directionary = new HashMap<>();
        this.fileName = file;
    }

    public void add(String word, String translation) {
        this.directionary.putIfAbsent(word, translation);
    }

    public String translate(String word) {
        if (this.directionary.get(word) == null) {
            for (String translate : this.directionary.keySet()) {
                if (this.directionary.get(translate).equals(word)) {
                    return translate;
                }
            }

        }
        return this.directionary.get(word);
    }

    public void delete(String word) {
        String valueForRemove = "";
        if (this.directionary.get(word) == null) {
            for (String translate : this.directionary.keySet()) {
                if (this.directionary.get(translate).equals(word)) {
                    valueForRemove = translate;
                }
            }
            if (!valueForRemove.equals("")) {
                this.directionary.remove(valueForRemove);
                return;
            }

        }
        this.directionary.remove(word);
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(this.fileName))
                    .map(word -> word.split(":"))
                    .forEach(parts -> this.add(parts[0], parts[1]));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try (PrintWriter save = new PrintWriter(this.fileName);) {

            for (String word : this.directionary.keySet()) {
                save.println(word + ":" + this.directionary.get(word));
            }
            return true;

        } catch (Exception e) {
            return false;
        }
    }

}
