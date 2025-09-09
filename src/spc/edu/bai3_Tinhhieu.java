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
public class bai3_Tinhhieu {
    public static void main(String[] args) {
        System.out.println("chuong trinh tinh hieu 2 so");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a ");
        int a = sc.nextInt();
        System.out.println("nhap so b");
        int b = sc.nextInt();
        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
        
        int tich = a * b;
        System.out.println(a + " * " + b + " = " + tich);
        
        double thuong = (double)a / b;
        System.out.println(a + " / " + b + " = " + thuong);
    }
  
}
