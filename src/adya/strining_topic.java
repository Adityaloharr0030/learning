package adya;

import javax.swing.*;

public class strining_topic {
    public static boolean isplendrom(String name) {
        for (int i = 0; i < name.length() / 2; i++) {
            int n = name.length();
            if (name.charAt(i) != name.charAt(n - 1 - i)) {
                //not a plindrom
                return false;
            }
        }
        return true;
    }

    //    given a route containing 4 direction (e,w,n,s),
//    find the shortest path to reach destinatoin.
//        "wneenesennn"
    public static float path(String src) {
        int x = 0, y = 0;
        for (int i = 0; i < src.length(); i++) {
            char dir = src.charAt(i);
            //south
            if (dir == 's') {
                y--;
            }
            //north
            else if (dir == 'n') {
                y++;
            }
            //west
            else if (dir == 'w') {
                x--;
            }
            // east
            else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static String sub_string(String str, int si, int ei) {
        String substring = "";
        for (int i = si; i < ei; i++) {
            substring += str.charAt(i);

        }
        return substring;
    }

    //for a given string convert each the first letter of each word to uppercase.
    public static String toUperCase(String strr) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(strr.charAt(0));
        sb.append(ch);
        for (int i = 1; i < strr.length(); i++) {
            if (strr.charAt(i) == ' ' && i < strr.length() - 1) {
                sb.append(strr.charAt(i));
                i++;
                sb.append(Character.toUpperCase(strr.charAt(i)));
            } else {
                sb.append(strr.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compresss(String strrr) {
        String newstr = "";

        for (int i = 0; i < strrr.length(); i++) {
            Integer count = 1;
            while (i < strrr.length()-1 && strrr.charAt(i) == strrr.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += strrr.charAt(i);
            if (count>1){
                newstr += count.toString();
            }
        }
        return newstr;
    }

    public static void main(String[] args) {
//        String name = "racecar";
//        System.out.println(isplendrom(name));
        // String src = "wneenesennn";
        String str = "hellowadya";
        // System.out.println(path(src));
////    for a given set of string print  the largest string
////"apple","mango","banana"
//        String fruit[] = {"apple", "mango", "banana"};
//        String largest = fruit[0];
//        for (int i = 1; i < fruit.length; i++) {
//            if (largest.compareTo(fruit[i]) < 0) {
//                largest = fruit[i];
//            }
//        }
//        System.out.println(largest);
        //string builder
//        StringBuilder sb = new StringBuilder("");
//        for (char ch = 'a'; ch <= 'z'; ch++) {
//            sb.append(ch);
//            System.out.println();
//        }
//        System.out.println(sb);
//
        String strrr= "aaaabbccdd";
        System.out.println(compresss(strrr));
    }
}
