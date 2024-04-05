/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas01;
import java.util.Scanner;
/**
 *
 * @author Anamaya Santi
 */
public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int alas,tinggi;
        double luas;
        
        System.out.print("Input nilai alas :");
        alas = input.nextInt();
        System.out.print("Input nilai tinggi :");
        tinggi = input.nextInt();
        
        luas = alas*tinggi/2;
        System.out.println("Hasil luas segitiga adalah "+luas);
    }
}
