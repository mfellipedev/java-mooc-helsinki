
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> itemsList = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Items item = new Items(identifier, name);
            if (itemsList.contains(item)) {

            } else {
                itemsList.add(item);
            }

        }

        for (Items i : itemsList) {
            System.out.println(i);
        }

    }
}


//Funcao do programa - Gerenciar um arquivo - Varios itens podem ser adicionados - quando nenhum item for adicionado todos seram impressos
