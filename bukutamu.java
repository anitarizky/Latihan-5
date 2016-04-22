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
public class bukutamu {
    public static final int jumlah = 10;
    private int id;
    private static int jml = 0;
    private String nama;
    private String asal;
    private String jeniskelamin;
    
    public bukutamu(){
        if (jml <= jumlah){
            jml++;
            id = jml;
        }
        else {
            System.out.println("==============================");
            System.out.println("        Buku Tamu Penuh!      ");
            System.out.println("==============================");
        }
    }
    public bukutamu(String n, String a, String jk){
       nama = n;
       asal = a;
       jeniskelamin = jk;
       if (jml <= jumlah){
            jml++;
            id = jml;
        }
        else {
            System.out.println("Buku Tamu Penuh!");;
        }
    }
    
    public void setnama(String n){
        nama = n;
    }
    public String getnama(){
        return nama;
    }
    public void setasal(String a){
        asal = a;
    }
    public String getasal(){
        return asal;
    }
    public void setjeniskelamin(String jk){
        jeniskelamin = jk;
    }
    public String getjeniskelamin(){
        return jeniskelamin;
    }
    
    public void tampil(){
        System.out.println("ID              : "+id);
        System.out.println("Nama            : "+nama);
        System.out.println("Asal            : "+asal);
        System.out.println("Jenis Kelamin   : "+jeniskelamin);
        System.out.println("");
    }
    
    public String jumlahtamu(){
    return "Jumlah Tamu     : "+jml;
    }
}