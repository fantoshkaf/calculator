package javaLab2;

import java.util.Scanner;

/**
 * Программа для выполнения простых операций калькулятора и поиска максимального элемента массива.
 *
 * @author Anton Fedyaev
 * @version 2.0
 * @since 07.12.2025
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte choice;
        try {
            System.out.print("Введите номер задачи(1- калькулятор, 2- поиск максимального элемента массива): ");
            choice = sc.nextByte();
            if (choice != 1 && choice != 2) {
                throw new IllegalArgumentException();
            }

        } catch (Exception e) {
            System.out.println("Ошибка: вводить можно только 1 и 2!");
            return;
        }
        switch (choice) {
            case 1:
                Calculator.enterCalculator(sc);
                break;

            case 2:
                MaxFinder.enterMaxFind(sc);

                break;

        }

        sc.close();
    }
}
