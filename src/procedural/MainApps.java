package procedural;

import java.util.Scanner;

public class MainApps {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("\033[H\033[2J");
        Scanner input = new Scanner(System.in);
        String pilih;
        boolean berhenti = true;
        while (berhenti) {
            while (true) {
                //login TUI
                System.out.print("==Selamat Datang di SIAKAD==\nMasuk sebagai : \n1. Admin\n2. Dosen\n3. Mahasiswa\n4. keluar\n");
                System.out.print("Pilih : ");
                pilih = input.nextLine();
                System.out.print("\033[H\033[2J");
                if (pilih.matches("1|2|3")) break;
                if (pilih.equals("4")) {
                    berhenti = false;
                    break;
                }
                System.out.println("Input tidak dimengerti");
            }
            if (pilih.equals("1")) {
                //Admin
                
            }
            if (pilih.equals("2")) {
                //Dosen
                
            }
            if (pilih.equals("3")) {
                //Mahasiswa
                
            }
        }
    }    
}
