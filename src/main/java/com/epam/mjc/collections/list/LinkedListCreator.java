package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        var result = new LinkedList<Integer>();

        if (!sourceList.isEmpty()){
            for (Integer i : sourceList) {
                if (i % 2 == 0){
                    result.addLast(i);
                } else {
                    result.addFirst(i);
                }
            }
        }

        return result;
    }
}
