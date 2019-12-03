package com.company;

public class Math {
    public static void main(String[] args) {
        Math myApp = new Math();
        int a = 6;
        int b = 10;
int sum;
        sum = myApp.add(a,b);
        System.out.println(sum);

        int c = 13;
        int d = 4;

        int sub = myApp.sub(c, d);
        System.out.println(sub);


    }

    public int add (int first, int second){
        int sum = 0;
        sum = first + second;
        return sum;
    }

    public int sub(int first, int second){
        int sum = 5;
        sum = first - second;
        return sum;

    }
}
