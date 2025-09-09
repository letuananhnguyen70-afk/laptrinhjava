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
public class Bai6_giaiPTbac2 {
    public static void main(String[] args) {
        System.out.println("tinh PT bac 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        double a = sc.nextDouble();
        System.out.println("nhap b");
        double b = sc.nextDouble();
        System.out.println("nhap c");
        double c = sc.nextDouble();
        if (a == 0){
            if (b == 0){
                if(c == 0){
                    System.out.println("phuong trinh vo ngihem");
                }
                else{
                    System.out.println("phuong trinh co vo so nghiem");
                }
            }else{
                double x = -c / b;
                System.out.println("phuong trinh co nghiem duy nhat: x =" + x);
                
                
            }
        }else {
            double delta = b * b - 4 * a * c;
            if(delta < 0){
                System.out.println("phuong trinh vo nghiem");
            }else if(delta == 0 ){
                double x = -b / (2 * a);
                System.out.println("phuong trinh co nghiem kep: x = " + x);
            }else{
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                 double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                 System.out.println("phuong trinh co 2 nghiep phan biet:");
                 System.out.println("x1 = " + x1);
                 System.out.println("x2 = " + x2);
            }
        }
    }
    
}
