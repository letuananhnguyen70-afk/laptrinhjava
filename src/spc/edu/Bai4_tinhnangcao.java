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
public class Bai4_tinhnangcao {
    public static void main(String[] args) {
        System.out.println("chuong tring tinh so mu");
        Scanner sc = new Scanner (System.in);
        System.out.println("nhap so co a");
        double a = sc.nextDouble();
        System.out.println("nhap so mu n");
        int n = sc.nextInt();
        
        double ketqua = Math.pow(a, n);
        System.out.println(a + " ^ " + n + " = " +  ketqua);
    }
}
