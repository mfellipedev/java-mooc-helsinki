
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
public class ChangeHistory {

    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    public void add(double status) {

        this.changeHistory.add(status);

    }

    public void clear() {
        this.changeHistory.clear();
    }

    @Override
    public String toString() {
        return this.changeHistory.toString();
    }

    public double maxValue() {
        if (this.changeHistory.isEmpty()) {
            return 0;
        }
        double maxValue = this.changeHistory.get(0);
        for (Double i : this.changeHistory) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    public double minValue() {
        if (this.changeHistory.isEmpty()) {
            return 0;
        }
        double minValue = this.changeHistory.get(0);
        for (Double i : this.changeHistory) {
            if (i < minValue) {
                minValue = i;
            }
        }
        return minValue;
    }

    public double average() {
        if (this.changeHistory.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Double i : this.changeHistory) {
            sum += i;
        }
        return sum / this.changeHistory.size();
    }

}
