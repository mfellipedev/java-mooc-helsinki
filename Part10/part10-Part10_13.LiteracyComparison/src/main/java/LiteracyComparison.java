
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted((a, b) -> Double.compare(Double.valueOf(a[5]), Double.valueOf(b[5])))
                    .forEach(elements -> System.out.println(elements[3] + " (" + elements[4] + "), " + elements[2].split(" ")[1] + ", " + elements[5]));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
    }
}
