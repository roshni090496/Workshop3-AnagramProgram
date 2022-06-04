package com.company;

import java.util.Arrays;

public class CheckAnagram { //Here I am  creating the class
    void CompareToWords(String str1,String str2){  //method

        char ch[] = str1.toCharArray(); //convert String into Array of Char
        char ch1[] = str2.toCharArray(); //convert String into Array of Char
        Arrays.sort(ch); //sort
        Arrays.sort(ch1); //sort
        String newWord1 = new String(ch); //here I convert into String
        String newWord2 = new String(ch1); //here I convert into String

        if

        (newWord1.equals(newWord2)) { //compare by using Equals Method

            System.out.println("string contains only and all letters of" + str1);
        }
        else{

            System.out.println("Words are not equal");
        }
    }

    public static void main(String[] args) { //main method
        CheckAnagram ch = new CheckAnagram();
        ch.CompareToWords(" keep "," peek ");

    }
}
