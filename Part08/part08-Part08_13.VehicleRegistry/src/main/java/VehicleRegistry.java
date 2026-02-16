
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MatheusPC
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> plates = new HashMap<>();

    public VehicleRegistry() {
        this.plates = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.plates.containsKey(licensePlate)) { //Se a placa nao existir, retorna false
            this.plates.put(licensePlate, owner);
            return true;
        }

        return false;
    }

    public String get(LicensePlate licensePlate) {
        return this.plates.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.plates.containsKey(licensePlate)) {
            this.plates.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate license : this.plates.keySet()) {
            System.out.println(license);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (LicensePlate ownerS : this.plates.keySet()) {
            String owner = this.plates.get(ownerS);
            if (!owners.contains(owner)) {
                owners.add(owner);
            }
        }
        for (String i : owners) {
            System.out.println(i);
        }
    }
}
