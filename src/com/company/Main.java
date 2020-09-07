package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        Main mm = new Main();

        mm.vratPrvocisla(sc);
    }

    public void vratCislo(Scanner sc) {
        String cislo;
        Double cisloInt;
        System.out.println("Napiš číslo");
        cislo = sc.nextLine();
        cisloInt = Double.parseDouble(cislo);
        if (cisloInt % 7 == 0) {
            System.out.println("číslo je dělitelné sedmi");
        }

    }

    public void vratPrvocisla(Scanner sc) {

            int i =0;
            int cislo =0;

            String  prvoCislo = "";

            for (i = 1; i <= 100; i++)
            {
                int cislo1=0;

                for(cislo =i; cislo>=1; cislo--)
                {
                    if(i%cislo==0)
                    {
                        cislo1 = cislo1 + 1;
                    }
                }
                if (cislo1 ==2)
                {
                    System.out.println(i);

                }
            }
        public void posledniCviko(Scanner sc) {
                int cislo;
            int roundDown(double number, double place) {
                double result = number / place;
                result = Math.floor(result);
                result *= place;
                return (int)result;
            }

            roundDown(cislo/3);
        }

        sc.close();







    }
}