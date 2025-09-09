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
public class Bai7_hinhchunhathinhtron {
    public static void main(String[] args) {
        System.out.println("tinh dien tich chu vi hinh tron va hinh chu nhat:");
        Scanner nhap = new Scanner(System.in);
        /*hinh tron*/
        System.out.println("nhap ban kinh hinh tron r : ");
        double r = nhap.nextDouble();
        double chuvihinhtron = 2 * Math.PI * r;
        double dientichhinhtron = 2 * Math.PI * r * r;
        System.out.println("hinh tron");
        System.out.println("chu vi =" + chuvihinhtron);
        System.out.println("dientich =" + dientichhinhtron);
        /*hinh chu nhat*/
        System.out.println("nhap chieu dai hinh chu nhat : ");
        double dai = nhap.nextDouble();
        System.out.println("nhap chieu rong hinh chu nhat : ");
        double rong = nhap.nextDouble();
         double chuvihinhCN = 2 * (dai + rong);
        double dientichhinhCN = dai * rong;
        System.out.println("hinh chu nhat");
        System.out.println("chu vi =" + chuvihinhCN);
        System.out.println("dientich =" + dientichhinhCN);
        
        
        
        
        
    }
}
