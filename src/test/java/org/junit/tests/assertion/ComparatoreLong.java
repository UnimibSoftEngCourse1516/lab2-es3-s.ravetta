package org.junit.tests.assertion;

import java.util.Comparator;

public class ComparatoreLong implements Comparator<Long> {

    public int compare(Long o1, Long o2) {
        if(o1 < o2){
            return -1;
        }
        else if(o1 > o2) {
            return 1;
        }
        return 0;
    }
    
}