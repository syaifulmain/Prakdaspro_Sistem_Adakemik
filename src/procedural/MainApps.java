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
            String username, password;
            boolean ifWrong = false;
            boolean notWrong = false;
            if (pilih.equals("1")) {
                //Admin
                for (int i = 1; i <= 3; i++) {
                    System.out.println("==Login Admin SIAKAD=="); 
                    System.out.print("USERNAME : ");
                    username = input.nextLine();
                    System.out.print("PASSWORD : ");
                    password = input.nextLine();
                    if (username.equals("admin") && password.equals("admin")) {
                        notWrong = true;
                                System.out.print("\033[H\033[2J");
                        break;
                    }
                    System.out.println("Username dan password salah");
                    if (i == 3) ifWrong = true;
                }
                while (notWrong) {
                    System.out.println("Dashboard Admin");
                    System.out.println("1. Mahasiswa\n2. Dosen\n3. Kursus\n4. Keluar");
                    System.out.print("Pilih : ");
                    pilih = input.nextLine();
                            System.out.print("\033[H\033[2J");
                    switch (pilih) {
                        case "1" -> {
                            while (notWrong) {
                                System.out.println("Modul Mahasiswa");
                                System.out.println("1. List Mahasiswa\n2. Transkip nilai\n3. Presensi Mahasiswa\n4. user\n5. Kembali");
                                System.out.print("pilih : ");
                                pilih = input.nextLine();
                                        System.out.print("\033[H\033[2J");
                                if (pilih.matches("2|3|4")) System.out.println("Maintenance");
                                else if (pilih.equals("1")) {
                                    
                                    
                                    String[][] dataMahasiswa;
                                    System.out.print("Masukan jumlah mahasisawa : ");
                                    int jumlahMahasiswa = input.nextInt();
                                    dataMahasiswa  = new String[jumlahMahasiswa][5];
                                    
                                    for (int i = 0; i < dataMahasiswa.length; i++) {
                                        System.out.println("Mahasiswa nomor urut ke-" + (i+1));
                                        System.out.print("Masukan NIM : ");
                                        dataMahasiswa[i][0] = input.nextLine();              
                                        System.out.print("Masukan Nama : ");
                                        dataMahasiswa[i][1] = input.nextLine();              
                                        System.out.print("Masukan Kelamin : ");
                                        dataMahasiswa[i][2] = input.nextLine();              
                                        System.out.print("Masukan Alamat : ");
                                        dataMahasiswa[i][2] = input.nextLine();              
                                        System.out.print("Masukan Kelas : ");
                                        dataMahasiswa[i][2] = input.nextLine();              
                                    }

                                    for (int i = 0; i < dataMahasiswa.length; i++) {
                                        System.out.println("Data Mahasiswa nomor urut ke-" + (i+1));
                                        System.out.println("NIM : " +dataMahasiswa[i][0]);
                                        System.out.println("Nama : " +dataMahasiswa[i][1]);
                                        System.out.println("kelamin : " +dataMahasiswa[i][2]);
                                        System.out.println("Alamat : " +dataMahasiswa[i][3]);
                                        System.out.println("Kelas : " +dataMahasiswa[i][4] + "\n");
                                    }

                                }
                                else if (pilih.equals("5")) break;
                                else System.out.println("Input tidak dimengerti");
                            }
                        }
                        case "2" -> {
                            while (notWrong) {
                                System.out.println("Modul Dosen");
                                System.out.println("1. List Dosen\n2. user\n3. Kembali");
                                System.out.print("pilih : ");
                                pilih = input.nextLine();
                                        System.out.print("\033[H\033[2J");
                                if (pilih.matches("1|2")) System.out.println("Maintenance");
                                else if (pilih.equals("3")) break;
                                else System.out.println("Input tidak dimengerti");
                            }
                        }
                        case "3" -> {
                            while (notWrong) {
                                System.out.println("Modul Kursus");
                                System.out.println("1. Kelas mahasiswa\n2. Matkul pengajar\n3. Penjadwalan\n4. Kembali");
                                System.out.print("pilih : ");
                                pilih = input.nextLine();
                                        System.out.print("\033[H\033[2J");
                                if (pilih.matches("1|2|3")) System.out.println("Maintenance");
                                else if (pilih.equals("4")) break;
                                else System.out.println("Input tidak dimengerti");
                            }
                        }
                        case "4" -> {
                            notWrong = false;
                            berhenti = false;
                            System.out.println("Keluar......");
                        }
                        default -> System.out.println("Input tidak dimengerti");
                    }
                }
            }
            if (pilih.equals("2")) {
              //Dosen
                // iniBug = input.nextLine();
                for (int i = 1; i <= 3; i++) {
                    System.out.println("==Login Dosen SIAKAD=="); 
                    System.out.print("USERNAME : ");
                    username = input.nextLine();
                    System.out.print("PASSWORD : ");
                    password = input.nextLine();
                    if (username.equals("dosen") && password.equals("dosen")) {
                        notWrong = true;
                                System.out.print("\033[H\033[2J");
                        break;
                    }
                    System.out.println("Username dan password salah");
                    if (i == 3) ifWrong = true;
                }
                while (notWrong) {
                    while (notWrong) {
                        System.out.println("Dashboard Dosen");
                        System.out.println("1. Penilaian\n2. Presensi\n3. Matkul\n4. Keluar");
                        System.out.print("Pilih : ");
                        pilih = input.nextLine();
                                System.out.print("\033[H\033[2J");
                        switch (pilih) {
                            case "1" -> {
                                while (notWrong) {
                                    System.out.println("Penilaian Mahasiswa");
                                    System.out.println("1. Kelas \n2. Kelas\n3. Kelas\n4. Kembali");
                                    System.out.print("pilih : ");
                                    pilih = input.nextLine();
                                            System.out.print("\033[H\033[2J");
                                    if (pilih.matches("1|2|3")) {
                                        int total = 0;
                                        System.out.println("-----------------------------------------");
                                        for (int i = 1; i <= 5; i++) {
                                            System.out.print("Masukan nilai ke-" + i + " :");
                                            total += input.nextInt();
                                        } 
                                        System.out.println("Rata-rata nilai adalah " + total/5);
                                        System.out.println("-----------------------------------------");
                                        input.nextLine();

                                    }else if (pilih.equals("4")){
                                        break;
                                    
                                    }else System.out.println("Input tidak dimengerti");
                                }
                            }
                            case "2" -> {
                                while (notWrong) {
                                    System.out.println("Presensi Mahasiswa");
                                    System.out.println("1. Kelas \n2. Kelas\n3. Kelas\n4. Kembali");
                                    System.out.print("pilih : ");
                                    pilih = input.nextLine();
                                            System.out.print("\033[H\033[2J");
                                    if (pilih.matches("1|2|3")) System.out.println("Maintenance");
                                    else if (pilih.equals("4")) break;
                                    else System.out.println("Input tidak dimengerti");
                                }
                            }
                            case "3" -> {
                                while (notWrong) {
                                    System.out.println("MENAMPILAKN MATKUL");
                                    System.out.println("Maintenance");
                                    System.out.println("1. Kembali");
                                    System.out.print("pilih : ");
                                    pilih = input.nextLine();
                                            System.out.print("\033[H\033[2J");
                                    if (pilih.equals("1")) break;
                                    else System.out.println("Input tidak dimengerti");
                                }
                            }
                            case "4" -> {
                                notWrong = false;
                                berhenti = false;
                                System.out.println("Keluar......");
                            }
                            default -> System.out.println("Input tidak dimengerti");
                        }
                    }
                }
            }
            if (pilih.equals("3")) {
                //Mahasiswa
                for (int i = 1; i <= 3; i++) {
                    System.out.println("==Login Mahasiswa SIAKAD=="); 
                    System.out.print("USERNAME : ");
                    username = input.nextLine();
                    System.out.print("PASSWORD : ");
                    password = input.nextLine();
                    if (username.equals("mahasiswa") && password.equals("mahasiswa")) {
                        notWrong = true;
                                System.out.print("\033[H\033[2J");
                        break;
                    }
                    System.out.println("Username dan password salah");
                    if (i == 3) ifWrong = true;
                }
                while (notWrong) {
                    System.out.println("Dashboard Mahasiswa");
                    System.out.println("1. Biodata\n2. Presensi\n3. Matkul\n4. Nilai\n5. Keluar");
                    System.out.print("Pilih : ");
                    pilih = input.nextLine();
                            System.out.print("\033[H\033[2J");
                    switch (pilih) {
                        case "1" -> {
                            while (notWrong) {
                                System.out.println("MENAMPILKAN BIODATA");
                                System.out.println("Maintenance");
                                System.out.println("1. Kembali");
                                System.out.print("pilih : ");
                                pilih = input.nextLine();
                                        System.out.print("\033[H\033[2J");
                                if (pilih.equals("1")) break;
                                else System.out.println("Input tidak dimengerti");
                            }
                        }
                        case "2" -> {
                            while (notWrong) {
                                System.out.println("MENAMPILKAN PRESENSI");
                                System.out.println("Maintenance");
                                System.out.println("1. Kembali");
                                System.out.print("pilih : ");
                                pilih = input.nextLine();
                                        System.out.print("\033[H\033[2J");
                                if (pilih.equals("1")) break;
                                else System.out.println("Input tidak dimengerti");
                            }
                        }
                        case "3" -> {
                            while (notWrong) {
                                System.out.println("MENAMPILAKN MATKUL");
                                System.out.println("Maintenance");
                                System.out.println("1. Kembali");
                                System.out.print("pilih : ");
                                pilih = input.nextLine();
                                        System.out.print("\033[H\033[2J");
                                if (pilih.equals("1")) break;
                                else System.out.println("Input tidak dimengerti");
                            }
                        }
                        case "4" -> {
                            while (notWrong) {
                                System.out.println("MENAMPILAKN NILAI");
                                System.out.println("Maintenance");
                                System.out.println("1. Kembali");
                                System.out.print("pilih : ");
                                pilih = input.nextLine();
                                        System.out.print("\033[H\033[2J");
                                if (pilih.equals("1")) break;
                                else System.out.println("Input tidak dimengerti");
                            }
                        }
                        case "5" -> {
                            notWrong = false;
                            berhenti = false;
                            System.out.println("Keluar......");
                        }
                        default -> System.out.println("Input tidak dimengerti");
                    }
                }
            }
            if (ifWrong) {
                short left = 1, right = 0;
                for (int j = 0; j < 60; j++) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.printf("Input salah 3x silahkan tunggu %d:%02d%n",left,right);
                    Thread.sleep(250);
                    if (right == 0) {
                        left --;
                        right = 59;
                    } else right--;
                }
                        System.out.print("\033[H\033[2J");
            }
        }
    }    
}
