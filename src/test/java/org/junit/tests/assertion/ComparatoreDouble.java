package org.junit.tests.assertion;

import java.util.Comparator;

public class ComparatoreDouble implements Comparator<Double> {

    public int compare(Double o1, Double o2) {
        if(o1 < o2){
            return -1;
        }
        else if(o1 > o2) {
            return 1;
        }
        return 0;
    }
    
}