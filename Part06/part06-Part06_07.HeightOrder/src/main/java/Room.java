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

public class Room {

    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }

    public void add(Person person) {
        if (person == null) {
            return;
        }

        room.add(person);
    }

    public boolean isEmpty() {
        return this.room.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        ArrayList<Person> newRoom = new ArrayList<>(this.room);

        return newRoom;
    }

    public Person shortest() {
        if (this.room.isEmpty()) {
            return null;
        }
        Person shortestPerson = this.room.get(0);

        for (Person i : this.room) {
            if (i.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = i;
            }
        }
        return shortestPerson;

    }

    public Person take() {
        if (this.room.isEmpty()) {
            return null;
        }

        Person shortestPerson = shortest();

        this.room.remove(shortestPerson);

        return shortestPerson;

    }
}
