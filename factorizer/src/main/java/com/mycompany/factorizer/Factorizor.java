/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factorizer;

/**
 *
 * @author kmlnd
 */

import java.util.Scanner;
import java.util.ArrayList;
public class Factorizor {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Factorize a number!");
        System.out.println("Give me a number.");
        Scanner nums = new Scanner(System.in);
        
        int userNums = nums.nextInt();
        int y = 1;
        int x = 0;
        int factorials = 0;
        while( x < userNums ){
            x++;
            
            y=y*x;
            factorials = y;
            
        } 
        System.out.println("Factorial of " + userNums + " is " + factorials);
    }
}
