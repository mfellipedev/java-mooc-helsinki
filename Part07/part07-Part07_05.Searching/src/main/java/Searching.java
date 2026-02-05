
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        /*
        for( loop que vai rodar ate o tamanho final do array ou ate ser encontrado)
        Condicao:
        Se o valor atual do indice, for igual ao valor buscado, retorne o indice
        Se nao, retorne -1
         */

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }

        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {

        int begin = 0;
        int end = books.size() - 1; //Ultimo indice da lista

        while (begin <= end) {
            int middle = (end + begin) / 2; //O indice do meio da lista sera igual ao indice final + indice do inicio , dividido por 2
            if (books.get(middle).getId() == searchedId) {
                return middle;
            }

            if (books.get(middle).getId() > searchedId) {

                end = middle - 1;

            }

            if (books.get(middle).getId() < searchedId) { 
                begin = middle + 1;
            }
            
            
        }

        return -1;
    }
}
