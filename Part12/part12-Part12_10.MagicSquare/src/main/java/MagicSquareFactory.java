
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size); //Criacao do objeto square com o tamanho size passado como parametro
        int row = 0; //Linha inicial
        int col = size / 2; //Indice central

        for (int i = 1; i <= size * size; i++) { //Loop responsavel por armazenar os valores em cada bloco do square
            int prevRow = row; //Guardamos a linha atual
            int prevCol = col; //Guardamos a coluna atual
            square.placeValue(col, row, i); //Armazenamos um valor, na coluna COL na linha ROW, o valor sera i
            row--; //Agora que armazenamos o valor inicial no centro, descemos uma linha
            col++; //Andamos uma casa para a direita
            
            if (col >= size) { //Se a coluna atual, for maior ou igual a size, iremos retornar para o indice 0 da col
                col = 0;
            }
            if (row < 0) { //Se a linha for menor que 0, vamos para a ultima linha
                row = size - 1;
            }
            if (square.readValue(col, row) > 0) { //O local esta ocupado por algum numero maior que 0?
                row = prevRow + 1; //Alteramos a linha para a anterior, onde foi adicionado um valor, e subimos uma linha
                col = prevCol; //Voltamos para a coluna anterior
            }

        }

        return square;
    }

}
