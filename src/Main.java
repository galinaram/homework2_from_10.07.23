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

    public static void task1 () {
        System.out.println("    Задача 1:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }

    public static void task2 () {
        System.out.println("    Задача 2 (прибавить 4):");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog+=4; cat+=4; paper+=4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }

    public static void task3() {
        System.out.println("    Задача 3 (уменьшить значение каждой переменной):");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog-=3.5; cat-=1.6; paper-= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }

    public static void task4() {
        System.out.println("    Задача 4:");
        var friend = 19;
        System.out.println("friend1 = " + friend);
        friend += 2;
        System.out.println("friend2 = " + friend);
        friend /= 7;
        System.out.println("friend3 = " + friend);
    }

    public static void task5() {
        System.out.println("    Задача 5:");
        var frog = 3.5;
        System.out.println("frog1 = " + frog);
        frog *=10;
        System.out.println("frog2 = " + frog);
        frog /= 3.5;
        System.out.println("frog3 = " + frog);
        frog += 4;
        System.out.println("frog4 = " + frog);
    }

    public static void task6 () {
        System.out.println("    Задача 6:");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("boxer1 = " + boxer1 + "; boxer2 = " + boxer2);
        var sum = boxer1 + boxer2;
        System.out.println("sum = " + sum);
        var difference = boxer1 - boxer2;
        System.out.println("difference = " + difference);

    }

    public static void task7 () {
        System.out.println("    Задача 7:");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var difference1 = boxer2 - boxer1;
        System.out.println("boxer1 = " + boxer1 + "; boxer2 = " + boxer2);
        System.out.println("difference1 = " + difference1);
        var difference2 = boxer2 % boxer1;
        System.out.println("difference2 = " + difference2);
    }

    public static void task8 () {
        System.out.println("    Задача 8:");
        var hours = 640;
        var hoursEmployee = 8;
        var numberEmploees = hours / hoursEmployee;
        System.out.println("Всего работников в компании - " + numberEmploees + " человек");
        numberEmploees += 94;
        hours = numberEmploees * hoursEmployee;
        System.out.println("Если в компании работает " + numberEmploees + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");
    }
}