public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");

        int capital = 15_000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + capital;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        // Задача 2
        System.out.println("Задача 2");

        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println();

        for (i = 10; i >= 1; --i) {
            System.out.print(i + " ");
        }

        // Задача 3
        System.out.println("Задача 3");

        int population = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + population / 1000 * (birthRate - mortalityRate);
            System.out.println("Год " + year + " численность населения составляет " + population);
        }

        // Задача 4
        System.out.println("Задача 4");

        int deposit = 15_000;
        int quantityMouths = 0;

        while (deposit <= 12_000_000) {
            deposit = deposit + (deposit / 100) * 7;
            quantityMouths++;
            System.out.println(quantityMouths + " " + deposit);
        }

        // Задача 5
        System.out.println("Задача 5");

        int deposit1 = 15_000;
        int quantityMouths1 = 0;

        while (deposit1 <= 12_000_000) {
            deposit1 = deposit1 + (deposit1 / 100) * 7;
            quantityMouths1++;
            if (quantityMouths1 % 6 == 0) {
                System.out.println(quantityMouths1 + " " + deposit1);
            }
        }

        // Задача 6
        System.out.println("Задача 6");

        int deposit2 = 15_000;
        int quantityMouths2 = 0;

        while (quantityMouths2 <= 108) {
            deposit2 = deposit2 + (deposit2 / 100) * 7;
            quantityMouths2++;
            if (quantityMouths2 % 6 == 0) {
                System.out.println(quantityMouths2 + " " + deposit2);
            }
        }

        // Задача 7
        System.out.println("Задача 7");

        int currentFriday = 5;
        while (currentFriday <= 31) {
            System.out.println("Сегодня пятница, " + currentFriday + "-е число. Необходимо подготовить отчет");
            currentFriday = currentFriday + 7;
        }

        // Задача 8
        System.out.println("Задача 8");

int currentYear = 2024;
int startYear = currentYear - 200;
int finishYear = currentYear + 100;
int currentDate = startYear;
while (currentDate >= startYear && currentDate <= finishYear) {
    if (currentDate % 79 == 0) {
        System.out.println(currentDate);
    }
    currentDate++;
}



    }
}
