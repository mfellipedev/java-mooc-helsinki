
public class Apartment {

    private int rooms; //Quartos
    private int squares; //Metros Quadrados
    private int princePerSquare; //Preço Por Metro

    public Apartment(int rooms, int squares, int pricePerSquare) { //Constructor Da Classe
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) { //Retorna true se o objeto que chamou o metodo tiver uma area maior que o objeto comparado
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) { //Calcula a diferenca de preco entre dois objetos
        int priceThis = this.squares * this.princePerSquare; //Preço do objeto que fez a chamada
        int priceCompared = compared.squares * compared.princePerSquare; //Preço do objeto comparado

        return Math.abs(priceThis - priceCompared); //Retorna a subtracao com o valor absoluto
    }

    public boolean moreExpensiveThan(Apartment compared) { //Calcula qual é mais caro
        int priceThis = this.squares * this.princePerSquare; //Preço do objeto que fez a chamada
        int priceCompared = compared.squares * compared.princePerSquare; //Preço do objeto comparado

        return priceThis > priceCompared; //Retorna true caso o valor do objeto que fez a chamada seja maior
    }
}
