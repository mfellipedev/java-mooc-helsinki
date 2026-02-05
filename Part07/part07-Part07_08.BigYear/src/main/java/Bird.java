/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MatheusPC
 */
public class Bird {

    private String name;
    private String latinName;
    private int Observation;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.Observation = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservation() {
        return Observation;
    }

    public void observationAdds() {
        this.Observation++;
    }

    @Override
    public String toString() {
        if (this.Observation == 1) {
            return String.format("%s, (%s): %d Observation", this.name, this.latinName, this.Observation);
        }
        return String.format("%s, (%s): %d Observations", this.name, this.latinName, this.Observation);
    }

}
