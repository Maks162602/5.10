package com.company;

public class Main {

        public static void main(String[] args) {

            int i = 500;
            for(; i<=650; i=i+10){
                System.out.println(i);
            }

            int j=500;
            while (j<=650){
                System.out.print(j + " ");
                j+=10;
            }
            int a = 500;
            do {
                a = a + 10;
                System.out.println(a + " ");
            } while (a < 650) ;

    }
}
