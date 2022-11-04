import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int castka = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Vítej do obchodu!, prosím zvol si kategorii");
            System.out.println("1: kat1");
            System.out.println("2: kat2");
            System.out.println("3: kat3");
            System.out.println("4: Přejít k platbě");
            int kat = sc.nextInt();
            switch (kat) {
                case 1:
                    for (int j = 0; j < 5; j++) {
                        System.out.println("1: prod11");
                        System.out.println("2: prod12");
                        System.out.println("3: prod13");
                        System.out.println("4: Zpět do menu");
                        int prod11 = sc.nextInt();
                        switch (prod11) {
                            case 1:
                                castka = castka + 10;
                                break;
                            case 2:
                                castka = castka + 20;
                                break;
                            case 3:
                                castka = castka + 30;
                                break;
                            case 4:

                                j = j + 5;
                                break;
                        }

                    }

                    for (int o = 0; o < 5; o++) {
                        System.out.println("1: prod21");
                        System.out.println("2: prod22");
                        System.out.println("3: prod23");
                        System.out.println("4: Zpět do menu");
                        int prod11 = sc.nextInt();
                        switch (prod11) {
                            case 1:
                                castka = castka + 50;
                                break;
                            case 2:
                                castka = castka + 100;
                                break;
                            case 3:
                                castka = castka + 150;
                                break;
                            case 4:

                                o = o + 5;
                        }


                    }

                case 3:
                    for (int k = 0; k < 5; k++) {
                        System.out.println("1: prod31");
                        System.out.println("2: prod32");
                        System.out.println("3: prod33");
                        System.out.println("4: Zpět do menu");
                        int prod11 = sc.nextInt();
                        switch (prod11) {
                            case 1:
                                castka = castka + 1000;
                                break;
                            case 2:
                                castka = castka + 2000;
                                break;
                            case 3:
                                castka = castka + 3000;
                                break;
                            case 4:
                                k = k + 5;
                        }


                    }
                case 4:
                    i = i + 10;
                    System.out.println("vaše finální částka je: " + castka + "Kč");
            }
        }


    }

}