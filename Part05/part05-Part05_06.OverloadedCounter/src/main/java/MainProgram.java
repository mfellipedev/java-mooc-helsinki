
public class MainProgram {

    public static void main(String[] args) {
        Counter one = new Counter(0);

        System.out.println(one.value());

        one.increase();
        System.out.println(one.value());

        one.increase(20);
        System.out.println(one.value());

        one.decrease();
        System.out.println(one.value());

        one.decrease(12);
        System.out.println(one.value());

    }
}
