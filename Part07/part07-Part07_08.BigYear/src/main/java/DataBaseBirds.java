
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
public class DataBaseBirds {

    private ArrayList<Bird> listBirds;

    public DataBaseBirds() {
        this.listBirds = new ArrayList<>();
    }

    public void add(String name, String latinName) {
        if (name.isEmpty() || latinName.isEmpty()) {
            return;
        }
        listBirds.add(new Bird(name, latinName));
    }

    public Bird one(String name) {
        for (Bird birds : listBirds) {
            if (birds.getName().equals(name) || birds.getLatinName().equals(name)) {
                return birds;
            }
        }
        return null;
    }

    public boolean observation(String name) {
        if (name.isEmpty()) {
            return false;
        }
        for (Bird birds : listBirds) {
            if (birds.getName().equals(name) || birds.getLatinName().equals(name)) {
                birds.observationAdds();
                return true;
            }
        }
        return false;
    }

    public ArrayList<Bird> all() {
        ArrayList<Bird> copyBirds = new ArrayList<>(this.listBirds);
        return copyBirds;
    }

}
