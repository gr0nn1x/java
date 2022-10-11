import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int vys = 1;
        for (int i = 1; i <= x ; i++)
        {
            vys = vys * i;
        }

        System.out.println("Vysledek faktorialu:" + vys);


    }
}