package com.itheima.day08.work04;


import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * 键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，必须保证顺序。例如输入：aaaabbbcccddd，打印结果为：abcd。
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String next = scanner.next();
        char[] chars = next.toCharArray();

        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (char aChar : chars) {
            set.add(String.valueOf(aChar));
        }
        System.out.println(set);
        StringBuilder stringBuilder = new StringBuilder();
        set.forEach(o->stringBuilder.append(o));
        String s = stringBuilder.toString();
        System.out.println(s);
    }
}
