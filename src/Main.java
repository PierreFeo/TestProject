public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world, people!!");
        int a = 2;
        int b = 3;
        int c = 0;

        while (true) {
            c++;
            System.out.println("Цифра меньше 5, идем дальше!");
            if (c >= 5) {
                break;
            }
        }
        System.out.println("Пятерка!!");
    }
}