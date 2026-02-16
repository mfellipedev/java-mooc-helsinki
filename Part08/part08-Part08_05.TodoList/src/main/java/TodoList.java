
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
public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        if (task.isEmpty()) {
            return;
        }
        tasks.add(task);
    }

    public void print() {
        int count = 1;
        for (String i : tasks) {
            System.out.println(count + ": " + i);
            count++;
        }
    }

    public void remove(int index) {
        tasks.remove(index - 1);
    }

}
