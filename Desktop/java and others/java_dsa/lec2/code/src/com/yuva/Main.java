package com.yuva;

public class Main {
    public static void main(String[] args) {
        /*
        This is a multi line comment
        ok understood
         */
//        multiple if else

        int salary = 25000;
        if (salary >= 10000){
            salary = salary + 2000;
        } else if(salary >= 20000){
            salary += 1500;
        }else {
            salary = salary + 1000;

        }

        if (salary >= 10000){
            salary = salary + 2000;
        } else {
            salary = salary + 1000;

        }
        System.out.println(salary);
    }
}