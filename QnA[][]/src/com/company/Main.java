package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pište bez diakritiky prosím");
        String[][] QnA = {
                {"0-jakou barvu má tráva", "1-jakou barvu ma nebe", "2-kolik je 1+1"},
                {"zelena", "modra", "dva"}
        };


        for (int i = 0; i < 3; i++) {
            System.out.println(QnA[0][i]);
            String odpoved = sc.nextLine();
            if (odpoved.equals(QnA[1][i])) {
                System.out.println("hezky kluku");
            } else {
                System.out.println("hloupí kluk");
            }
        }


    }
}
