package Lesson3;

import java.util.ArrayList;

public class SwapArrays {

    public static void main(String[] args) {

        //Задание 1
        System.out.println("============================  Задание 1  ============================");
        swapElements();

        //Задание 2
        System.out.println("============================  Задание 2  ============================");
        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();

        System.out.println("Добавляем фрукты: ");
        or.addFruit(new Orange(), 8);
        or1.addFruit(new Orange(), 15);
        ap.addFruit(new Apple(), 6);
        ap1.addFruit(new Apple(), 3);
        System.out.println("Box 1: " + or.getWeight());
        System.out.println("Box 2: " + or1.getWeight());
        System.out.println("Box 3: " + ap.getWeight());
        System.out.println("Box 4: " + ap1.getWeight());

        System.out.println("Сравниваем коробки апельсинов с коробками яблок:");
        System.out.println("Box 1 equals box 3: " + or.compare(ap));
        System.out.println("Box 2 equals box 4: " + or1.compare(ap1));

        System.out.println("Пересыпаем фрукты");
        or.pourTo(or1);
        ap.pourTo(ap1);

        System.out.println("Окончательный вес коробок: ");
        System.out.println("Box 1: " + or.getWeight());
        System.out.println("Box 2: " + or1.getWeight());
        System.out.println("Box 3: " + ap.getWeight());
        System.out.println("Box 4: " + ap1.getWeight());
    }

    private static void swapElements() {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("Sherlock"));
        cats.add(new Cat("Pushok"));
        System.out.println(cats.toString());
        Cat firstValue = cats.get(0);
        cats.add(firstValue);
        cats.remove(0);
        System.out.println(cats.toString());
    }

}
