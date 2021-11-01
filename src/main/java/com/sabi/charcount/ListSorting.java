package com.sabi.charcount;


public class ListSorting {
 public static void main(String[] args) {
 String str = "a,b,b,c,c,c,z";

 String demarcation = ",";
 int startIndex = 0, endIndex;
 endIndex = str.indexOf(demarcation, startIndex);

 while(endIndex != -1){
     String parts = str.substring(startIndex, endIndex);
     System.out.println(parts);
     startIndex = endIndex + 1;
     endIndex = str.indexOf(demarcation, startIndex);
 }
 String parts = str.substring(startIndex);

}}