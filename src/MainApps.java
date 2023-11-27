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

    /* JADWAL */
    static String[][] matkulTI;
    static String[][] jadwal_1A;
    static String[][] jadwal_1B;
    static String[][] jadwal_1C;
    static String[][] jadwal_1D;
    static String[][] jadwal_1E;
    /* JADWAL */

    static void fillJadwal() {
        String[][] matkulTI = {
            { "RTI231007", "PRAK_DASPRO", "Praktikum Dasar Pemrograman", "6" },
            { "RTI231001", "PANCASILA", "Pancasila", "2" },
            { "RTI231004", "MATDAS", "Matematika Dasar", "6" },
            { "RTI231005", "BING_1", "Bahasa Inggris 1", "4" },
            { "RTI231002", "KTI", "Konsep Teknologi Informasi", "4" },
            { "RTI231008", "K3", "Keselamatan dan Kesehatan Kerja", "4" },
            { "RTI231006", "DASPRO", "Dasar Pemrograman", "4" },
            { "RTI231003", "CTPS", "Critical Thinking dan Problem Solving", "4" }
        };
        String[][] jadwal_1A = {
            { "1-RTI231004-3", "6-RTI231007-6", "" },
            { "1-RTI231006-4",              "", "" },
            { "1-RTI231004-3", "5-RTI231003-4", "" },
            { "4-RTI231008-4", "8-RTI231002-4", "" },
            { "2-RTI231005-4", "9-RTI231001-2", "" },
        };
        String[][] jadwal_1B = {
            { "1-RTI231004-3", "6-RTI231007-6", "" },
            { "3-RTI231005-4", ""             , "" },
            { "4-RTI231006-4", "8-RTI231002-4", "" },
            { "1-RTI231003-4","5-RTI231001-2","8-RTI231008-4"},
            { "1-RTI231004-4", ""             , " "},
        };
        String[][] jadwal_1C = {
            { "1-RTI231004-3", "6-RTI231001-2", "8-RTI231003-4" },
            { "6-RTI231006-4", ""             , "" },
            { "2-RTI231007-7", "8-RTI231005-4", "" },
            { "7-RTI231002-4", ""             , "" },
            { "1-RTI231004-3", "7-RTI231008-4", "" },
        };
        String[][] jadwal_1D = {
                { "2-RTI231005-4", "8-RTI231003-4", "" },
                { "1-RTI231001-2", "4-RTI231006-4", "8-RTI231008-4" },
                { "6-RTI231007-6", ""             , "" },
                { "1-RTI231004-3", "7-RTI231002-4", "" },
                { "9-RTI231004-3", ""             , "" },
        };
        String[][] jadwal_1E = {
            { "2-RTI231007-6", "10-RTI231001-2", ""  },
            { "1-RTI231004-3", "8-RTI231005-4", ""  },
            { "1-RTI231002-4", "9-RTI231004-3", ""  },
            { "8-RTI231008-4", ""             , "" },
            { "1-RTI231006-4", "8-RTI231003-4", ""  },
        };
    }

    static String[][] transkipNilai = {
            {}
    };
    static String[] kumpulanHari = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat" };

    public static void main(String[] args) {
        run();
    }

    static void run () {
        clearScreen();
        // login();
        aturJadwal(0);
        // penjadwalanMenuKelas();
        // showDataBioMahasiswa();
    }

    // DONE: login view
    static void login() {
        while (true) {
            renderTitle("SISTEM AKADEMIK");
            int userInput = pickMenu("Pilih masuk sebagai", new String[] {
                    "Admin",
                    "Dosen",
                    "Mahasiswa",
            });
            clearScreen();
            switch (userInput) {
                case 1 -> loginRole("ADMIN");
                case 2 -> loginRole("DOSEN");
                case 3 -> loginRole("MAHASISWA");
            }
        }
    }

    // login logic
    static void loginRole(String level) {
        while (true) {
            renderTitle("SISTEM AKADEMIK " + level + " JTI");
            String username, password;
            username = getNonEmptyStringWithLimit("USERNAME", 1, 10);
            password = getNonEmptyStringWithLimit("PASSWORD", 1, 10);
            clearScreen();
            switch (level) {
                case "ADMIN" -> {
                    if (username.equals(usernameAdmin) && password.equals(passwordAdmin))
                        dashboardAdmin();
                    System.out.println("Username dan password salah/tidak ditemukan");
                }
                case "DOSEN" -> {
                    // dashboard dosen
                }
                case "MAHASISWA" -> {
                    for (int i = 0; i < userMahasiswa.length; i++) {
                        if (username.equals(userMahasiswa[i][0]) && password.equals(userMahasiswa[i][1])) {
                            dashboardMahasiswa(bioMahasiswa[i][1], bioMahasiswa[i][0]);
                            break;
                        }
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
        }
    }

    // show table data bio mahasiswa
    static void showDataBioMahasiswa() {
        String formatTable = "| %-3s | %-10s | %-25s |       %-7s | %-15s | %-13s |   %-3s |%n";
        String horizonLine = "+-----+------------+---------------------------+---------------+-----------------+---------------+-------+";
        System.out.println(horizonLine);
        System.out.format(
                "| NO  | NIM        | NAMA                      | Jenis Kelamin | Alamat          | Tanggal Lahir | Kelas |%n");
        System.out.println(horizonLine);
        for (int i = 0; i < bioMahasiswa.length; i++) {
            String[] takeBio = bioMahasiswa[i];
            System.out.printf(formatTable, (i + 1), takeBio[0], takeBio[1], takeBio[2], takeBio[3], takeBio[4],
                    takeBio[5]);
        }
        System.out.println(horizonLine);
    }

    // show data bio mahasiswa and menu
    static void showBioAMahasiswa(String nim) {
        String formatTable = "| %-3s | %-10s | %-25s |       %-7s | %-15s | %-13s |   %-3s |%n";
        String horizonLine = "+-----+------------+---------------------------+---------------+-----------------+---------------+-------+";
        System.out.println(horizonLine);
        System.out.format(
                "| NO  | NIM        | NAMA                      | Jenis Kelamin | Alamat          | Tanggal Lahir | Kelas |%n");
        System.out.println(horizonLine);
        for (int i = 0; i < bioMahasiswa.length; i++) {
            String[] takeBio = bioMahasiswa[i];
            if (nim.equals(takeBio[0])) {
                System.out.printf(formatTable, (i + 1), takeBio[0], takeBio[1], takeBio[2], takeBio[3], takeBio[4],
                        takeBio[5]);
                break;
            }
        }
        System.out.println(horizonLine);

    }

    // add data bio mahasiswa
    static void addDataBioMahasiswa() {
        String nim, nama, jenisKelamin, alamat, tanggalLahir;
        nim = getNonEmptyNumberStringWithLimit("NIM", 10, 10);
        if (has(bioMahasiswa, nim, 0)) {
            System.out.println("NIM " + nim + " sudah terdaftar");
            return;
        }
        nama = getNonEmptyStringWithLimit("NAMA", 1, 25);
        jenisKelamin = getNonEmptyUniqueWithLimit("Gender L/P", 1, 1, "l-p", true);
        alamat = getNonEmptyStringWithLimit("Alamat", 1, 15);
        tanggalLahir = getNonEmptyStringWithLimit("Tanggal lahir", 10, 10);
        String userChoose = getNonEmptyUniqueWithLimit("Tambahkan data? y/t", 1, 1, "y-t", true);
        clearScreen();
        if (userChoose.equalsIgnoreCase("y"))
            addDataBioMahasiswa(nim, nama.toUpperCase(), jenisKelamin.toUpperCase(), alamat, tanggalLahir, "N");
        else
            System.out.println("Dibatalkan");
    }

    // add data bio mahasiswa
    static void addDataBioMahasiswa(String nim, String nama, String jenisKelamin, String alamat, String tanggalLihir,
            String kelas) {
        String[][] mahasiswaBaru = new String[bioMahasiswa.length + 1][6];
        for (int i = 0; i < bioMahasiswa.length; i++) {
            mahasiswaBaru[i] = bioMahasiswa[i];
        }
        mahasiswaBaru[mahasiswaBaru.length - 1] = new String[] { nim, nama, jenisKelamin, alamat, tanggalLihir, kelas };
        bioMahasiswa = mahasiswaBaru;
        System.out.println("Mahasiswa telah berhasil ditambahkan");

        String[][] userBaru = new String[userMahasiswa.length + 1][2];
        for (int i = 0; i < userMahasiswa.length; i++) {
            userBaru[i] = userMahasiswa[i];
        }
        userBaru[userBaru.length - 1] = new String[] { nim, nim };
        userMahasiswa = userBaru;
    }

    // edit data bio mahasiswa
    static void EditDataBioMahasiswa() {
        String nimLama, input = "";
        int studentIndex = -1;
        while (true) {
            showDataBioMahasiswa();
            nimLama = getNonEmptyStringWithLimit("masukan NIM yang ingin diubah", 10, 10);
            if (has(bioMahasiswa, nimLama, 0))
                break;
            clearScreen();
            System.out.println("NIM tidak ditemukan");
        }
        for (int i = 0; i < bioMahasiswa.length; i++) {
            if (bioMahasiswa[i][0].equals(nimLama)) {
                studentIndex = i;
                break;
            }
        }
        String[] tempBioMahasiswa = bioMahasiswa[studentIndex];
        clearScreen();
        showBioAMahasiswa(nimLama);
        int userInput = pickMenu("Ubah data", new String[] {
                "NIM",
                "Nama",
                "Jenis Kelamin",
                "Alamat",
                "Tanggal Lahir",
                "Kembali"
        });
        switch (userInput) {
            case 1 -> {
                while (true) {
                    input = getNonEmptyNumberStringWithLimit("NIM", 10, 10);
                    if (has(bioMahasiswa, input, 0))
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
    
    // transkip nilai
    static void transkipNilai() {

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
            }
        }
    }

    // penjadwalan
    static void penjadwalanMenuKelas() {
        while (true) {
            System.out.println("Siakad / Modul Kursus / Penjadwalan");
            int userInput = pickMenu("Kelas : ", new String[] {
                    "1A",
                    "1B",
                    "1C",
                    "1D",
                    "1E",
                    "Kembali"
            });
            clearScreen();
            switch (userInput) {
                case 1 -> jadwalByKelas("1A", 0);
                case 2 -> jadwalByKelas("1B", 1);
                case 3 -> jadwalByKelas("1C", 2);
                case 4 -> jadwalByKelas("1D", 3);
                case 5 -> jadwalByKelas("1E", 4);
                case 6 -> {
                    clearScreen();
                    return;
                }
            }
        }
    }

    // jadwal kelas
    static void jadwalByKelas(String kelasString, int kelasInt) {
        while (true) {
            System.out.println("Siakad / Modul Kursus / Penjadwalan / " + kelasString);
            showJadwal(kelasInt);
            int userInput = pickMenu("", new String[] {
                    "Atur",
                    "Kembali"
            });
            clearScreen();
            switch (userInput) {
                case 1 -> aturJadwal(kelasInt);
                case 2 -> {
                    clearScreen();
                    return;
                }
            }
        }
    }

    static void showJadwal(int kelas) {
        System.out.println("+------+" + "-----+".repeat(11));
        System.out.println("|      |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  |  10 |  11 |");
        System.out.println("+------+" + "-----+".repeat(11));
        String formatJadwal = "|%-6s|%-66s%n";
        int index2 = 1;
        for (String hari : kumpulanHari) {
            int begin = 0;
            int howLong = 0;
            String matkul = "";
            String simpanJadwal = "";
            int addSpace = -1;
            int index3 = 0;
            int jadwalLenght = 0;
            String[] tempArray;
            for (int i = 1; i <= 11; i++) {
                if (jadwalLenght < jadwal[kelas][index2].length) {
                    tempArray = jadwal[kelas][index2][index3].split("-");
                    if (jadwal[kelas][index2][index3].equals("")) {
                        begin = 0;
                    }
                    else if ( Integer.parseInt(tempArray[0]) == i) {
                        begin = Integer.parseInt(tempArray[0]);
                        howLong = Integer.parseInt(tempArray[2]);
                        for (int j = 0; j < matkulTI.length; j++) {
                            if (tempArray[1].equals(matkulTI[j][0])) {
                                matkul = matkulTI[j][1];
                                break;
                            }
                        }
                        jadwalLenght++;
                    }
                } else
                    begin = 0;
                if (i == begin) {
                    simpanJadwal += matkul + " ".repeat(howLong * 5 + (howLong - 1) - matkul.length())+ "|";
                        i = i + howLong - 1;
                        addSpace = -1;
                        index3++;
                } else {
                    simpanJadwal += "-".repeat(5) + "|";
                    addSpace++;
                }
            }
            index2++;
            System.out.printf(formatJadwal, hari, simpanJadwal);
            String line = "+------+" + "-".repeat(65) + "+%n";
            System.out.printf(line);
        }
    }

    // show matkulti
    static void matkul() { 
        String formatTable = "|  {%s}  | %-8s | %-40s |%n";
        String horizonLine = "+-------+-----------+"+ "-".repeat(42) +"+";
        System.out.println(horizonLine);
        System.out.println("| index | Kode      | Mata Kuliah" + " ".repeat(30) +"|");
        System.out.println(horizonLine);
        int number = 1;
        for (int i = 0; i < matkulTI.length; i++) {
            String[] takeMatkul = matkulTI[i];
            System.out.printf(formatTable,number++, takeMatkul[0], takeMatkul[2]);
        }
        System.out.println(horizonLine);
    }
    
    // atur jadwal
    static void aturJadwal(int kelasInt) {
        String[][] tempJadawal =  new String[5][3]; 
        showJadwal(kelasInt);
        matkul();
        String _1,_2,_3;
        int min = 1;
        System.out.println("Format {1}-{2}-{3}");
        System.out.println("1. Mulai dari jam ke-(1-11)\n2. Index Kode matkul\n3. Lama jam matkul(1-6)");
        for (int i = 0; i < kumpulanHari.length; i++) {
            System.out.println("Masukan jadwal pada hari "+kumpulanHari[i]);
            for (int j = 0; j < tempJadawal[i].length; j++) {
                while (true) {
                    _1 = getNonEmptyNumberWithLimit("{1}", min, 11);
                    if (((11-min)+Integer.parseInt(_1))<= 11) break;
                    System.out.println("Jam tidak tersedia");
                }
                _2 = getNonEmptyNumberWithLimit("{2}", 1, 8);
                _3 = getNonEmptyNumberWithLimit("{3}", 1, 11-min);
                min += Integer.parseInt(_3);
                System.out.printf("%s-%s-%s%n",_1,matkulTI[Integer.parseInt(_2)][2],_3);
                tempJadawal[i][j] = _1 + "-" + _2 + "-" + _3;
                if (min > 8  ) break;
                String next = getNonEmptyUniqueWithLimit("Masukan matkul selanjutnya y/n(Lanjut hari berikutnya)", 1, 1 ,"y-n",true);
                if (next.equals("N")) break; 
            }
            
        }
    }

    static void inputJadawal () {

    }


    /* modulKursus */
    /* DASHBOARD ADMIN */

    /* HELPER */

    

    // Clear terminal
    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Fungsi untuk keluar
    static void exit() {
        clearScreen();
        System.out.println("Keluar...");
        System.exit(0);
    }

    // Fungsi untuk mengecek apakah ada item di array
    static boolean has(String[][] items, String needle, int fieldIndex) {
        for (String[] item : items) {
            if (item[fieldIndex].equals(needle)) return true;
        }
        return false;
    }

    // Melakukan print title
    static void renderTitle(String title) {
        int paddingSize = 4;
        int titleLength = title.length();

        String horizontalBorder = "+" + "-".repeat(titleLength + paddingSize * 2) + "+";

        System.out.println(horizontalBorder);
        System.out.println("|" + " ".repeat(paddingSize) + title + " ".repeat(paddingSize) + "|");
        System.out.println(horizontalBorder);
    }


    // mengembalikan input String user scanner
    static String input(String info) {
        System.out.print(info + " : ");
        return scanner.nextLine().trim();
    }

    // mengembalikan input String user scanner tidak boleh kosong
    static String getInputString(String prompt, boolean allowEmpty) {
        while (true) {
            String userInput = input(prompt);
            if (allowEmpty && userInput.isEmpty()) return userInput;
            if (!userInput.isEmpty()) return userInput;
            System.out.println("Masukan tidak boleh kosong!");
        }
    }

    static String getInputStringWithLimit(String prompt, int min, int max, boolean allowEmpty) {
        while (true) {
            String userInput = getInputString(prompt, allowEmpty);
            if (allowEmpty && userInput.isEmpty()) return userInput;
            if (userInput.length() >= min && userInput.length() <= max) return userInput;
            System.out.println("Masukan minimal " + min + " karakter dan maksimal " + max + " karakter");
        }
    }

    static String getInputStringNumber(String prompt, boolean allowEmpty) {
        while (true) {
            String userInput = getInputString(prompt, allowEmpty);
            if (allowEmpty && userInput.isEmpty()) return userInput;
            if (userInput.matches("[0-9]+")) return userInput;
            System.out.println("Masukan hanya boleh angka");
        }
    }

    static String getInputStringNumberwithLimit(String prompt, int min, int max, boolean allowEmpty) {
        while (true) {
            String userInput = getInputStringNumber(prompt, allowEmpty);
            if (allowEmpty && userInput.isEmpty()) return userInput;
            if (Integer.parseInt(userInput) >= min && Integer.parseInt(userInput) <= max) return userInput;
            System.out.println("Masukan yang tersedia " + min + "-" + max);
        }
    }

    // String allow gunakan "-"
    static String getInputUniqueWord(String prompt, int min, int max, boolean ignoreCase, String... uniqueWord) {
        while (true) {
            String userInput = getInputString(prompt, false);
            for (int i = 0; i < uniqueWord.length; i++) {
                if (ignoreCase && uniqueWord[i].equalsIgnoreCase(userInput)) return userInput.toUpperCase();
                if (uniqueWord[i].equals(userInput)) return userInput;
            }
            System.out.println("Format masukan salah");
        }
    }

    static int pickMenu(String menuTitle, String[] menus) {
        System.out.println(menuTitle);
        int i = 0;
        while (i < menus.length) {
            System.out.printf("%d. %s%n", i + 1, menus[i]);
            i++;
        }
        System.out.printf("%d. %s%n", i + 1, "Keluar");
        while (true) {
            String userInput = getInputStringNumberwithLimit("Pilih menu", 1, menus.length + 1, false);
            int userNumber = Integer.parseInt(userInput);
            if (userNumber == menus.length + 1)
                exit();
            if (!(userNumber < 1 || userNumber > menus.length)) {
                return userNumber;
            }
            System.out.println("Format masukan salah");
        }
    }
    
    /* HELPER */
}