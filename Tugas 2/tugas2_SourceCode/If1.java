/* contoh pemakaian IF satu kasus */
/* membaca nilai integer, menuliskan nilainya jika positif */ 
/** Nim : 13020200298
    Nama : MAULAYA ARISKA
    Hari, Tanggal : RABU, 23 Maret 2022 
    Waktu : 14:32*/

package tugas2_sourcecode;

import java.util.Scanner;

public class If1 {   
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */ 
        Scanner masukan=new Scanner(System.in);
        int a;
        /* Program */
        System.out.print ("Contoh IF satu kasus \n"); 
        System.out.print ("Ketikkan suatu nilai integer : "); 
        a = masukan.nextInt();
        if (a >= 0)
        System.out.print ("\nNilai a positif "+ a);
    }
}

