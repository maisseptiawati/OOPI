/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Ma'is
 */
public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
      Latihan masukan = new Latihan();
      masukan.luas (12 , 12);
      
    }
      
    
    private void luas ( int a , int b){
        int hasil ;
        hasil = a * b ;
        System.out.println(hasil);
    }
      
   private int fungsiluas (int a, int b){
       return a * b ;
   }
}
    
