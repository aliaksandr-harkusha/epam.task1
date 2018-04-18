package com.epam.comparator;

import com.epam.entity.Sweet;

import java.util.Comparator;

public class SweetNameComparator implements Comparator<Sweet> {
    @Override
    public int compare(Sweet o1, Sweet o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
