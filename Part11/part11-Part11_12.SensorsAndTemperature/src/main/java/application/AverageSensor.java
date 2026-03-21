/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author MatheusPC
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensorControl;
    private List<Integer> reads;

    public AverageSensor() {
        this.sensorControl = new ArrayList<>();
        this.reads = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensorControl) {
            if (sensor.isOn() == false) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : this.sensorControl) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.sensorControl) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!this.isOn() || this.sensorControl.isEmpty()) {
            throw new IllegalStateException();
        }
        int aver = (int) this.sensorControl.stream()
                .mapToInt(sensor -> sensor.read())
                .average()
                .getAsDouble();

        this.reads.add(aver);
        return aver;

    }

    public void addSensor(Sensor toAdd) {
        if (toAdd == null) {
            return;
        }

        this.sensorControl.add(toAdd);
    }

    public List<Integer> readings() {
       List<Integer> copyReads = new ArrayList<>(this.reads);
       return copyReads;
    }

}
