
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MatheusPC
 */
public class Items {

    private String identifier;
    private String name;

    public Items(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s: %s \n",
                this.identifier,
                this.name);
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Items)) {
            return true;
        }

        Items comparedItems = (Items) compared;

        return Objects.equals(this.identifier, comparedItems.identifier);
    }

}
