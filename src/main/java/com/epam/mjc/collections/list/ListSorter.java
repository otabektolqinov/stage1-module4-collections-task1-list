package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {

        int first = Integer.parseInt(a);
        int second = Integer.parseInt(b);

        if (first > second){
            return 1;
        } else if (first == second){
            return 0;
        } else {
            return -1;
        }
    }
}
