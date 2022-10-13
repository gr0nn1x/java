import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
       int neg = 0;
       int pos = 0;
       int zero = 0;
        for (int i = 0; i < x; i++) {
            int next = sc.nextInt();
          if (next < 0) {neg++;}
          else if (next == 0) {zero++;}
          else {pos++;}


        }

        System.out.println("Záporných čísel je" + " " + pos);
        System.out.println("čísel rovno nule je" + " " + neg);
        System.out.println("kladných čísel je" + " " + zero);


    }
}