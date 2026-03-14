
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.isBlank()) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            String age = scanner.nextLine();
            
            library.add(new Book(name, Integer.valueOf(age)));
        }
        
        System.out.println(library.quantityBooks() + " books in total.");
        
        System.out.println("Books:");
        library.listLibrary().stream()
                .sorted(Comparator.comparing(Book::getAgeRecommendation).thenComparing(Book::getName))
                .forEach(book -> System.out.println(book));
        
    }
}
