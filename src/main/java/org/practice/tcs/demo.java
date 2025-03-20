package org.practice.tcs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        String s = "Akshat";
        String news = s.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint,
                StringBuilder::append).toString();

        System.out.println(news);

    }
}
