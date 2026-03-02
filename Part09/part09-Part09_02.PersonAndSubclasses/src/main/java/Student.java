/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MatheusPC
 */
public class Student extends Person {

    private int study;

    public Student(String name, String address) {
        super(name, address);
        this.study = 0;
    }

    public void study() {
        this.study++;
    }

    public int credits() {
        return this.study;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "  "+ "Study credits " + this.study;
    }

}
