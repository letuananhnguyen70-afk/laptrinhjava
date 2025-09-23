/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai19_FindMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[10]; 

        
        System.out.println("Nhap 10 so nguyen:");
        for (int i = 0; i < x.length; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            x[i] = sc.nextInt();
            
                
            
        }

        
        int max = x[0];
        int sum = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
            sum += x[i];
        }

       
        System.out.println("Gia tri lon nhat trong mang la: " + max);
        System.out.println("tong cac phan tu trong mang la: " + sum);

        sc.close();
    }
}