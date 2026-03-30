
import java.util.ArrayList;
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
public class Pipe<T> {

    private List<T> pipe;

    public Pipe() {
        this.pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        if (value != null) {
            this.pipe.add(value);
        }
    }

    public T takeFromPipe() {
        if (this.pipe.isEmpty()) {
            return null;
        }

        return this.pipe.remove(0);
    }

    public boolean isInPipe() {
        return !this.pipe.isEmpty();
    }

}
