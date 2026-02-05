
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
public class GradeStatistic {

    private ArrayList<Integer> gradeList;

    public GradeStatistic() {
        this.gradeList = new ArrayList<>();
    }

    public void add(int grade) {
        gradeList.add(grade);
    }

    public ArrayList<Integer> gradeList() {
        ArrayList<Integer> copyGrades = new ArrayList<>(this.gradeList);
        return copyGrades;
    }

    public double averageGrades() {
        if (this.gradeList.isEmpty()) {
            return 0;
        }
        double sum = 0;

        for (Integer i : gradeList) {
            sum += i;
        }

        return sum / gradeList.size();
    }

    public double averagePassing() {
        if (this.gradeList.isEmpty()) {
            return 0;
        }

        double sum = 0;
        int quantityPassing = 0;
        for (Integer i : gradeList) {
            if (i >= 50) {
                sum += i;
                quantityPassing++;
            }
        }
        if (quantityPassing == 0) {
            return -1;
        }
        return sum / quantityPassing;
    }

    public double passPercentage() {
        if (this.gradeList.isEmpty()) {
            return 0;
        }

        double passing = 0;

        for (Integer i : gradeList) {
            if (i >= 50) {
                passing++;
            }
        }
        double percentage = 100 * passing / this.gradeList.size();

        return percentage;
    }

    public int[] gradeDistribution() {

        if (this.gradeList.isEmpty()) {
            return new int[0];
        }
        int grade5 = 0;
        int grade4 = 0;
        int grade3 = 0;
        int grade2 = 0;
        int grade1 = 0;
        int grade0 = 0;

        for (Integer i : gradeList) {

            if (i < 50) {
                grade0++;
            } else if (i < 60) {
                grade1++;
            } else if (i < 70) {
                grade2++;
            } else if (i < 80) {
                grade3++;
            } else if (i < 90) {
                grade4++;
            } else {
                grade5++;
            }
        }

        return new int[]{grade0, grade1, grade2, grade3, grade4, grade5};
    }
}
