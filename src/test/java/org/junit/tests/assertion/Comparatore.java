package org.junit.tests.assertion;

import java.util.Comparator;

public class Comparatore implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        if(o1 < o2){
            return -1;
        }
        else if(o1 > o2) {
            return 1;
        }
        return 0;
    }
    
}