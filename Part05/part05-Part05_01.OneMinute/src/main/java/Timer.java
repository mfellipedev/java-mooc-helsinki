/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MatheusPC
 */
public class Timer {

    private int seconds;
    private int hundredthsSeconds;

    public Timer() {
        this.seconds = 0;
        this.hundredthsSeconds = 0;
    }

    public void advance() {
        this.hundredthsSeconds++;
        if (this.hundredthsSeconds == 100) {
            this.seconds++;
            this.hundredthsSeconds = 0;
        }
        if (this.seconds == 60) {
            this.seconds = 0;
        }
    }

    public String toString() {
        if (this.seconds < 10 & this.hundredthsSeconds < 10) {
            return "0" + this.seconds + ":0" + this.hundredthsSeconds;
        } else if (this.hundredthsSeconds < 10) {
            return "" + this.seconds + "0" + this.hundredthsSeconds;
        }
        return "" + this.seconds + ":" + this.hundredthsSeconds;
    }
}
