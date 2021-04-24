package Lesson4;


import java.util.*;

public class ArrayStr {

    public static void main(String[] args) {
        System.out.println("============================  Задание 1  ============================");
        ArrayList<String> arStr = new ArrayList<>(Arrays.asList("Россия", "Венгрия", "Чехия", "Германия", "Англия", "Россия", "Германия", "Финляндия", "Нидерланды", "Франция", "Россия", "Россия"));
        System.out.println("Начальный массив: ");
        System.out.println("\t" + arStr.toString());

        System.out.println("Только уникальные слова: ");
        LinkedHashSet<String> hashStr = new LinkedHashSet<>(arStr);
        System.out.println("\t" + hashStr.toString());

        System.out.println("Подсчёт количества вхождений слов: ");
        ArrayList<String> arrayStr = new ArrayList<>(arStr);
        HashMap<String, Integer> countries = new HashMap<>();
        for (String word : arrayStr) {
            if (!countries.containsKey(word)) {
                countries.put(word, 0);
            }
            countries.put(word, countries.get(word) + 1);
        }
        for (String word : countries.keySet()) {
            System.out.println("\tСлово: " + word + ". Количество вхождений: " + countries.get(word));
        }

        System.out.println("============================  Задание 2  ============================");
        Phonebook phonebook = new Phonebook();
        phonebook.add("Буханкин", "+79185172359");
        phonebook.add("Гразармейский", "+79185172449");
        phonebook.add("Корниченко", "+7918516156");
        phonebook.add("Желебобов", "+79185142359");
        phonebook.add("Буханкин", "+79186842424");
        phonebook.add("Корниченко", "+7918544159");
        phonebook.add("Буханкин", "+791851414159");
        System.out.println(phonebook.get("Буханкин"));
        System.out.println(phonebook.get("Корниченко"));

    }


}



