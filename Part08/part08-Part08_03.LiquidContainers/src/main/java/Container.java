
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MatheusPC
 */
public class Container {
    
    //Existem dois exercicios semelhantes, esse deveria ser executado somente no main, mas utilizei o metodo de separar classes, o exercicio abaixo tera uma repeticao de codigo igaul a este

    private int liquid;

    public Container() {
        this.liquid = 0;
    }

    public void add(int amount) {

        if (amount > 0) {
            this.liquid += amount;
        }

        if (this.liquid > 100) {
            this.liquid = 100;
        }
    }

    public void move(Container target, int amount) {
        if (amount > this.liquid) {
            target.add(this.liquid);
            this.liquid = 0;
        } else {
            target.add(amount);
            this.liquid -= amount;
        }

    }

    public void remove(int amount) {
        if (amount > this.liquid) {
            this.liquid = 0;
        } else {
            this.liquid -= amount;
        }
    }

    public int getLiquid() {
        return liquid;
    }

    @Override
    public String toString() {
        return this.liquid + "/" + "100";
    }

}
