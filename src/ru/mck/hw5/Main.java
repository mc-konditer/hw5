package ru.mck.hw5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание № 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание № 2");
        clientOS = 1;
        int clientDeviceYear = 2016;
        int limitYear = 2015;
        if (clientOS == 0 && clientDeviceYear > limitYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= limitYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear > limitYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("Задание № 3");
        int year = 2020;
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }

        System.out.println("Задание № 4");
        int devileryDistance = 2;
        int days = 1;
        if (devileryDistance > 100) {
            System.out.println("Доставки нет!");
        } else {
            if (devileryDistance >= 20) {
                days++;
            }
            if (devileryDistance >= 60) {
                days++;
            }
            System.out.println("Потребуется дней: " + days);
        }

        System.out.println("Задание № 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Месяц под номером " + monthNumber + " принадлежит сезону зима");
                break;
            case 3, 4, 5:
                System.out.println("Месяц под номером " + monthNumber + " принадлежит сезону весна");
                break;
            case 6, 7, 8:
                System.out.println("Месяц под номером " + monthNumber + " принадлежит сезону лето");
                break;
            case 9, 10, 11:
                System.out.println("Месяц под номером " + monthNumber + " принадлежит сезону зима");
                break;
            default:
                System.out.println("Не существующий месяц года");

        }
    }
}

