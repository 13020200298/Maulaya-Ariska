/** Nim : 13020200298
    Nama : MAULAYA ARISKA
    Hari, Tanggal : RABU, 22 Maret 2022 
    Waktu : 14:53*/

package tugas2_sourcecode;

import java.util.Scanner;
        
public class PriFor {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int i,N; 
        Scanner masukan=new Scanner(System.in);
        /* Program */
        /* program */
        System.out.print ("Baca N, print 1 s/d N "); 
        System.out.print ("N = ");
        N=masukan.nextInt();
        for (i = 1; i <= N; i++){
            System.out.println (i); };
        System.out.println ("Akhir program \n"); 
    }
}
