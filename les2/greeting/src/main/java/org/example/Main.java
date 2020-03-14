package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int currentHour = 19;
        final String currentDay = "суббота";
        String[] weekdays = {"понедельник", "вторник", "среда", "четверг", "пятница" };
        if (Arrays.asList(weekdays).contains(currentDay.toLowerCase())) {
            if (currentHour <= 8) {
                System.out.println("Доброе утро");
            } else if (currentHour > 8 && currentHour < 11) {
                System.out.println("Всё пропало ты проспал!");
            } else {
                System.out.println("Включай почту, составляй письмо, что сегодня берёшь отгул");
            }
        } else {
            if (currentHour <= 12) {
                System.out.println("Доброе утро");
            } else if (currentHour > 12 && currentHour <= 16) {
                System.out.println("Лучше поспать ещё");
            } else if (currentHour > 16 && currentHour <= 18) {
                System.out.println("Вставай, тебя ждёт недоигранный Ведьмак!");
            } else {
                System.out.println("Дааа, с режимом надо что-то делать");
            }
        }

    }
}
