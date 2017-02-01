package ru.pmsoftware.rsm;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("1234354534"));
    }

    public static String solution(String S) {
        // write your code in Java SE 8
        String str = S.replaceAll("[^0-9]", "");
        StringBuilder sb = new StringBuilder();
        if (str.length() < 4) {
            return str;
        } else if (str.length() == 4) {
            sb.append(str.substring(0, 2));
            sb.append("-");
            sb.append(str.substring(2));
            return sb.toString();
        } else if (str.length() % 3 == 0) {
            return groupByThree(str);
        } else if (str.length() % 3 == 1) {
            sb.append(groupByThree(str.substring(0, str.length() - 4)));
            sb.append("-");
            sb.append(str.substring(str.length() - 4, str.length() - 2));
        } else {
            sb.append(groupByThree(str.substring(0, str.length() - 2)));
        }
        sb.append("-");
        sb.append(str.substring(str.length() - 2));
        return sb.toString();

    }

    public static String groupByThree(String str) {
        StringBuilder sb = new StringBuilder();
        int blocksQty = str.length() / 3;
        sb.append(str.substring(0, 3));
        for (int i = 1; i < blocksQty; i++) {
            sb.append("-");
            sb.append(str.substring(i * 3, i * 3 + 3));
        }
        return sb.toString();
    }
}
