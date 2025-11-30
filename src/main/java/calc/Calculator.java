package calc;

import java.util.Scanner;

/**
 * Простой калькулятор для работы с дробными числами.
 * Поддерживает сложение, вычитание, умножение и деление.
 * Результат выводится с точностью до 4 знаков после запятой.
 *
 * @author Anton Fedyaev
 * @version 1.0
 * @since 29.11.2025
 */

public class Calculator {
    public static void main(String[] args) {

        double num1, num2, res;
        char math;
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("Введите первое число: ");
            num1 = sc.nextDouble();
            System.out.print("Введите второе число: ");
            num2 = sc.nextDouble();

        } catch (Exception e) {
            System.out.println("Ошибка: введено не число!");
            return;
        }
        try {
            System.out.print("Введите нужную операцию(+,-,*,/): ");
            math = sc.next().charAt(0);
        } catch (Exception e) {
            System.out.println("Ошибка: вводить можно только + - * /");
            return;
        }
        sc.close();

        res = calculate(num1, num2, math);

        // Проверка, что возвращен корректный результат
        if (!Double.isNaN(res)) {
            System.out.printf("Результат: %.4f%n", res);
        }
    }
    /**
     * Выполняет арифметическую операцию над двумя числами.
     *
     * @param num1 первое число
     * @param num2 второе число
     * @param math символ операции: +, -, *, /
     * @return результат вычисления или NaN в случае ошибки
     */
     static double calculate(double num1, double num2, char math) {
        double res;
        switch (math) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль!");
                    return Double.NaN;
                }
                res = num1 / num2;
                break;
            default:
                System.out.println("Неизвестная операция: " + math);
                return Double.NaN;

        }
        return res;
    }
}
