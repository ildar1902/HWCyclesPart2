import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        //ДЗ-1.
        //Задание 1.
        {
            System.out.println("    Циклы ч2. ДЗ-1. Задача 1");
            int depositAmount = 15000;
            int amountOfSavings = 0;
            int i = 0;
            while (amountOfSavings <= 2_459_000) {
                i++;
                amountOfSavings = amountOfSavings + amountOfSavings / 100;
                amountOfSavings = amountOfSavings + depositAmount;
                System.out.println("Месяц " + i + " сумма накоплений равна " + amountOfSavings + " рублей");
            }
        }
        System.out.println();
        // Задание 2.
        {
            System.out.println("    Циклы ч2. ДЗ-1. Задача 2");
            {
                int i = 0;
                while (i < 10) {
                    i++;
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            for (int i = 10; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println();
        }
        //Задание 3.
        {
            System.out.println("    Циклы ч2. ДЗ-1. Задача 3");
            int populationSize = 12_000_000;
            int birthRate = populationSize / 1000 * 17;
            int mortality = populationSize / 1000 * 8;

            for (int i = 1; i <= 10; i++) {
                populationSize = populationSize + birthRate - mortality;
                if (i == 1) {
                    System.out.println("Через " + i + " год численность населения составляет " + populationSize + " человек");
                } else if (i <= 4) {
                    System.out.println("Через " + i + " года численность населения составляет " + populationSize + " человек");
                } else {
                    System.out.println("Через " + i + " лет численность населения составляет " + populationSize + " человек");
                }
            }
        }
        System.out.println();

        // ДЗ-2.
        //Задание 1.
        System.out.println("    Циклы ч2. ДЗ-2. Задача 1");
        {
            int month = 0;
            for (int amountOfSavings = 15000; amountOfSavings <= 12_500_000; amountOfSavings = amountOfSavings + amountOfSavings / 100 * 7) {
                month++;
                if (amountOfSavings == 15000) {
                    System.out.println("Месяц " + month + "-й, положили на счёт " + amountOfSavings + " рублей, ждём...");
                } else if (amountOfSavings < 12_000_000) {
                    System.out.println("Месяц " + month + "-й, на счету уже " + amountOfSavings + " рублей!");
                } else {
                    System.out.println("Месяц " + month + "-й! Цель достигнута! На счету " + amountOfSavings + " рублей!");
                }
            }
        }
        System.out.println();

        //Задание 2.
        System.out.println("    Циклы ч2. ДЗ-2. Задача 2");
        {
            int amountOfSavings = 15000;
            int month = 1;
            while (amountOfSavings <= 12_000_000) {
                month++;
                amountOfSavings = amountOfSavings + amountOfSavings / 100 * 7;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + " сумма накоплений равна " + amountOfSavings + " рублей");
                }
            }
        }
        System.out.println();
        // Задание 3.
        System.out.println("    Циклы ч2. ДЗ-2. Задача 3");
        {
            int amountOfSavings = 15000;
            int nineYears = 12 * 9;
            int month = 1;
            while (month <= nineYears) {
                month++;
                amountOfSavings = amountOfSavings + amountOfSavings / 100 * 7;
                if (month % 6 == 0)
                    System.out.println("Месяц " + month + " сумма накоплений равна " + amountOfSavings + " рублей");
            }
        }
        System.out.println();

        //Задание 4.
        System.out.println("    Циклы ч2. ДЗ-2. Задача 4");
        {
            for (int friday = 1; friday < 31; friday = friday + 7) {
                System.out.println("Cегодня пятница " + friday + "-е число. Необходимо подготовить отчёт!");
            }
        }
        System.out.println();

        //ДЗ 4.
        //Задание 1.
        System.out.println("    Циклы ч2. ДЗ-3. Задача 1");
        {
            int appearanceOfComet = 0;
            int start = LocalDate.now().getYear() - 200;
            int finish = LocalDate.now().getYear() + 100;
            while (appearanceOfComet <= finish) {
                appearanceOfComet = appearanceOfComet + 79;
                if (appearanceOfComet > start && appearanceOfComet < finish) {
                    System.out.println(appearanceOfComet);
                }
            }
            System.out.println();
        }
        // Задание 2.
        System.out.println("    Циклы ч2. ДЗ-3. Задача 2");
        {
            int a = 2;
            int b = 0;
            int c = 0;
            while (b < 10) {
                b++;
                c = c + 2;
                System.out.println(a + "*" + b + "=" + c);
            }
        }
        System.out.println();
        System.out.println("    Конец урока. Всем спасибо за внимание.");
    }
}