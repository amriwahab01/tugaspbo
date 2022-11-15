package amri_wahab;

import java.util.*;

public class atm {
    public static Scanner input = new Scanner(System.in);
    public static String pin,Try,norek,JenisBayar;
    public static int pilihan,tarik,transfer,bayar,bank;
    public static int saldo = 360000000;

    public static void main(String[] args) {
        System.out.println("\tPT BANK HAJIME KARISA 36\n");
        System.out.println("masukkan PIN [Tekan \"ENTER\" jika selesai memasukkan PIN]");
        pin = input.nextLine();
        
        if (pin.equals("0010 0100")){
            Try = "";
            do{
                transaksi();
                System.out.println("\naApakah Anda ingin mencoba lagi? Y/N");
                Try = input.nextLine();
            }while (Try.equalsIgnoreCase("Y"));
            
        }else{
            System.out.println("\nMaaf,nomor pin anda salah");
            
            }
        }
    public static void transaksi() {
        System.out.println("\n\tPT BANK HAJIME KARISA 36");
        System.out.println("\tPilih jenis transaksi");
        System.out.println("1.Penarikan \t 3.Pembayarann");
        System.out.println("2.Transfer \t 4.Info Rekening");
        System.out.println("masukkan pilihan = ");
        pilihan = input.nextInt(); 
        
        switch(pilihan){
            case 1:
                System.out.println("\nPENARIKAN");
                penarikan();
                break;
                
            case 2:
                System.out.println("\nTRANSFER");
                transfer();
                break;
                
            case 3:
                System.out.println("\nPEMBAYARAN");
                pembayaran();
                break;
                
            case 4:
                System.out.println("\nINFO REKENING");
                inforek();
                break;
            
        }
    }
    
    public static void penarikan() {
        int [] nominal = {50000,100000,200000,300000,500000,750000,1000000};
        System.out.println("1. 50000 \t5. 500000");
        System.out.println("2. 100000 \t6. 750000");
        System.out.println("3. 200000 \t7. 1000000");
        System.out.println("4. 300000");
        tarik = input.nextInt();
        saldo = saldo - nominal [tarik-1];
        System.out.println("Penrikan Tunai Anda Berhasil");
        System.out.println("saldo anda tersisa" + saldo);
        Try = input.nextLine();
    }
    
    public static void transfer() {
        System.out.println("\nMasukkan Jumlah Nominal Yang Akan Ditransfer = ");
        transfer = input.nextInt();
        
        System.out.println("\nPilih Tujun Transfer = ");
        String [] Bank = {"Mandiri","BRI","BCA","BNI","CIMB Niaga"};
        System.out.println("1.Mandiri");
        System.out.println("2.BRI");
        System.out.println("3.BCA");
        System.out.println("4.BNI");
        System.out.println("5.CIMB Niaga");
        bank = input.nextInt();
        
        System.out.println("\nMasukkan Nomor Rekening Tujun = ");
        input.nextLine();
        norek = input.nextLine();
        saldo = saldo - transfer;
        System.out.println("\nTransaksi Anda Berhasil, Berikut Rincianya = ");
        System.out.println("BANK: "+Bank[bank-1] + "\nNo. Rek: "+norek + "\njumlah: "+transfer);
        System.out.println("Tekan \"ENTER\" untuk melanjutkan");
        Try = input.nextLine();
        
    }
    
    public static void pembayaran() {
        System.out.println("Silahkan Masukkan Jenis pembayaran = ");
        input.nextLine();
        String jenisBayar = input.nextLine();
        System.out.println("Masukkan Jumlah Uang Untuk Pembayaran = ");
        bayar = input.nextInt();
        saldo = saldo - bayar;
        System.out.println("\nPembyaran Anda kepada "+ jenisBayar +" Berhasil");
        System.out.println("Saldo Anda Tersisa" + saldo);
        Try = input.nextLine();
        
    }
    
    public static void inforek() {
        System.out.println("\t Informsi Saldo");
        System.out.println("Saldo = "+ saldo);
        Try = input.nextLine();
        
    }
    }
