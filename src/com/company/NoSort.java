package com.company;


import java.util.Comparator;

public class NoSort implements Comparator<UniversityPerson> {
    @Override
    public int compare(UniversityPerson o1, UniversityPerson o2) {
        return 1;
    }
}
