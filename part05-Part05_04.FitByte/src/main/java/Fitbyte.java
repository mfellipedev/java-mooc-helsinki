/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MatheusPC
 */
public class Fitbyte {

    private int age;
    private int restingHeart;

    public Fitbyte(int age, int restingHeart) {
        this.age = age;
        this.restingHeart = restingHeart;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double fcMax = 206.3 - (0.711 * age);
        return (fcMax - this.restingHeart) * (percentageOfMaximum) + this.restingHeart; //Calculo feito -> Frequencia maxima menos frequencia de repouspo, * pela porcetagem fornecida pelo usuario + frquencia de repouso
    }

}

/*

1 - Formula = (maximum heart rate - resting heart rate) * (target heart rate percentage) + resting heart
, onde a frequência cardíaca alvo é dada como uma porcentagem da frequência cardíaca máxima. 

2- Constructor deve receber como parametro - Idade / FrquenciaCardiaca em Repouso ~~
3 - Deve existir o metodo targetHeartRate, que recebe como parametro um tipo double, que sera a frequencia maxima

 */
