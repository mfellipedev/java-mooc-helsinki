/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MatheusPC
 */
public class List<T> {

    private T[] values; //Array com tipo generico
    private int firstFreeIndex; //Valor para saber qual index valido esta disponivel para ser alocado um novo valor

    public List() {
        this.values = (T[]) new Object[10]; //Criamos o array de forma diferente, usamos cast para generico, mas inciamos como tipo Objeto que pode conter qualquer objeto.
        this.firstFreeIndex = 0; //Definimos o indice inicial valido como 0
    }

    public void add(T value) {
        if (this.firstFreeIndex == this.values.length) { //Se o indice atual for igual ao tamanho do array, chamaos grow() para expandir o tamanho do array
            grow();
        }
        this.values[this.firstFreeIndex] = value; //Atribuimos a um indice o valor passado como parametro, sabemos onde adicionar o valor seguindo o firstFreeIndex
        this.firstFreeIndex++; //Quando o valor é adicionado, incrementamos firstFreeIndex em 1
    }

    public void grow() {
        int newSize = this.values.length + this.values.length / 2; //Para saber o novo tamanho de array, realizamos esta operacao
        T[] newValues = (T[]) new Object[newSize]; //Criando o novo array com tamanho atualizado
        for (int i = 0; i < this.values.length; i++) { //Loop que percorre todo o array antigo, atribuindo ao novo cada valor passado
            newValues[i] = this.values[i];
        }
        this.values = newValues; //Alteramos a referencia do antigo array para o novo, o array descartado é limpo pelo Java posteriormente
    }

    public boolean contains(T value) {
        return indexOfValue(value) >= 0; //Aqui verificamos se o retorno é maior que 0, o metodo indexOfValue somente retorna um valor abaixo de 0 caso o valor nao seja encontrado
    }

    public void remove(T value) {
        int indexOfValue = indexOfValue(value); //Atribuimos o indice retornado pelo metodo a variavel
        if (indexOfValue < 0) { //Se o indice for menor que 0, encerramos
            return;
        }
        moveToTheLeft(indexOfValue); //Chamamos o metodo moveToTheLeft que ira movimentar os valores para a esquerda, evitando de ter um buraco no array
        this.firstFreeIndex--; //Decrementamos a varaivel pois removemos um valor que existia
    }

    public int indexOfValue(T value) {
        for (int i = 0; i < this.firstFreeIndex; i++) { //Loop que ira percorrer os valores validos
            if (this.values[i].equals(value)) { //Se o valor atual do indice, for igual ao valor passado de parametro, retornamos o indice
                return i;
            }
        }
        return -1; //Se nenhum valor for encontrado, retornamos -1
    }

    public void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) { //Comecamos o loop do indice passado como parametro, percorrendo cada valor que for valido, utilizamos -1 para que nao ocorra exception
            this.values[i] = this.values[i + 1]; //Copiamos os valores da direita para a esqueda, seguindo o indice passado como parametro, [i + 1] serve para saber o valor da direita, que sera copiado
        }
    }
    
    public T value(int index) {
    if (index < 0 || index >= this.firstFreeIndex) {
        throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
    }

    return this.values[index];
}

    public int size() {
        return this.firstFreeIndex;
    }

}
