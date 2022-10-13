import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int cis1 = 0;
        int cis2 = 1;
        System.out.print("0 1 ");
        for (int i = 0; i < (x-2); i++) {
                   int next = cis1 + cis2;
            System.out.println(next + " ");
            cis1 = cis2;
            cis2 = next;

        }



    }
}