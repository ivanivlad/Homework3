package homework;

import homework.city.City;
import homework.city.House;
import homework.lottery.LotteryTicket;
import homework.phonefactory.Iphone;
import homework.phonefactory.PhoneFactory;
import homework.phonefactory.Samsung;
import homework.pyramid.Pyramid1;
import homework.tree.Birch;
import homework.tree.Conifers;
import homework.tree.Deciduous;
import homework.tree.Fir;
import homework.tree.Pine;
import homework.tree.Tree;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("ex1");
        ex1();
        System.out.println("________________________");
        System.out.println("ex2");
        ex2();
        System.out.println("________________________");
        System.out.println("ex3");
        ex3();
        System.out.println("________________________");
        System.out.println("ex4");
        ex4();
        System.out.println("________________________");
        System.out.println("ex5");
        ex5();

    }

    public static void ex1() {

        Conifers pine = new Pine(15);
        Conifers fir = new Fir(17);
        Deciduous birch = new Birch(16);

        birch.flowering();
        birch.fallLeaves();
        System.out.printf(birch.isHasLeaves() ? "листья есть\n" : "листьев нет\n");

        Tree[] trees = {pine, birch, fir};

        int aggregatedAge = 0;
        for (Tree elem : trees) {
            aggregatedAge += elem.getAge();
        }
        System.out.println("Средний возраст: " + (aggregatedAge / trees.length));
    }

    public static void ex2() {
        Samsung galaxy = new Samsung("Galaxy");
        Iphone iphone15 = new Iphone("Iphone 15");

        PhoneFactory chinaFactoryWithChild = new PhoneFactory();
        chinaFactoryWithChild.assemble(galaxy);
        chinaFactoryWithChild.assemble(iphone15);

        System.out.println("-----");
        System.out.println(iphone15);
        System.out.println("-----");
        System.out.println(galaxy);
    }

    public static void ex3() {
        Pyramid1 pyramid1 = new Pyramid1();
        pyramid1.print();
    }

    public static void ex4() {

        LotteryTicket[] tickets = new LotteryTicket[110];

        for (int i = 1; i <= 110; i++) {
            if (i >= 100 && i % 100 == 0) {
                tickets[i - 1] = new LotteryTicket() {
                    @Override
                    public int tryFortune() {
                        return 5_000;
                    }
                };
            } else if (i >= 10 && i % 10 == 0) {
                tickets[i - 1] = new LotteryTicket() {
                    @Override
                    public int tryFortune() {
                        return 100;
                    }
                };
            } else {
                tickets[i - 1] = new LotteryTicket();
            }
        }

        int amount = 0;
        for (int i = 0; i < 110; i++) {
            amount += tickets[i].tryFortune();
        }
        System.out.println(amount);
    }

    public static void ex5() {

        House house1 = new House();
        house1.setHouseNumber(1);
        house1.setStreet("Piccadilly");

        House house2 = new House();
        house2.setHouseNumber(2);
        house2.setStreet("Trafalgar Square");

        City london = new City("London", new House[]{house1, house2});

        System.out.println("before:\n" + london);

        london.getHouses()[0].setStreet("Якиманка");
        london.getHouses()[0].setHouseNumber(1001);

        System.out.println("after:\n" + london);

    }
}