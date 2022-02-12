public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world, people!!");
        int a = 2;
        int b = 3;
        int c = a + b;
        System.out.println("2 + 3= " + c);

        while (true) {
            if (c < 5) {
                System.out.println("Цифра меньше 5, идем дальше!");
            } else System.out.println("опа!Пятерка!!");
            break;
        }
    }
}