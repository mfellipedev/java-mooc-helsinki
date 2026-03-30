
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        map.add("um", 1);
        map.add("dois", 2);
        map.add("três", 3);

        System.out.println(map.get("dois"));  // Deve imprimir: 2

        map.add("dois", 99);  // Atualiza o valor
        System.out.println(map.get("dois"));  // Deve imprimir: 99

        System.out.println(map.remove("três"));  // Deve imprimir: 3
        System.out.println(map.get("três"));

    }

}
