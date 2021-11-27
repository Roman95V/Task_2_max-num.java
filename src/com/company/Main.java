package com.company;

public class Main {

    public static void main(String[] args) {
        int max_num = 0;
        int num_1 = 5;
        int num_2 = 9;
        int num_3 = 3;
        int num_4 = 9;

        if (num_1 >= num_2 && num_1 >= num_3 && num_1 >= num_4)
        {
            max_num++;
            System.out.println("Max first number: "+ num_1);
        }

        if (num_2 >= num_1 && num_2 >= num_3 && num_2 >= num_4)
        {
            max_num++;
            System.out.println("Max second number: "+ num_2);
        }

        if (num_3 >= num_1 && num_3 >= num_2 && num_3 >= num_4)
        {
            max_num++;
            System.out.println("Max third number: "+ num_3);
        }

        if (num_4 >= num_1 && num_4 >= num_2 && num_4 >= num_3)
        {
            max_num++;
            System.out.println("Max forth number: "+ num_4);
        }

        System.out.println("Number of maximum values: " + max_num);
    }
}
