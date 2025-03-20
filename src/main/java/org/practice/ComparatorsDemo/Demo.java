package org.practice.ComparatorsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(3,1,11,5,6,2,13,9,1));

        List<String> sArr = new ArrayList<>(Arrays.asList("abc", "d", "ghi", "jklret", "mno", "pqr", "stu", "vwx",
                "yz"));
        arr.sort(new SortDescending());
        System.out.println(arr);


        sArr.sort(new StringSortDescending());
        System.out.println(sArr);
    }
}
class StringSortDescending implements Comparator<String> {
    @Override
    /*
    +1 means reverse order is required
    -1 means same order is required
     */
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}

class SortDescending implements Comparator<Integer> {
    @Override
    /*
    +1 means reverse order is required
    -1 means same order is required
     */
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}