package com.company;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<UniversityPerson> treeSet = new TreeSet<>(new NoSort());
        treeSet.add(new UniversityPerson("Andrian", 3));
        treeSet.add(new UniversityPerson("Bogdan", 3));
        treeSet.add(new UniversityPerson("Andrew", 2));
        treeSet.add(new UniversityPerson("Yuri", 1));
        treeSet.add(new UniversityPerson("Olga", 5));
        treeSet.add(new UniversityPerson("Bogdan", 4));

        System.out.println("До сортування:");

        for (UniversityPerson person : treeSet) {
            System.out.println(person);
        }

        System.out.println();
        TreeSet<UniversityPerson> treeSet1 = new TreeSet<>(new UniversityPersonComparator());
        treeSet1.add(new UniversityPerson("Andrian", 3));
        treeSet1.add(new UniversityPerson("Bogdan", 3));
        treeSet1.add(new UniversityPerson("Andrew", 2));
        treeSet1.add(new UniversityPerson("Yuri", 1));
        treeSet1.add(new UniversityPerson("Olga", 5));
        treeSet1.add(new UniversityPerson("Bogdan", 4));

        System.out.println("Після сортування:");

        for (UniversityPerson person: treeSet1){
            System.out.println(person);
        }
    }
}
