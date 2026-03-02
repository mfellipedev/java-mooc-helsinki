/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MatheusPC
 */
public class CD implements Packable {

    private String artist;
    private String cdName;
    private int yearOfPublication;
    public static final double WEIGHT_CD = 0.1;

    public CD(String artist, String cdName, int yearOfPublication) {
        this.artist = artist;
        this.cdName = cdName;
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public double weight() {
        return this.WEIGHT_CD;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.cdName + " (" + this.yearOfPublication + ")";
    }

}
