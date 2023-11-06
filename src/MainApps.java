
import java.util.Scanner;

public class MainApps {

    static String usernameAdmin = "admin";
    static String passwordAdmin = "admin";
    static Scanner scanner = new Scanner(System.in);
    static String[][] bioMahasiswa = {
            { "1111111111", "NOKLENT", "L", "JAKARTA", "11-11-1111", "1A" },
            { "2222222222", "BERYL", "L", "BLITAR", "22-22-2222", "1B" },
            { "3333333333", "SOMEONE", "L", "BLITAR", "33-33-3333", "1C" },
            { "4444444444", "AHOMAD", "L", "BLITAR", "44-44-4444", "1D" },
            { "5555555555", "TMI", "L", "BLITAR", "55-55-5555", "1E" }
    };
    static String[][] userMahasiswa = {
            { "1111111111", "1111111111" },
            { "2222222222", "2222222222" },
            { "3333333333", "3333333333" },
            { "4444444444", "4444444444" },
            { "5555555555", "5555555555" }
    };
    static String[][] bioDosen = {

    };
    static String[][] userDosen = {

    };

    static String[][] matkulTI = {
            { "RTI231007", "PRAK_DASPRO", "Praktikum Dasar Pemrograman", "6" },
            { "RTI231001", "PANCASILA", "Pancasila", "2" },
            { "RTI231004", "MATDAS", "Matematika Dasar", "3" },
            { "RTI231005", "BING_1", "Bahasa Inggris 1", "4" },
            { "RTI231002", "KTI", "Konsep Teknologi Informasi", "4" },
            { "RTI231008", "K3", "Keselamatan dan Kesehatan Kerja", "4" },
            { "RTI231006", "DASPRO", "Dasar Pemrograman", "4" },
            { "RTI231003", "CTPS", "Critical Thinking dan Problem Solving", "4" }
    };
    static String[][][] jadwal = {
            {
                    { "1A" },
                    { "1-RTI231004-3", "6-RTI231007-6" },
                    { "1-RTI231006-4"},
                    { "1-RTI231004-3", "5-RTI231003-4" },
                    { "4-RTI231008-4", "8-RTI231002-4" },
                    { "2-RTI231005-4", "9-RTI231001-2" },
            },
            {
                    { "1B" },
                    { "1-RTI231004-3", "6-RTI231007-6" },
                    { "3-RTI231005-4",},
                    { "4-RTI231006-4", "8-RTI231002-4" },
                    { "1-RTI231003-4","5-RTI231001-2","8-RTI231008-4"},
                    { "1-RTI231004-4",},
            },
            {
                    { "1C" },
                    { "1-RTI231004-3", "6-RTI231001-2", "8-RTI231003-4" },
                    { "6-RTI231006-4",},
                    { "2-RTI231007-7", "8-RTI231005-4" },
                    { "7-RTI231002-4" },
                    { "1-RTI231004-3", "7-RTI231008-4" },
            },
            {
                    { "1D" },
                    { "2-RTI231005-4", "8-RTI231003-4" },
                    { "1-RTI231001-2", "4-RTI231006-4", "8-RTI231008-4" },
                    { "6-RTI231007-6",},
                    { "1-RTI231004-3", "7-RTI231002-4" },
                    { "9-RTI231004-3", },
            },
            {
                    { "1E" },
                    { "2-RTI231007-6", "10-RTI231001-2" },
                    { "1-RTI231004-3", "8-RTI231005-4" },
                    { "1-RTI231002-4", "9-RTI231004-3" },
                    { "8-RTI231008-4" },
                    { "1-RTI231006-4", "8-RTI231003-4" },
            },


    };
    static String[] kumpulanHari = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat" };



    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner input = new Scanner(System.in);
        String pilih;
        String[][] dataMahasiswa;
        String[][] userMahasiswa = {
            {"1111111111", "1111111111"},
            {"2222222222", "2222222222"},
            {"3333333333", "3333333333"}
        };

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
            boolean login = true;
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

                case "MAHASISWA" -> {
                    for (int i = 0; i < userMahasiswa.length; i++) {
                        if (username.equals(userMahasiswa[i][0]) && password.equals(userMahasiswa[i][1])) {
                            dashboardMahasiswa(bioMahasiswa[i][1], bioMahasiswa[i][0]);
                            break;

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
                                    
                                    System.out.print("Masukan jumlah mahasisawa : ");
                                    int jumlahMahasiswa = input.nextInt();
                                    dataMahasiswa  = new String[jumlahMahasiswa][5];
                                    String[] labelData = {"NIM", "Nama", "Kelamin", "Alamat", "Kelas"};
                                    System.out.println();
                                    input.nextLine();
                                    
                                    for (int i = 0; i < dataMahasiswa.length; i++) {
                                        System.out.println("Mahasiswa nomor urut ke-" + (i+1));
                                        for (int j = 0; j < dataMahasiswa[i].length; j++) {
                                            System.out.print("Masukan " + labelData[j] + " : ");
                                            dataMahasiswa[i][j] = input.nextLine();
                                        }          
                                    }
                                    System.out.println("=".repeat(50));
                                    for (int i = 0; i < dataMahasiswa.length; i++) {
                                        System.out.println("Data Mahasiswa nomor urut ke-" + (i+1));
                                        for (int j = 0; j < dataMahasiswa[i].length; j++) {
                                            System.out.printf("%s : %s%n", labelData[j], dataMahasiswa[i][j]);
                                        }
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

                    System.out.println("Username dan password salah/tidak ditemukan");
                }
            }
        }
    }

    /* DASHBOARD MAHASISWA */
    static void dashboardMahasiswa(String user, String nim ) {
        while (true) {
            renderTitle("Selamat Datang " + user);
            System.out.println("=== Dashboard Mahasiswa ===");
            System.out.println("1. Biodata");
            System.out.println("2. Nilai");
            System.out.println("3. Jadwal");
            System.out.println("4. Presesi");
            System.out.println("5. Logout");
            System.out.println("x. Keluar");
            String pilih = input("PILIH");
            if (pilih.equalsIgnoreCase("x"))
                exit();
            clearScreen();
            switch (pilih) {
                case "1" -> hadleBiodataMahasiswa(nim);
                case "2" -> hadleNilaiMahasiswa();
                case "3" -> hadleJadwalMahasiswa();
                case "4" -> hadlePresensiMahasiswa();
                case "5" -> {
                    return;
                }
                default -> System.out.println("Input tidak dimengerti");
            }
        }
    }

    static void hadleBiodataMahasiswa( String nim)  {
        
        boolean userFound = false;
    
        for (int i = 0; i < bioMahasiswa.length; i++) {
            if (nim.equals(bioMahasiswa[i][0])) {
                userFound = true;
                
                System.out.println("NIM: " + bioMahasiswa[i][0]);
                System.out.println("Nama: " + bioMahasiswa[i][1]);
                System.out.println("Jenis Kelamin: " + bioMahasiswa[i][2]);
                System.out.println("Alamat: " + bioMahasiswa[i][3]);
                System.out.println("Tanggal Lahir: " + bioMahasiswa[i][4]);
                System.out.println("Kelas: " + bioMahasiswa[i][5]);
                break; 
            }
        }
    
        if (!userFound) {
            System.out.println("Mahasiswa dengan  " + nim + " tidak ditemukan.");
        }
    } 

    static void hadleNilaiMahasiswa() {
          
    }

    static void hadleJadwalMahasiswa() {

    }

    static void hadlePresensiMahasiswa() {

    }
    /* DASHBOARD MAHASISWA */

    /* DASHBOARD DOSEN */

    /* DASHBOARD DOSEN */

    /* DASHBOARD ADMIN */
    static void dashboardAdmin() {
        while (true) {
            renderTitle("Dashboard Admin");
            int userInput = pickMenu("Menu : ", new String[] {
                    "Modul Mahasiswa",
                    "Modul Dosen",
                    "Modul Kursus",
            });
            clearScreen();
            switch (userInput) {
                case 1 -> modulMahasiswa();
                case 2 -> modulDosen();
                case 3 -> modulKursus();
                case 4 -> exit();
            }
        }
    }

    /* modulMahasiswa */
    static void modulMahasiswa() {
        while (true) {
            System.out.println("Siakad / Modul Mahasiswa");
            renderTitle("Modul Mahasiswa");
            int userInput = pickMenu("Menu : ", new String[] {
                    "List Mahasiswa",
                    "Transkip Nilai",
                    "Presensi Mahasiswa",
                    "Kembali",
            });
            clearScreen();
            switch (userInput) {
                case 1 -> handleListMahasiswa();
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                    clearScreen();
                    return;
                }
            }
        }
    }

    // view data bio mahasiswa
    static void handleListMahasiswa() {
        while (true) {
            System.out.println("Siakad / Data Mahasiswa / List Mahasiswa");
            showDataBioMahasiswa();
            int userInput = pickMenu("Menu : ", new String[] {
                    "Daftarkan Mahasiswa Baru",
                    "Edit Data Mahasiswa",
                    "Hapus Data Mahasiswa",
                    "Kembali"
            });
            clearScreen();
            switch (userInput) {
                case 1 -> addDataBioMahasiswa();
                case 2 -> EditDataBioMahasiswa();
                case 3 -> removeDataBioMahasiswa();
                case 4 -> {
                    clearScreen();
                    return;
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

                    System.out.println("NIM " + input + " sudah terdaftar");
                }
            }
            case 2 -> input = getNonEmptyStringWithLimit("NAMA", 1, 25);
            case 3 -> input = getNonEmptyUniqueWithLimit("Gender L/P", 1, 1, "l-p", true);
            case 4 -> input = getNonEmptyStringWithLimit("Alamat", 1, 15);
            case 5 -> input = getNonEmptyStringWithLimit("Tanggal lahir", 10, 10);
            case 6 -> {
                clearScreen();
                return;
            }
        }
        String userChoose = getNonEmptyUniqueWithLimit("Simpan " + input + " Sebagai perubahan y/t", 1, 1, "y-t",
                true);
        if (userChoose.equalsIgnoreCase("y")) {
            bioMahasiswa[studentIndex][userInput - 1] = input;
            System.out.println("Berhasil mengedit");
        } else {
            System.out.println("Dibatalkan");
        }
        clearScreen();
    }

    // remove data bio mahasiswa
    static void removeDataBioMahasiswa() {
        String nim;
        while (true) {
            showDataBioMahasiswa();
            nim = getNonEmptyStringWithLimit("Masukan NIM yang ingin dihapus : ", 10, 10);
            if (has(bioMahasiswa, nim, 0))
                break;
            clearScreen();
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ada!");
        }
        String[][] filteredStudents = new String[bioMahasiswa.length - 1][4];
        int count = 0;
        for (String[] student : bioMahasiswa) {
            if (student[0].equals(nim))
                continue;
            filteredStudents[count] = student;
            count++;
        }
        bioMahasiswa = filteredStudents;
        clearScreen();
        System.out.println("Mahasiswa " + nim + " telah berhasil dihapus!");
    }
    /* modulMahasiswa */

    /* modulDosen */
    static void modulDosen() {

    }
    /* modulDosen */

    /* modulKursus */
    static void modulKursus() {
        while (true) {
            System.out.println("Siakad / Modul Kursus");
            renderTitle("Modul Kursus");
            int userInput = pickMenu("Menu : ", new String[] {
                    "Penempatan Kelas Mahasiswa",
                    "Penjadwalan",
                    "Penembatan Matkul dan Kelas Pengajar",
                    "Kembali"
            });
            clearScreen();
            switch (userInput) {
                case 1 -> penempatanKelasMahasiswa();
                case 2 -> penjadwalanMenuKelas();
                case 3 -> {
                }
                case 4 -> {
                    clearScreen();
                    return;
                }
            }
        }
    }

    // show table data nim,nama,kelas mahasiswa
    static void showKelasMahasiswa(String kelas) {
        String formatTable = "| %-3s | %-10s | %-25s |   %-3s |%n";
        String horizonLine = "+-----+------------+---------------------------+-------+";
        System.out.println(horizonLine);
        System.out.format("| NO  | NIM        | NAMA                      | Kelas |%n");
        System.out.println(horizonLine);
        for (int i = 0; i < bioMahasiswa.length; i++) {
            String[] takeBio = bioMahasiswa[i];
            if (takeBio[5].matches(kelas))
                System.out.printf(formatTable, (i + 1), takeBio[0], takeBio[1], takeBio[5]);
        }
        System.out.println(horizonLine);
    }

    // Penempatan kelas
    static void penempatanKelasMahasiswa() {
        final String kelas = "1A|1B|1C|1D|1E|";
        while (true) {
            System.out.println("Siakad / Modul Kursus / Penempatan Kelas Mahasiswa");
            showKelasMahasiswa(kelas);
            int userInput = pickMenu("Menu : ", new String[] {
                    "Atur Kelas",
                    "Sortir",
                    "Kembali"
            });
            clearScreen();
            switch (userInput) {
                case 1 -> aturKelasMahasiswa(kelas);
                case 2 -> sortirBerdasarkanKelas();
                case 3 -> {
                    clearScreen();
                    return;
                }
            }
        }
    }

    // atur kelas
    static void aturKelasMahasiswa(String kelas) {
        String nim, input;
        int studentIndex = -1;
        while (true) {
            showKelasMahasiswa(kelas);
            nim = getNonEmptyStringWithLimit("Masukan NIM", 10, 10);
            if (has(bioMahasiswa, nim, 0))
                break;
            clearScreen();
            System.out.println("NIM tidak ditemukan");
        }
        for (int i = 0; i < bioMahasiswa.length; i++) {
            if (bioMahasiswa[i][0].equals(nim)) {
                studentIndex = i;
                break;
            }
        }
        System.out.println("1A|1B|1C|1D|1E|");
        input = getNonEmptyUniqueWithLimit("Atur kelas", 2, 2, "1A-1B-1C-1D-1E", true);
        String userChoose = getNonEmptyUniqueWithLimit("Simpan perubahan y/t", 1, 1, "y-t",
                true);
        if (userChoose.equalsIgnoreCase("y")) {
            bioMahasiswa[studentIndex][5] = input;
            System.out.println("Berhasil mengedit");
        } else {
            System.out.println("Dibatalkan");
        }
        clearScreen();

    }

    // sortir berdasarkan kelas
    static void sortirBerdasarkanKelas() {
        while (true) {
            System.out.println("1A|1B|1C|1D|1E|");
            String kelas = getNonEmptyUniqueWithLimit("Masukan Kelas", 2, 2, "1A-1B-1C-1D-1E-", true);
            showKelasMahasiswa(kelas);
            int userInput = pickMenu("Menu : ", new String[] {
                    "Atur Kelas",
                    "Kembali"
            });
            clearScreen();
            switch (userInput) {
                case 1 -> {
                    aturKelasMahasiswa(kelas);
                    return;
                }
                case 2 -> {
                   clearScreen();
                    return;

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
                for (int i = 1; i <= 3 && login; i++) {
                    System.out.println("==Login Mahasiswa SIAKAD=="); 
                    System.out.print("USERNAME : ");
                    username = input.nextLine();
                    System.out.print("PASSWORD : ");
                    password = input.nextLine();
                    for (int baris = 0; baris < userMahasiswa.length; baris++) {
                        if (username.equals(userMahasiswa[baris][0]) && password.equals(userMahasiswa[baris][1])) {
                            System.out.print("\033[H\033[2J");
                            notWrong = true;
                            login = false;
                            break;
                        }
                        System.out.println("Username dan password salah");
                        if (i == 3) ifWrong = true;
                    }
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

            // Uji coba
            if (ifWrong) {
                int detik = 60;
                int left = detik / 60, right = detik % 60;
                for (int j = 0; j < detik; j++) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.printf("Input salah 3x silahkan tunggu %d:%02d%n",left,right);
                    try{
                        Thread.sleep(250);
                    } catch (InterruptedException e){
                        
                    }
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
