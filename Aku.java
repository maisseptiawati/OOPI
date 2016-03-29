/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aku;

/**
 *
 * @author Ma'is
 */
import java.util.Scanner;
public class Aku {
public static void main (String[] args) {
Scanner masukan = new Scanner(System.in);
System.out.print("Masukkan nilai mata kuliahnya :");
int nilai = masukan.nextInt();
if (nilai >= 80)
System.out.println ("Nilainya A");
else if (nilai >= 70)
System.out.println ("Nilainya B") ;
else if (nilai >= 55)
System.out.println ("Nilainya B") ;
else if (nilai >= 40)
System.out.println ("Nilainya B") ;
else 
System.out.println ("Nilainya E") ;
}
}
