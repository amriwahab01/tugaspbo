// Nama    : Amri wahab
// NIM     : D0221332
// Kelas   : Informatika E
package tugas3amriwhb;

import java.util.Scanner;

public class Tugas3Amriwhb {

    public static void main(String[] args) {
         // Memanggil Objek Scanner 
        Scanner userInput = new Scanner(System.in);
        
        boolean next = true;
        while (next) {
            System.out.println("==============");
            System.out.println("MENGHITUN LUAS");
            System.out.println("==============");
            
            System.out.println("1. Persegi");
            System.out.println("2. Segitiga");
            System.out.println("3. Lingkaran");
            
            System.out.print("\nPilih : ");
            int pilih = userInput.nextInt();
            
            switch (pilih) {
                case 1 -> {
                    System.out.print("Masukan Panjang   : ");
                    int P = userInput.nextInt();
                    
                    System.out.print("Masukan Lebar     : ");
                    int L = userInput.nextInt();

                    double luasP = P * L;
                    System.out.println("Luas Persegi    : " + luasP);
                }
                case 2 -> {
                    System.out.print("Masukan Alas      : ");
                    double A = userInput.nextDouble();
                    
                    System.out.print("Masukan Tinggi    : ");
                    double T = userInput.nextDouble();
                    
                    double luasS = 0.5 * A * T; 
                    System.out.println("Luas Segitiga   : " + luasS);

                }
                case 3 -> {
                    System.out.print("Masukan Jari-Jari : ");
                    int J = userInput.nextInt();

                    double phi = 3.14;

                    double luasL = phi * J * J;
                    System.out.println("Luas Lingkaran  : " + luasL);
                }
                default -> {
                    System.out.println("Pilihan Tidak Tersedia!");
                }
            }
            
            System.out.print("You Want To Try Again?[Y/n] : ");
            String lagi = userInput.next().toLowerCase();
            
            switch (lagi) {
                case "y" -> next = true;
                case "n" -> {
                    next = false;
                    System.out.println("===================");
                    System.out.println("=== PROGRAM END ===");
                    System.out.println("===================");
                }
            }
        }
   
    }
    
    
}
    