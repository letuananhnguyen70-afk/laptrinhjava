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
public class Bai10_tinhtrungbinhcong {
    public static void main(String[] args) {
        System.out.println("tinh trung binh cong");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            System.out.println("nhap so thu" + i +":");
            int x = sc.nextInt();
            sum += x;
        }
        double tbc = (double)sum / n;
        System.out.println("trung binh cong = "+ tbc);
        sc.close();
    }
}
