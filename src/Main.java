public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");

        int capital = 15_000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + capital;
            total = total + total / 100;
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
        System.out.println(" ");

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
        int percent = 7;

        while (deposit <= 12_000_000) {
            deposit = deposit + (deposit / 100) * percent;
            quantityMouths++;
            System.out.println(quantityMouths + " " + deposit);
        }

        // Задача 5
        System.out.println("Задача 5");

        int deposit1 = 15_000;
        int quantityMouths1 = 0;
        int percent1 = 7;
        int period = 6;

        while (deposit1 <= 12_000_000) {
            deposit1 = deposit1 + (deposit1 / 100) * percent1;
            quantityMouths1++;
            if (quantityMouths1 % period == 0) {
                System.out.println(quantityMouths1 + " " + deposit1);
            }
        }

        // Задача 6
        System.out.println("Задача 6");

        int deposit2 = 15_000;
        int quantityMouths2 = 0;
        int quantitymounths3 = 9 * 12;
        int percent2 = 7;
        int period2 = 6;

        while (quantityMouths2 <= quantitymounths3) {
            deposit2 = deposit2 + (deposit2 / 100) * percent2;
            quantityMouths2++;
            if (quantityMouths2 % period2 == 0) {
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
int periodComet = 79;
while (currentDate >= startYear && currentDate <= finishYear) {
    if (currentDate % periodComet == 0) {
        System.out.println(currentDate);
    }
    currentDate++;
}



    }
}
