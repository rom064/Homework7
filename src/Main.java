public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int money = 15_000;
        int bank = 0;
        int i = 0;
        while (bank < 2_459_000) {
            bank = bank + bank / 100;
            bank = bank + money;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + bank + " рублей");
        }
        System.out.println(" ");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int y = 12_000_000;
        int birth = y / 1000 * 17;
        int rateMortality = y / 1000 * 8;
        for (int year = 2023; year < 2033; year = year + 1) {
            y = y + birth - rateMortality;
            System.out.println("Год " + year + ", численность населения составляет " + y);
        }

        System.out.println(" ");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int money = 15_000;
        int bank = 0;
        int i = 0;
        while (bank < 12_000_000) {
            bank = bank + bank / 100 * 7;
            bank = bank + money;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + bank + " рублей");
        }
        System.out.println(" ");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int money = 15_000;
        int bank = 0;
        int i = 0;
        while (bank < 12_000_000) {
            bank = bank + bank / 100 * 7;
            bank = bank + money;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + bank + " рублей");
            }
        }
        System.out.println(" ");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int money = 15_000;
        int bank = 0;
        int i = 0;
        int year = 0;
        for (; year < 9 * 12; year++) {
            bank = bank + bank / 100 * 7;
            bank = bank + money;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + bank + " рублей");
            }
        }
        System.out.println(" ");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 1;
        int month = 31;
        for (; friday < month; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет!");
        }
        System.out.println(" ");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int yearBefore = 200;
        int yearAfter = 100;
       for (int event=0; event<2023+yearAfter;event = event+79){
           if (event >2023-yearBefore){
               System.out.println(event);
           }
       }
    }
}