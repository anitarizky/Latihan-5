/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukutamutest;
/**
 *
 * @author ANITA
 */
public class BukuTamuTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bukutamu bt1 = new bukutamu();
        bukutamu bt2 = new bukutamu();
        bukutamu bt3 = new bukutamu();
        bukutamu bt4 = new bukutamu();
        bukutamu bt5 = new bukutamu();
        
        bt1.setnama("Nur Shafiya");
        bt1.setasal("Tangerang");
        bt1.setjeniskelamin("Perempuan");
        
        bt2.setnama("Ign Suryo");
        bt2.setasal("Bandung");
        bt2.setjeniskelamin("Laki-laki");
        
        bt3.setnama("Anita Rizky");
        bt3.setasal("Surabaya");
        bt3.setjeniskelamin("Perempuan");
        
        bt4.setnama("Grenzya Laksmi");
        bt4.setasal("Mojokerto");
        bt4.setjeniskelamin("Perempuan");
        
        bt5.setnama("Budi Wisono");
        bt5.setasal("Medan");
        bt5.setjeniskelamin("Laki-laki");
        
        bt1.tampil();
        bt2.tampil();
        bt3.tampil();
        bt4.tampil();
        bt5.tampil();
        System.out.println("-------------------------------");
        System.out.println(bt1.jumlahtamu());
        
    }
    
}