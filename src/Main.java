public class Main {
    public static void main(String[] args) {
        // Циклы.Часть 2.
        // Домашнее задание 1.
        // Задание 1.
        System.out.println(" Накопления + проценты по вкладу,цель накопить 2_459_000 рублей.");
        int contribution = 15_000;
        double totalContribution = 0;
        int z = 1;
        for (; totalContribution <= 2_459_000; z++) {
            totalContribution = totalContribution + totalContribution / 100;
            totalContribution = totalContribution + contribution;
            System.out.println("Месяц " + z + " ,сумма накоплений равна "
                    + String.format("%.2f", totalContribution) + " рублей.");
        }
        z = z + 1;
        {
            totalContribution = totalContribution + totalContribution / 100;
            totalContribution = totalContribution + contribution;
            System.out.println("Месяц " + z + " ,сумма накоплений равна "
                    + String.format("%.2f", totalContribution) + " рублей.");
        }
        // Задание 2.
        System.out.println(" Последовательности чисел ");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println("  ");
        for(int b = 10; b >= 1; b-- ) {
            System.out.print(b + " ");
        }
        System.out.println("  ");
        // Задание 3
        System.out.println(" ЧИСЛЕННОСТЬ НАСЕЛЕНИЯ СТРАНЫ Y ");
        int сountryPopY = 12_000_000;
        System.out.println("На данный момент,численность населения страны Y составляет "
                + сountryPopY + " человек. ");
        int fertilityPer1000IY = 17;
        int mortalityPer1000IY = 8;
        int addPopPer1000IY = fertilityPer1000IY - mortalityPer1000IY;
        System.out.println("Численность населения cтраны Y,в будущем,составит: ");
        for(int x = 1; x <= 10; x++ ) {
            сountryPopY = сountryPopY + addPopPer1000IY;
            System.out.println("Год " + x + " , численность населения составляет "
                    + сountryPopY + " человек. ");
        }
    }
}