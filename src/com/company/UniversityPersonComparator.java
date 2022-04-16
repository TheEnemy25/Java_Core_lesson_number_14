package com.company;

import java.util.Comparator;

public class UniversityPersonComparator implements Comparator<UniversityPerson> {
    @Override
    public int compare(UniversityPerson o1, UniversityPerson o2) {
        if (o1.getName().compareTo(o2.getName())>0){
            return 1;
        }
        else if (o1.getName().compareTo(o2.getName())<0){
            return -1;
        }
        else {
            if (o1.getCourse()>o2.getCourse()){
                return 1;
            }
            else if (o1.getCourse()<o2.getCourse()){
                return -1;
            }
        }
        return 0;
    }
}
