package com.saib;

public class Reverse_String {

    static void reverseString(char str[],int start , int end){
        char temp;

        while (start<end){
            temp = str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;
        }
    }

     static void  printString(char str[],int size){
        for (int i =0; i<size;i++){
            System.out.print(str[i]+" ");

        }
         System.out.println();
     }

    public static void main(String[] args) {
    String string = "Urvashi";
    char[] str = string.toCharArray();
    int size = str.length;
    printString(str,size);
    reverseString(str,0,size-1);
    printString(str,size);
    }
}
