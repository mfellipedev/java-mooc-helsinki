
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.random = new Random(); //Objeto random
        this.randomizeNumbers(); //Metodo que vai gerar 7 numeros aleatorios diferentes

    }

    public ArrayList<Integer> numbers() {
        return this.numbers; //Retorna o ArrayList dos numeros gerados
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>(); //Inciando o Array

        while (this.numbers.size() < 7) { //Rodamos ate que size seja menor que 7
            int numb = random.nextInt(40) + 1; //Geramos um numero aleatorio, entre 0-39, utilizmaos +1 para evitar que o numero 0 seja considerado ou exibido, e para chegar ate 40
            if (!containsNumber(numb)) { //Se o numero nao existir dentro do array, adicionamos
                this.numbers.add(numb); //Adicionamos o numero ao array
            }
        }
    }

    public boolean containsNumber(int number) {

        return this.numbers != null && this.numbers.contains(number); //Se nao for null e, o numero estiver dentro do array, retorna true;
    }

    public boolean equals(Object obj) { //equals da classe
        if (!(obj instanceof LotteryRow)) { //É um objeto da classe LotteryRow?
            return false;
        }

        LotteryRow rowCopy = (LotteryRow) obj; //Cast para LotteryRow

        return this.numbers.equals(rowCopy.numbers()); //Se os numeros forem iguais, retorna true;
    }
    
    
}
