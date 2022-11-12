public class Main {
    public static void main(String[] args) {

        System.out.println( );
        //ДЗ-1.
        //Задание 1.
        {
            System.out.println("    Циклы ч2. ДЗ-1. Задача 1");
            int depositAmount = 15000;
            int AmountOfSavings = 0;
            int i = 0;
            while (AmountOfSavings <= 2_459_000) {
                i++;
                AmountOfSavings = AmountOfSavings + AmountOfSavings / 100;
                AmountOfSavings = AmountOfSavings + depositAmount;
                System.out.println("Месяц " + i + " сумма накоплений равна " + AmountOfSavings + " рублей");
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
            int PopulationSize = 12_000_000;
            int BirthRate = PopulationSize / 1000 * 17;
            int mortality = PopulationSize / 1000 * 8;

            for (int i = 1; i <= 10; i++) {
                PopulationSize = PopulationSize + BirthRate - mortality;
                if (i == 1) {
                    System.out.println("Через " + i + " год численность населения составляет " + PopulationSize + " человек");
                } else if (i <= 4) {
                    System.out.println("Через " + i + " года численность населения составляет " + PopulationSize + " человек");
                } else {
                    System.out.println("Через " + i + " лет численность населения составляет " + PopulationSize + " человек");
                }
            }
        }
        System.out.println( );

        // ДЗ-2.
        //Задание 1.
        System.out.println("    Циклы ч2. ДЗ-2. Задача 1"); {
                    int month = 0;
            for (int AmountOfSavings = 15000; AmountOfSavings <= 12_500_000; AmountOfSavings = AmountOfSavings + AmountOfSavings / 100 * 7) {
                month++;
                if (AmountOfSavings == 15000) {
                    System.out.println("Месяц " + month + "-й, положили на счёт " + AmountOfSavings + " рублей, ждём..."); }
                    else if (AmountOfSavings < 12_000_000){
                System.out.println("Месяц " + month + "-й, на счету уже " + AmountOfSavings + " рублей!"); }
                    else {
                    System.out.println("Месяц " + month + "-й! Цель достигнута! На счету " + AmountOfSavings + " рублей!");}
            }
        }
        System.out.println( );

        //Задание 2.
        System.out.println("    Циклы ч2. ДЗ-2. Задача 2");
        {
            int AmountOfSavings = 15000;
            int month =1;
            while ( AmountOfSavings <= 12_000_000)
            {  month++;
                AmountOfSavings = AmountOfSavings + AmountOfSavings / 100 * 7;
                if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + AmountOfSavings + " рублей");
                                    }
            }
        }
        System.out.println( );
        // Задание 3.
        System.out.println("    Циклы ч2. ДЗ-2. Задача 3"); {
            int AmountOfSavings = 15000;
            int nineYears = 12 * 9;
            int month    =1;
            while (month <= nineYears) {
                month++;
                AmountOfSavings = AmountOfSavings + AmountOfSavings / 100 * 7;
                if (month % 6 == 0)
                    System.out.println("Месяц " + month + " сумма накоплений равна " + AmountOfSavings + " рублей");
                            }
        }
        System.out.println( );

        //Задание 4.
        System.out.println("    Циклы ч2. ДЗ-2. Задача 4"); {
            for (int Friday = 1; Friday < 31; Friday = Friday + 7) {
                                                System.out.println( "Cегодня пятница " + Friday + "-е число. Необходимо подготовить отчёт!");
            }
        }
        System.out.println( );

        //ДЗ 4.
        //Задание 1.
        System.out.println("    Циклы ч2. ДЗ-3. Задача 1");
        {
            int appearanceOfComet = 0;
            while (appearanceOfComet <= 2100) {
                appearanceOfComet = appearanceOfComet + 79;
                if (appearanceOfComet > 1822 && appearanceOfComet < 2122) {
                    System.out.println(appearanceOfComet);
                }
            }
            System.out.println( );
        }
        // Задание 2.
        System.out.println("    Циклы ч2. ДЗ-3. Задача 2");{
            int a = 2;
            int b = 0;
            int c = 0;
            while (b <10) {
                b++;
                c = c + 2;
                System.out.println(a + "*" + b + "=" + c );
            }
        }
        System.out.println( );
        System.out.println("    Конец урока. Всем спасибо за внимание.");
    }
}