package org.practice.string;

public class Atoi {
    public static int atoi(String s) {
        //check for leading spaces
        s = s.strip();
        //check for sign
        int mul = 1;
        int idx = 0;
        char c = s.charAt(idx);
        if (!Character.isDigit(c)){
            if(c == '-') {
                mul = -1;
                idx++;
            }
            else if(c == '+'){
                mul = 1;
                idx++;
            }
            else{
                return 0;
            }
        }
        int num = 0;
        while(idx<s.length() && Character.isDigit(s.charAt(idx))){
            num = num*10+Character.getNumericValue(s.charAt(idx));
            if(num>Integer.MAX_VALUE/10 && mul == -1){
                num = Integer.MIN_VALUE;
                break;
            }
            if(num>Integer.MAX_VALUE/10){
                num = Integer.MAX_VALUE;
                break;
            }
            idx ++;
        }


        return num*mul;

    }
            //read digits till non-digit character found.
    public static void main(String[] args) {

        String input1 = "   -1337c0d3";
        String input2 = "0-1";
        String input3 = "9128347233256456";
        String input4 = "-91283472332";
        String input5 = "+1";
        System.out.println(atoi(input3));
    }
}
