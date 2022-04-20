package Assignments;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsLetters {

    public static void main(String args[])
    {
        boolean flag = false;
        HashSet<Character> set = new HashSet<>();
        String s = "abcdefgh @13e456";
        char[] ch = s.toCharArray();
        for(int i = 0; i< ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                set.add(ch[i]);
            }
        }
        System.out.println(set);
        for(char j = 'a';j <= 'z'; j++)
        {
            if(!set.contains(j)) {
                System.out.println("all alphabets are not present");
                flag = true;
                break;
            }
        }
    if(flag == false)
    {
        System.out.println("ALl alphabets are present");
    }
    }
}
