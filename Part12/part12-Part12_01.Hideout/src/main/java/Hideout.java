/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MatheusPC
 */
public class Hideout<T> {

    private T parameter;

    public Hideout() {
    }

    public void putIntoHideout(T toHide) {
        this.parameter = toHide;
    }

    public T takeFromHideout() {
        T copy = this.parameter;
        this.parameter = null;
        return copy;
    }

    public boolean isInHideout() {
        return this.parameter != null;

    }
}
