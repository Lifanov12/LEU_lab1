package leu_lab1;

import java.util.Scanner;

public class LEU_lab1 {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Cоздание простой консольной программы");
            System.out.print("Введите число X: " );
            double x = scan.nextDouble();
            System.out.print("Введите число А: ");
            double a = scan.nextDouble();
            System.out.print("Введите число B: ");
            double b = scan.nextDouble();
            double y;

            if (x > 6) {
                y = (6 * Math.pow(x, 2) - a * b) / (2 * Math.pow(x, 2));
            } 
            else  {
                y = 4 * (x + Math.pow(a, 2) + Math.pow(b, 2));

            }
            System.out.format("Y=%.3f", y);
            //System.out.print("Y="+ y);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Входные параметры заданы неверно!");
        }

    }

}
