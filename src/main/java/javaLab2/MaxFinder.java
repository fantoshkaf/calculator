package javaLab2;

import java.util.Scanner;

public class MaxFinder {

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

        System.out.println("Самое длинное слово: "+findMax(words));
    }

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
