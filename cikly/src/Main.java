import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej text jaký chceš vypsat");
        String x = sc.nextLine();
        System.out.println("Kolikrát ho chceš vypsat");
        int y = sc.nextInt();
        for (int i = 0; i < y ; i++) {
            System.out.println(x);
        }



    }{}
}