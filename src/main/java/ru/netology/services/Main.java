package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        FreelancerService service = new FreelancerService();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int restMonths = service.calculateRestMonths(income, expenses, threshold);

        System.out.println("Количество месяцев отдыха: " + restMonths);
    }
}

