
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MatheusPC
 */
public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        if (personToAdd == null) {
            return;
        }
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        if (peopleToAdd == null || peopleToAdd.isEmpty()) {
            return;
        }
        peopleToAdd.stream().forEach(people -> this.add(people));
    }

    public void print() {
        if (this.employees.isEmpty()) {
            return;
        }

        Iterator<Person> persons = employees.iterator();
        while (persons.hasNext()) {
            System.out.println(persons.next());
        }
    }

    public void print(Education education) {
        if (this.employees.isEmpty()) {
            return;
        }
        Iterator<Person> employesValid = this.employees.iterator();
        while (employesValid.hasNext()) {
            Person employeer = employesValid.next();
            if (employeer.getEducation().equals(education)) {
                System.out.println(employeer);
            }
        }
    }

    public void fire(Education education) {
        if (this.employees.isEmpty()) {
            return;
        }
        
        Iterator<Person> employesValid = this.employees.iterator();
        
        while (employesValid.hasNext()) {
            Person employeer = employesValid.next();
            if (employeer.getEducation().equals(education)) {
                employesValid.remove();
            }
        }
    }

}
