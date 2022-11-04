import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pro1 = 10;
        int pro2 = 20;
        int pro3 = 30;
        int pro4 = 40;
        int pro5 = 50;
        int pro6 = 60;
        int pro7 = 70;
        int pro8 = 80;
        int pro9 = 90;
        int balance = 0;
        for (int i = 0; i < 15; i++) {
            System.out.println("|-----------------------------------------------------|");
            System.out.println("|                  VÝTEJTE V OBCHODĚ                  |");
            System.out.println("| PRO ZVOLENÍ KATEGORIE NAPIŠTE JEJÍ ČÍSLO DO KONZOLE |");
            System.out.println("|               1 - [     Trička     ]                |");
            System.out.println("|               2 - [    Kalhoty     ]                |");
            System.out.println("|               3 - [      Boty      ]                |");
            System.out.println("|               4 - [Přejít k platbě ]                |");
            System.out.println("|_____________________________________________________|");
            int volba = sc.nextInt();
            if (volba == 1) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("|-----------------------------------------------------| ");
                    System.out.println("|               VÍTEJTE V SEKCI TRIČKA                |");
                    System.out.println("|               1 - [  Adidas :10kč ]                 |");
                    System.out.println("|               2 - [   Nike :20kč  ]                |");
                    System.out.println("|               3 - [  Levis :30kč  ]                 |");
                    System.out.println("|               4 - [  Zpět do menu ]                 |");
                    System.out.println("|_____________________________________________________|");
                    int polozka1 = sc.nextInt();
                    if (polozka1 == 1) {balance =balance + pro1;}
                    else if (polozka1 == 2) {balance =balance + pro2;}
                    else if (polozka1 == 3) {balance =balance + pro3;}
                    else if (polozka1 == 4) {break;}
                    System.out.println("|-----------------------------------------------------|");
                    System.out.println("| Z kategorie trička si můžete vybrat ještě 4 položky |");
                    System.out.println("|_____________________________________________________|");
                    int polozka2 = sc.nextInt();
                    if (polozka2 == 1) {balance =balance + pro1;}
                    else if (polozka2 == 2) {balance =balance + pro2;}
                    else if (polozka2 == 3) {balance =balance + pro3;}
                    else if (polozka2 == 4) {break;}
                    System.out.println("|-----------------------------------------------------|");
                    System.out.println("| Z kategorie trička si můžete vybrat ještě 3 položky |");
                    System.out.println("|_____________________________________________________|");
                    int polozka3 = sc.nextInt();
                    if (polozka3 == 1) {balance =balance + pro1;}
                    else if (polozka3 == 2) {balance =balance + pro2;}
                    else if (polozka3 == 3) {balance =balance + pro3;}
                    else if (polozka3 == 4) {break;}
                    System.out.println("|-----------------------------------------------------|");
                    System.out.println("| Z kategorie trička si můžete vybrat ještě 2 položky |");
                    System.out.println("|_____________________________________________________|");
                    int polozka4 = sc.nextInt();
                    if (polozka4 == 1) {balance =balance + pro1;}
                    else if (polozka4 == 2) {balance =balance + pro2;}
                    else if (polozka4 == 3) {balance =balance + pro3;}
                    else if (polozka4 == 4) {break;}
                    System.out.println("|-----------------------------------------------------|");
                    System.out.println("| Z kategorie trička si můžete vybrat ještě 1 položku |");
                    System.out.println("|_____________________________________________________|");
                    int polozka5 = sc.nextInt();
                    if (polozka5 == 1) {balance =balance + pro1;}
                    else if (polozka5 == 2) {balance =balance + pro2;}
                    else if (polozka5 == 3) {balance =balance + pro3;}
                    else if (polozka5 == 4) {break;}
                    break;
                }
                }
            if (volba == 2) {
                for (int k = 0; k < 5; k++) {
                    System.out.println("|-----------------------------------------------------| ");
                    System.out.println("|               VÍTEJTE V SEKCI KALHOTY               |");
                    System.out.println("|               1 - [  Adidas:40kč  ]                 |");
                    System.out.println("|               2 - [  Levis :50kč  ]                 |");
                    System.out.println("|               3 - [  Jogger :60k  ]                 |");
                    System.out.println("|               4 - [  Zpět do menu ]                 |");
                    System.out.println("|_____________________________________________________|");
                    int polozka6 = sc.nextInt();
                    if (polozka6 == 1) {balance =balance + pro4;}
                    else if (polozka6 == 2) {balance =balance + pro5;}
                    else if (polozka6 == 3) {balance =balance + pro6;}
                    else if (polozka6 == 4) {break;}
                    System.out.println("|-----------------------------------------------------|");
                    System.out.println("|Z kategorie Kalhoty si můžete vybrat ještě 4 položky |");
                    System.out.println("|_____________________________________________________|");
                    int polozka7 = sc.nextInt();
                    if (polozka7 == 1) {balance =balance + pro4;}
                    else if (polozka7 == 2) {balance =balance + pro5;}
                    else if (polozka7 == 3) {balance =balance + pro6;}
                    else if (polozka7 == 4) {break;}
                    System.out.println("|-----------------------------------------------------|");
                    System.out.println("|Z kategorie Kalhoty si můžete vybrat ještě 3 položky |");
                    System.out.println("|_____________________________________________________|");
                    int polozka8 = sc.nextInt();
                    if (polozka8 == 1) {balance =balance + pro4;}
                    else if (polozka8 == 2) {balance =balance + pro5;}
                    else if (polozka8 == 3) {balance =balance + pro6;}
                    else if (polozka8 == 4) {break;}
                    System.out.println("|-----------------------------------------------------|");
                    System.out.println("|Z kategorie Kalhoty si můžete vybrat ještě 2 položky |");
                    System.out.println("|_____________________________________________________|");
                    int polozka9 = sc.nextInt();
                    if (polozka9 == 1) {balance =balance + pro4;}
                    else if (polozka9 == 2) {balance =balance + pro5;}
                    else if (polozka9 == 3) {balance =balance + pro6;}
                    else if (polozka9 == 4) {break;}
                    System.out.println("|-----------------------------------------------------|");
                    System.out.println("|Z kategorie Kalhoty si můžete vybrat ještě 1 položku |");
                    System.out.println("|_____________________________________________________|");
                    int polozka10 = sc.nextInt();
                    if (polozka10 == 1) {balance =balance + pro4;}
                    else if (polozka10 == 2) {balance =balance + pro5;}
                    else if (polozka10 == 3) {balance =balance + pro6;}
                    else if (polozka10 == 4) {break;}
                    break;
                }
            }
            if (volba == 3) {
                for (int p = 0; p < 5; p++) {
                    System.out.println("|-----------------------------------------------------| ");
                    System.out.println("|               VÍTEJTE V SEKCI BOTY                  |");
                    System.out.println("|               1 - [   Decathlon :70kč ]             |");
                    System.out.println("|               2 - [  Balenciaga :80kč ]             |");
                    System.out.println("|               3 - [   Sneakers  :90kč ]             |");
                    System.out.println("|               4 - [    Zpět do menu   ]             |");
                    System.out.println("|_____________________________________________________|");
                    int polozka11 = sc.nextInt();
                    if (polozka11 == 1) {balance =balance + pro7;}
                    else if (polozka11 == 2) {balance =balance + pro8;}
                    else if (polozka11 == 3) {balance =balance + pro9;}
                    else if (polozka11 == 4) {break;}
                    System.out.println("|-----------------------------------------------------|");
                    System.out.println("|  Z kategorie Boty si můžete vybrat ještě 4 položky  |");
                    System.out.println("|_____________________________________________________|");
                    int polozka12 = sc.nextInt();
                    if (polozka12 == 1) {balance =balance + pro7;}
                    else if (polozka12 == 2) {balance =balance + pro8;}
                    else if (polozka12 == 3) {balance =balance + pro9;}
                    else if (polozka12 == 4) {break;}
                    System.out.println("|-----------------------------------------------------|");
                    System.out.println("|  Z kategorie Boty si můžete vybrat ještě 3 položky  |");
                    System.out.println("|_____________________________________________________|");
                    int polozka13 = sc.nextInt();
                    if (polozka13 == 1) {balance =balance + pro7;}
                    else if (polozka13 == 2) {balance =balance + pro8;}
                    else if (polozka13 == 3) {balance =balance + pro9;}
                    else if (polozka13 == 4) {break;}
                    System.out.println("|-----------------------------------------------------|");
                    System.out.println("|  Z kategorie Boty si můžete vybrat ještě 2 položky  |");
                    System.out.println("|_____________________________________________________|");
                    int polozka14 = sc.nextInt();
                    if (polozka14 == 1) {balance =balance + pro7;}
                    else if (polozka14 == 2) {balance =balance + pro8;}
                    else if (polozka14 == 3) {balance =balance + pro9;}
                    else if (polozka14 == 4) {break;}
                    System.out.println("|-----------------------------------------------------|");
                    System.out.println("|  Z kategorie Boty si můžete vybrat ještě 1 položku  |");
                    System.out.println("|_____________________________________________________|");
                    int polozka15 = sc.nextInt();
                    if (polozka15 == 1) {balance =balance + pro7;}
                    else if (polozka15 == 2) {balance =balance + pro8;}
                    else if (polozka15 == 3) {balance =balance + pro9;}
                    else if (polozka15 == 4) {break;}
                    break;

                }
            }
         if (volba == 4){
             break;
         }


        }

        System.out.println("|-----------------------------------------------------|");
        System.out.println("|               DĚKUJEME ZA VÁŠ NÁKUP                 |");
        System.out.println("|               VAŠE FINÁLNÍ CENA ČINÍ                |");
        System.out.println("                       "+ balance +"                   ");
        System.out.println("|_____________________________________________________|");
    }
}