public class Main {
    public static void main(String[] args) {

        //ДЗ-1.

        //Задание 1.
        {
            System.out.println("Циклы ч2. ДЗ-1. Задача 1");
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
        // Задание 2.
        System.out.println("Циклы ч2. ДЗ-1. Задача 2");
        {
            int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");}
            System.out.println( );
        }
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " "); }


    }
}