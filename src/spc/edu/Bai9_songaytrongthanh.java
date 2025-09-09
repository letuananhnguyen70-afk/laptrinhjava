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
public class Bai9_songaytrongthanh {
    public static void main(String[] args) {
        System.out.println("tinh so ngya trong thang");
        Scanner nhap = new Scanner(System.in);
        
        System.out.println("nhap thang (1-12):");
        int thang = nhap.nextInt();
        
        System.out.println("nhap nam:");
        int nam = nhap.nextInt();
        int soNgay;
        
        switch (thang){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                soNgay = 31;
                break;        
            case 4: case 6: case 9: case 11:   
                soNgay = 30;
                break;
            case 2:
                if ((nam % 400 == 0)||(nam % 4 == 0 && nam % 100 != 0)){
                    soNgay = 29;
                }else{
                    soNgay28;
                }
                break;
            default:
                System.out.println("thang ko hop le!");
                return;
        }
        System.out.println("");
    }
}
