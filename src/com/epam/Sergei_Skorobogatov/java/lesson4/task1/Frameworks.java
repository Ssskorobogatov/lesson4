package com.epam.Sergei_Skorobogatov.java.lesson4.task1;

// Возможно не лучшее решение, но это первое что пришло в голову, а более лучшее решение обдумывать не хочется.
import java.util.*;

public class Frameworks {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(); // Создание коллекции

        for (int i = 0; i < 1000000; i++) { // Заполнение коллекции последовательностью чисел от 0 до 1000000
            list.add(i);
        }

        Collections.shuffle(list); // организация произвольного порядка

        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i) + " "); // Показываем что порядок произвольный, выводя первые 10 чисел к примеру
        }

        Map<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), true); // Map всегда содержит только уникальные ключи
        }

        System.out.println(list.size() == map.size()); // Если размеры равны то это значит что в исходной коллекции элементы были уникальны

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });

        System.out.println("Минимальный элемент: " + list.get(0));
        System.out.println("Предпоследний по величине элемент: " + list.get(list.size() - 2));

        ArrayList<Integer> alist = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                alist.add(list.get(i)); // Сохраняем только четные числа
            }
        }

        list = null;

        for (int i = 0; i < alist.size() / 1000; i++) { // первые 1000 элементов
            System.out.println(alist.get(i) + " "); // Выводим последовательность четных чисел
        }
    }
}