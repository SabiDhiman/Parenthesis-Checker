package com.sabi.charcount.countOccurrences;

public class Occurrences {
    public static void main(String args[])
    {

        String input = "a,b,b,c,c,c,z";
        char search = 'c';             // Character to search is 'a'.

        int count=0;
        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i) == search)
                count++;
        }

        System.out.println("The Character '"+search+"' appears "+count+" times.");
    }
}
