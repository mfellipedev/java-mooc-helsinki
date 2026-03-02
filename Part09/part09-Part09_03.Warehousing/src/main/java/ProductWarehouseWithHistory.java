/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MatheusPC
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changes;

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        super.addToWarehouse(initialBalance);

        this.changes = new ChangeHistory();
        this.changes.add(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);  
        this.changes.add(super.getBalance());  
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);  
        this.changes.add(super.getBalance());  
        return taken;
    }

    public String history() {
        return this.changes.toString();
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + changes.toString());
        System.out.printf("Largest amount of product: %.2f", changes.maxValue());
        System.out.println("");
        System.out.printf("Smallest amount of product: %.2f", changes.minValue());
        System.out.println("");
        System.out.printf("Average: %.2f", changes.average());
    }

}
