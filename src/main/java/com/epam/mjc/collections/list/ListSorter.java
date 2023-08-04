package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();
        Collections.sort(sourceList, comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);

        int result = calculateFunction(numA) - calculateFunction(numB);

        if (result != 0) {
            return result;
        } else {
            return numA - numB;
        }
    }

    private int calculateFunction(int x) {
        return 5 * x * x + 3;
    }
}
