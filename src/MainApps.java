import java.util.Scanner;

public class MainApps {
    static String usernameAdmin = "admin";
    static String passwordAdmin = "admin";
    static Scanner scanner = new Scanner(System.in);
    static String[][] bioMahasiswa = {
        {"1111111111", "NOKLENT", "L","JAKARTA", "11-11-1111", "1A"},
        {"2222222222", "BERYL", "L","BLITAR", "22-22-2222", "1B"},
        {"3333333333", "SOMEONE", "L","BLITAR", "33-33-3333", "1C"},
        {"4444444444", "AHMAD", "L","BLITAR", "44-44-4444", "1D"},
        {"5555555555", "TOMI", "L","BLITAR", "55-55-5555", "1E"}
    };
    static String[][] userMahasiswa = {
        {"1111111111", "1111111111"},
        {"2222222222", "2222222222"},
        {"3333333333", "3333333333"},
        {"4444444444", "4444444444"},
        {"5555555555", "5555555555"}
    };
    static String[][] bioDosen = {

    };
    static String[][] userDosen = {

    };
    public static void main(String[] args) {
        clearScreen();
        loginView();
    }

    // DONE: login view
    public static void loginView(){
        while (true) {
            renderTitle("SISTEM AKADEMIK");
            int userInput = pickMenu("Pilih masuk sebagai", new String[] {
                "Admin",
                "Dosen",
                "Mahasiswa",
            });
            clearScreen();
            switch (userInput) {
                case 1 -> login("ADMIN");
                case 2 -> login("DSOEN");
                case 3 -> login("MAHASISWA");
            }
        }
    }
    // login logic
    public static void login(String level) {
        while (true) {
            renderTitle("SISTEM AKADEMIK " + level + " JTI");
            String username, password;
            while (true) {
                username = input("USERNAME");
                if (username.equals("x")) return;
                if (username.length() <= 10 && !username.equals("")) break;
                // tidak boleh lebih dari 10 da tidak boleh kosong
                System.out.println("Masukan Username dengan benar");
            }
            while (true) {
                password = input("PASSWORD");
                if (!password.equals("")) break;
                System.out.println("Password tidak boleh kosong");
            }
            clearScreen();
            switch (level) {
                case "ADMIN" -> {
                    if (username.equals(usernameAdmin) && password.equals(passwordAdmin)) viewDashboardAdmin();
                    System.out.println("Username dan password salah/tidak ditemukan");
                }
                case "DOSEN" -> {
                    // dashboard dosen
                }
                case "MAHASISWA" -> {
                    for (int i = 0; i < userMahasiswa.length; i++) {
                        if (username.equals(userMahasiswa[i][0]) && password.equals(userMahasiswa[i][1])) {
                            dashboardMahasiswa(bioMahasiswa[i][1]);
                            break;
                        }
                    }
                    System.out.println("Username dan password salah/tidak ditemukan");
                }
            }
        }
    }


    /* DASHBOARD MAHASISWA */
    static void dashboardMahasiswa(String user) {
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
            if (pilih.equalsIgnoreCase("x")) exit();
            clearScreen();
            switch (pilih) {
                case "1" -> hadleBiodataMahasiswa();
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
    static void hadleBiodataMahasiswa() {

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
// dashboard admin
    static void viewDashboardAdmin(){
        while (true) {
            renderTitle("Dashboard Admin");
            System.out.println("=== Dashboard Admin ===");
            System.out.println("1. Data Mahasiswa");
            System.out.println("2. Data Dosen");
            System.out.println("3. Atur Jadwal");
            System.out.println("4. Logout");
            System.out.println("x. Keluar");
            String pilih = input("PILIH");
            if (pilih.equalsIgnoreCase("x")) exit();
            clearScreen();
            switch (pilih) {
                case "1" -> RouteDataMahasiswa();
                case "2" -> {} //dosen
                case "3" -> {} //atur jadawal
                case "4" -> {
                    return;
                }
                default -> System.out.println("Input tidak dimengerti");
            }
        }
    }
    static void RouteDataMahasiswa() {
        while (true) {
            System.out.println("Siakad / Data Mahasiswa");
            renderTitle("Data Mahasiswa");
            System.out.println("1. List Mahasiswa");
            System.out.println("2. Transkip nilai");
            System.out.println("3. Presensi Mahasiswa");
            System.out.println("4. Kembali");
            System.out.println("x. Keluar");
            String pilih = input("PILIH");
            if (pilih.equalsIgnoreCase("x")) exit();
            clearScreen();
            switch (pilih) {
                case "1" -> handleListMahasiswa();
                case "2" -> {}
                case "3" -> {}
                case "4" -> {
                    return;
                }
                default -> System.out.println("Input tidak dimengerti");
            }
        }
    }
    // view data bio mahasiswa
    static void handleListMahasiswa(){
        while (true) {
            System.out.println("Siakad / Data Mahasiswa / List Mahasiswa");
            showDataBioMahasiswa();
            System.out.println("1. Daftarkan Mahasiswa Baru");
            System.out.println("2. Edit data");
            System.out.println("3. Hapus data");
            System.out.println("4. Kembali");
            System.out.println("x. Keluar");
            String pilih = input("PILIH");
            if (pilih.equalsIgnoreCase("x")) exit();
            clearScreen();
            switch (pilih) {
                case "1" -> viewAddDataBioMahasiswa();
                case "2" -> viewEditDataBioMahasiswa();
                case "3" -> viewRemoveDataBioMahasiswa();
                case "4" -> {return;}
                default -> System.out.println("Input tidak dimengerti");
            }
        }
    }
    // show data bio mahasiswa
    static void showDataBioMahasiswa(){
        String formatTable = "| %-3s | %-10s | %-25s |       %-7s | %-15s | %-13s |   %-3s |%n";
        String horizonLine = "+-----+------------+---------------------------+---------------+-----------------+---------------+-------+";
        System.out.println(horizonLine);
        System.out.format("| NO  | NIM        | NAMA                      | Jenis Kelamin | Alamat          | Tanggal Lahir | Kelas |%n");
        System.out.println(horizonLine);
        if (bioMahasiswa[0][0] == null) return; 
        for (int i = 0; i < bioMahasiswa.length; i++) {
            String[] takeBio = bioMahasiswa[i];
            
            System.out.printf(formatTable, (i+1), takeBio[0], takeBio[1], takeBio[2], takeBio[3], takeBio[4], takeBio[5]);
        }
        System.out.println(horizonLine);
    }
    // view add data bio mahasiswa
    static void viewAddDataBioMahasiswa(){
        String nim, nama, jenisKelamin, alamat, tanggalLahir, kelas;
        while (true) {
            System.out.println("Mendaftakan Mahasiswa Baru");
            while (true) {
                nim = getNonEmptyStringWithLimit("NIM", 10, 10);
                if (nim.matches("[0-9]+")) break;
                System.out.println("Input hanya boleh angka");
            }
            if (has(bioMahasiswa, nim, 0)) {
                clearScreen();
                System.out.println("NIM sudah terdaftar");
                continue;
            }
            nama = getNonEmptyStringWithLimit("Nama lengkap", 1, 25);
            while (true) {
                jenisKelamin = getNonEmptyStringWithLimit("Jenis kelamin(L/P)", 1, 1);
                if (jenisKelamin.matches("L|P|l|p")) break;
                System.out.println("Input jenis kelamin salah");
            }
            alamat = getNonEmptyStringWithLimit("Alamat", 1, 15);
            System.out.println("Format xx-xx-xxxx");
            tanggalLahir = getNonEmptyStringWithLimit("Tanggal lahir", 10, 10);
            while (true) {
                System.out.println("1A/1B/1C/1D/1E");
                kelas = getNonEmptyStringWithLimit("Kelas", 2, 2);
                if (kelas.matches("1A|1B|1C|1D|1E|1a|1b|1c|1d|1e")) break;
                System.out.println("Input kelas salah");
            }
            String pilih = input("Tambahkan data?  y/n");
            clearScreen();
            switch (pilih.toUpperCase()) {
                case "Y" -> addDataBioMahasiswa(nim, nama.toUpperCase(), jenisKelamin.toUpperCase(), alamat, tanggalLahir, kelas.toUpperCase());
                case "N" -> System.out.println("Dibatalkan");
                default -> System.out.println("Perintah tidak dimengerti gagal menambahkan");
            }
            break;
        }
    }
    // logic add data bio mahasiswa
    static void addDataBioMahasiswa(String nim, String nama, String jenisKelamin, String alamat, String tanggalLihir, String kelas){
        String[][] mahasiswaBaru = new String[bioMahasiswa.length + 1][6];
        for (int i = 0; i < bioMahasiswa.length; i++) {
            mahasiswaBaru[i] = bioMahasiswa[i];
        }
        mahasiswaBaru[mahasiswaBaru.length - 1] = new String[]{nim, nama, jenisKelamin, alamat, tanggalLihir, kelas};
        bioMahasiswa = mahasiswaBaru;
        System.out.println("Mahasiswa telah berhasil ditambahkan");

        String[][] userBaru = new String[userMahasiswa.length + 1][2];
        for (int i = 0; i < userMahasiswa.length; i++) {
            userBaru[i] = userMahasiswa[i];
        }
        userBaru[userBaru.length - 1] = new String[]{nim, nim};
        userMahasiswa = userBaru;
    }
    // DONE: dalam perbaikan
    // view edit data bio mahasiswa
    static void viewEditDataBioMahasiswa() {
        String nimLama, nim, nama, jenisKelamin, alamat, tanggalLahir, kelas;
        int studentIndex = -1;
        while (true) {
            showDataBioMahasiswa();
            nimLama = getNonEmptyStringWithLimit("masukan NIM yang ingin diubah", 10, 10);
            if (has(bioMahasiswa, nimLama, 0)) break;
            clearScreen();
            System.out.println("NIM tidak ditemukan");
        }
        for (int i = 0; i < bioMahasiswa.length; i++) {
            if (bioMahasiswa[i][0].equals(nimLama)) {
                studentIndex = i;
                break;
            }
        }
        if (studentIndex == -1) {
            clearScreen();
            System.out.println("Gagal menemukan siswa untuk diedit");
            return;
        }
        String[] mahasiswa = bioMahasiswa[studentIndex];
        clearScreen();
        while (true) {
            System.out.println("NIM lama " + mahasiswa[0]);   
            nim = getNonEmptyStringWithLimit("NIM", 10, 10);
            if (nim.matches("[0-9]+")) break;
            System.out.println("Input hanya boleh angka");
        }
            System.out.println("Nama lama " + mahasiswa[1]);
            nama = getNonEmptyStringWithLimit("Nama lengkap", 1, 25);
        while (true) {
            System.out.println("Jenis kelamin lama " + mahasiswa[2]);
            jenisKelamin = getNonEmptyStringWithLimit("Jenis kelamin(L/P)", 1, 1);
            if (jenisKelamin.matches("L|P|l|p")) break;
            System.out.println("Input jenis kelamin salah");
        }
        System.out.println("Alamat lama " + mahasiswa[3]);
        alamat = getNonEmptyStringWithLimit("Alamat", 1, 15);
        System.out.println("Tanggal lahir lama " + mahasiswa[4]);
        System.out.println("Format xx-xx-xxxx");
        tanggalLahir = getNonEmptyStringWithLimit("Tanggal lahir", 10, 10);
        while (true) {
            System.out.println("Kelas lama " + mahasiswa[5]);
            System.out.println("1A/1B/1C/1D/1E");
            kelas = getNonEmptyStringWithLimit("Kelas", 2, 2);
            if (kelas.matches("1A|1B|1C|1D|1E|1a|1b|1c|1d|1e")) break;
            System.out.println("Input kelas salah");
        }
        String pilih = input("Tambahkan data?  y/n");
        bioMahasiswa[studentIndex][0] = nim.isEmpty() ? mahasiswa[0] : nim;
        bioMahasiswa[studentIndex][1] = nama.isEmpty() ? mahasiswa[1] : nama;
        bioMahasiswa[studentIndex][2] = jenisKelamin.isEmpty() ? mahasiswa[2] : jenisKelamin;
        bioMahasiswa[studentIndex][3] = alamat.isEmpty() ? mahasiswa[3] : alamat;
        bioMahasiswa[studentIndex][4] = tanggalLahir.isEmpty() ? mahasiswa[4] : tanggalLahir;
        bioMahasiswa[studentIndex][5] = kelas.isEmpty() ? mahasiswa[5] : kelas;

        clearScreen();
        System.out.println("Berhasil mengedit");
    }
    // view hapus data bio mahasiswa
    public static void viewRemoveDataBioMahasiswa() {
        String nim;

        while (true) {
            showDataBioMahasiswa();
            nim = getNonEmptyStringWithLimit("Masukan NIM yang ingin dihapus", 10, 10);

            if (has(bioMahasiswa, nim, 0)) break;

            clearScreen();
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ada!");
        }

        String[][] filteredStudents = new String[bioMahasiswa.length - 1][4];
        int count = 0;
        for (String[] student : bioMahasiswa) {
            if (student[0].equals(nim)) continue;
            filteredStudents[count] = student;
            count++;
        }
        bioMahasiswa = filteredStudents;

        clearScreen();
        System.out.println("Students " + nim + " have been successfully removed!");
    }
    public static void showDataDosen(){
        // TODO: DOSEN
    }
    /* DASHBOARD ADMIN */

    // SCANNER
    public static String input(String info){
        System.out.print(info + " : ");
        return scanner.nextLine();
    }
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
    static boolean has(String[][] items, String needle, int fieldIndex) {
        for (String[] item : items) {
            if (item[fieldIndex].equals(needle)) return true;
        }
        return false;
    }
    static void renderTitle(String  title) {
        int paddingSize = 4;
        int titleLength = title.length();

        String horizontalBorder = "+" + "-".repeat(titleLength + paddingSize * 2) + "+";

        System.out.println(horizontalBorder);
        System.out.println("|" + " ".repeat(paddingSize) + title + " ".repeat(paddingSize) + "|");
        System.out.println(horizontalBorder);
    }
    static String getNonEmptyString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String userInput = scanner.nextLine().trim();
            if (!userInput.isEmpty()) return userInput;
            System.out.println("Masukan tidak boleh kosong!");
        }
    }
    static String getNonEmptyStringWithLimit(String prompt, int min, int max) {
        while (true) {
            String userInput = getNonEmptyString(prompt);
            if (userInput.length() >= min && userInput.length() <= max) return userInput;
            System.out.println("Masukan tidak boleh lebih rendah dari " + min + " atau lebih besar dari " + max);
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
            try {
                int userInput = Integer.parseInt(getNonEmptyString("Pilih menu : "));
                if (userInput == menus.length + 1) exit();
                if (userInput < 1 || userInput > menus.length) {
                    System.out.println("Masukan salah");
                    continue;
                }
                return userInput;
            } catch (Exception e) {
                System.out.println("Input salah masukan angka");
            }
        }
    }
}