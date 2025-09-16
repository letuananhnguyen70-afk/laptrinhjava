/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;



/**
 *
 * @author Administrator
 */
public class Bai10_tinhtrungbinhcong {
    public static void main(String[] args) {
        System.out.println("tinh trung binh cong");
        int tong=0,dem=0;
        for(int i=27;i<=250;i++){
            if(i%3==0){
                System.out.print(i+" ");
                tong +=i;
                dem++;
            }
        }
        double trungbinh = (double) tong/dem;
        System.out.println("trung binh cong =" + trungbinh);
    }
}
