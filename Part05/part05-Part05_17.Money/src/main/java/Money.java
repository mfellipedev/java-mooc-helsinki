
import java.util.Objects;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) { 
            euros = euros + cents / 100; //Escolhi usar a matematica simples de obter o valor dividido por 100, para obter a quantidade de euros correta
            cents = cents % 100; //Usei o operador de resto para saber quantos cents sobrariam do parametro informado
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) { //Regra simples para manter o padrao, o 0 sempre vai existir no cents enquanto for menor que 10
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        addition = Objects.requireNonNull(addition, "Insira um valor valido"); //Escolhi usar o requireNonNull para encerrar o programa caso o objeto do parametro seja invalido
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents); //Matematica simples diretamente na criacao do objeto para um codigo mais simples
        return newMoney;

    }

    public boolean lessThan(Money compared) {
        int totalMoney = (this.euros * 100) + this.cents; //Criacao de duas variaveis para isolar o valor total convertido em cents
        int totalMoneyCompared = (compared.euros * 100) + compared.cents;

        return totalMoney < totalMoneyCompared;
    }

    public Money minus(Money decreaser) {
        if (lessThan(decreaser)) { //Verificamos no inicio se o objeto da instancia atual é menor que o parametro, em caso verdadeiro, criamos um novo objeto com valores zerados
            Money newMoney = new Money(0, 0);
            return newMoney;
        }
        int totalMoney = (this.euros * 100) + this.cents; //Optei por uma resolucao mais simples e direta, isolamento de duas novas variaveis com o total convertido em cents
        int totalMoneyCompared = (decreaser.euros * 100) + decreaser.cents;
        int diference = totalMoney - totalMoneyCompared;

        Money newMoney = new Money(diference / 100, diference % 100); //Criacao do novo objeto, optei por criar diretamente com o resultado da divisao e resto por 100, obtendo os valores de euros e cents
        return newMoney;

    }

}
