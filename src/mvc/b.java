package mvc;

import java.util.LinkedList;

public class b {
    public static void main(String[] args) {
        String s = "CodegymDaNang";
        String s1 = s.toUpperCase();
        String result = "";
        String[] sA = s.split("");
        String[] sB = s1.split("");
        result += (sB[0].toLowerCase());
        for (int i = 0; i < sA.length; i++) {
            if (sA[i].equals(sB[i])) {
                result += (" ");
                result += (sB[i]);
            } else {
                result += (sB[i]);
            }
        }
        System.out.println(result.toLowerCase());
    }
}
