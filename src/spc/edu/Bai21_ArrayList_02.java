/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai21_ArrayList_02 {
    public static void main(String[] args) {
          System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
           System.out.println("chương trình nhập vào ArrayList: ");
        ArrayList<String> sinhvien = new ArrayList<String>();
        Scanner nhap = new Scanner(System.in);
        
        while(true){
            System.out.print("Nhập tên sinh viên ");
            String a = nhap.next();
            if("0" .equals(a)) break;
            
            sinhvien.add(a);
        }
        System.out.print("Danh sách sinh viên là:" + sinhvien.toString());
        System.out.print("\n Tổng số có: " + sinhvien.size() + " sinh viên ");
        
    }
    
}
