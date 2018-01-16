/*Bina satu program ringkas yang memaparkan nama, jantina
 *warna kegemaran dan memberi ulasan mengenai warna kegemaran yang dipilih.
 * Warna merah=membawa makna kekuaatan, kemarahan dan semangat
 *Warna Biru=membawa maksud ketenangan, keikhlasan dan harapan.
 * Warna Kuning=melambangkan kegembiraan, penuh semangat dan riang
 *Warna Hijau=menggambarkan kehidupan, kestabilan dan ketulenan
 *Warna Hitam=dikaitkan dengan kejahatan dan penuh kerahsiaan.
 *Warna putih=adalah berani tetapi tidak suka tunjukkan keberanian.
 */

/**
 *
 * @author user
 */
import java.util.*;
public class soalan68 {
public static void main(String[] args){
    
    String ulasan = null;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan nama anda");
    String nama=input.next();
    
    System.out.print("Taipkan warna kegemaran anda\n merah/biru/kuning/hijau/putih: ");
        
    String warna=input.next();
    
    switch(warna){
        case "merah" :{
        ulasan="membawa makna kekuaatan, kemarahan dan semangat";
    break;
    }case "biru" :{
     ulasan=("membawa maksud ketenangan, keikhlasan dan harapan. ");
    break;
    }case "kuning" :{
     ulasan=("melambangkan kegembiraan, penuh semangat dan riang");
    break;
    }case"hijau" :{
     ulasan=("menggambarkan kehidupan, kestabilan dan ketulenan");
    break;
    }case "hitam" :{
     ulasan=("dikaitkan dengan kejahatan dan penuh kerahsiaan.");
    break;
    }case "putih" :{
     ulasan=("adalah berani tetapi tidak suka tunjukkan keberanian.");
    break;
    
    }default :{
      
    System.out.println("Maaf pilihan salah ");
    }
    }
            System.out.println(nama+",warna anda "+ulasan);
}
}
