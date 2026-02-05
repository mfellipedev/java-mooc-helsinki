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
    
    private int amount;
    
    public Container() {
        this.amount = 0;
    }
    
    public int contains() {
        return this.amount;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        this.amount = Math.min(this.amount + amount, 100);
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        this.amount = Math.max(this.amount - amount, 0);
    }
    
    public void move(Container target, int amount) { //Objeto alvo e o valor inserido
        if (amount < 0) { //Verificacao simples para evitar erros com valores negativos
            return;
        }
        int amountToMove = amount;
        if (this.amount < amount) { //Verifico se o valor do meu objeto é menor que a quantidade inserida
            amountToMove = this.amount;//Atribuimos o valor do nosso objeto para o valor transferido, evitando valores negativos apos a transferencia
        }
        
        this.remove(amountToMove); //Removi do objeto atual a quantiadade correta 
        target.add(amountToMove);//Adiciono ao objeto alvo a quantidade
    }
    
    @Override
    public String toString() {
        return this.amount + "/" + "100";
    }
    
}
