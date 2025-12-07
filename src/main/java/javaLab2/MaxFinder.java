package javaLab2;

import java.util.Scanner;

/**
 * Класс для поиска самого длинного слова в массиве строк.
 * Размер массива и сами слова вводятся с консоли.
 *
 * @author Anton Fedyaev
 * @version 1.0
 * @since 07.12.2025
 */
public class MaxFinder {
    /**
     * Запрашивает у длину массива и массив,
     * затем выводит самое длинное слово
     *
     * @param sc объект Scanner для чтения консоли
     */
    public static void enterMaxFind(Scanner sc) {

        int arrSize;
        try {
            System.out.print("Введите размер массива: ");
            arrSize = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Ошибка: вводить можно только целые числа");
            return;
        }
        System.out.println("Введите слова для массива");
        String[] words = new String[arrSize];
        for (int i = 0; i < arrSize; i++) {
            words[i] = sc.nextLine();
        }

        System.out.println("Самое длинное слово: " + findMax(words));
    }
    /**
     * Находит самое длинное слово в массиве строк.
     *
     * @param words массив слов
     * @return самое длинное слово в массиве
     */
    static String findMax(String[] words) {

        String maxWord = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxWord.length()) {
                maxWord = words[i];
            }
        }
        return maxWord;
    }
}
