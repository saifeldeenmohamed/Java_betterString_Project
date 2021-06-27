package betterStringPkg;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SaiF El-deen
 */

public class MainClass {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String string1 = "Saif";
        String string2 = "Mohamed";
        String longer = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        String first = StringUtils.betterString(string1, string2, (s1, s2) -> true);
        System.out.println(longer);
        System.out.println(first);
        }
    }
