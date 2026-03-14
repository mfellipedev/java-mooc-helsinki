/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MatheusPC
 */
public class Person {

    private String name;
    private Education specialization;

    public Person(String name, Education specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public Education getEducation() {
        return specialization;
    }

    @Override
    public String toString() {
        return this.name + ", " + specialization;
    }

}
