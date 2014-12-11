/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carimaks;

/**
 *
 * @author I'am a Muslim
 */
import java.util.Scanner;
import java.util.Random; 
public class CariMaks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,n, maks;    
        Random isi = new Random();
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah array = ");
        n = in.nextInt();
        int[] arrayAngka = new int[n];
        j = 0;
        for(i=0;i<n;i++)
        {
            j = j+1;
            
            arrayAngka[i]= isi.nextInt(100)+1;
            System.out.println("Angka ke-"+j+" = "+ arrayAngka[i]);
        }
        long startTime = System.nanoTime();
        maks = arrayAngka[0];
        for(i=1;i<n;i++)
        {
            if(arrayAngka[i]>maks){
                maks = arrayAngka[i];
            }
        }
        long stopTime = System.nanoTime();
    	
    	double elapsedTime = (double) (stopTime - startTime)/1000000;
        System.out.println("Angka bernilai terbesar = "+maks);
    	System.out.println("Waktu eksekusi = "+elapsedTime + " * 10^-3 detik");
        
        // TODO code application logic here
    }
    
}
