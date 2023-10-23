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
        login();
    }

    // DONE: login view
    public static void login(){
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
                case 2 -> loginRole("DSOEN");
                case 3 -> loginRole("MAHASISWA");
            }
        }
    }
    // login logic
    public static void loginRole(String level) {
        while (true) {
            renderTitle("SISTEM AKADEMIK " + level + " JTI");
            String username, password;
            username = getNonEmptyStringWithLimit("USERNAME : ", 1, 10);
            password = getNonEmptyStringWithLimit("PASSWORD : ", 1, 10);
            clearScreen();
            switch (level) {
                case "ADMIN" -> {
                    if (username.equals(usernameAdmin) && password.equals(passwordAdmin)) dashboardAdmin();
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
    static void dashboardAdmin(){
        while (true) {
            renderTitle("Dashboard Admin");
            int userInput = pickMenu("Menu : ", new String[] {
                "Modul Mahasiswa",
                "Modul Dosen",
                "Modul Kursus"
            });
            clearScreen();
            switch (userInput) {
                case 1 -> modulMahasiswa();
                case 2 -> {} //dosen
                case 3 -> {}
            }
        }
    }
    static void modulMahasiswa() {
        while (true) {
            System.out.println("Siakad / Data Mahasiswa");
            renderTitle("Modul Mahasiswa");
            int userInput = pickMenu("Menu : ", new String[] {
                "List Mahasiswa",
                "Transkip Nilai",
                "Presensi Mahasiswa",
                "Kembali"
            });
            clearScreen();
            switch (userInput) {
                case 1 -> handleListMahasiswa();
                case 2 -> {}
                case 3 -> {}
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
    // show data bio mahasiswa
    static void showDataBioMahasiswa() {
        String formatTable = "| %-3s | %-10s | %-25s |       %-7s | %-15s | %-13s |   %-3s |%n";
        String horizonLine = "+-----+------------+---------------------------+---------------+-----------------+---------------+-------+";
        System.out.println(horizonLine);
        System.out.format("| NO  | NIM        | NAMA                      | Jenis Kelamin | Alamat          | Tanggal Lahir | Kelas |%n");
        System.out.println(horizonLine);
        for (int i = 0; i < bioMahasiswa.length; i++) {
            String[] takeBio = bioMahasiswa[i];
            System.out.printf(formatTable, (i+1), takeBio[0], takeBio[1], takeBio[2], takeBio[3], takeBio[4], takeBio[5]);
        }
        System.out.println(horizonLine);
    }
    static void showBioAMahasiswa(String nim) {
        String formatTable = "| %-3s | %-10s | %-25s |       %-7s | %-15s | %-13s |   %-3s |%n";
        String horizonLine = "+-----+------------+---------------------------+---------------+-----------------+---------------+-------+";
        System.out.println(horizonLine);
        System.out.format("| NO  | NIM        | NAMA                      | Jenis Kelamin | Alamat          | Tanggal Lahir | Kelas |%n");
        System.out.println(horizonLine);
        for (int i = 0; i < bioMahasiswa.length; i++) {
            String[] takeBio = bioMahasiswa[i];
            if (nim.equals(takeBio[0])) {
                System.out.printf(formatTable, (i+1), takeBio[0], takeBio[1], takeBio[2], takeBio[3], takeBio[4], takeBio[5]);
                break;
            }
        }
        System.out.println(horizonLine);

    }
    // view add data bio mahasiswa
    static void addDataBioMahasiswa() {
        String nim, nama, jenisKelamin, alamat, tanggalLahir;
        nim = getNonEmptyNumberWithLimit("NIM : ", 10, 10);
        if (has(bioMahasiswa, nim, 0)) {
            System.out.println("NIM " + nim + " sudah terdaftar");
            return;
        }
        nama = getNonEmptyStringWithLimit("NAMA : ", 1, 25);
        jenisKelamin = getNonEmptyUniqueWithLimit("Gender L/P", 1, 1, "l-p", true);
        alamat = getNonEmptyStringWithLimit("Alamat : ", 1, 15);
        tanggalLahir = getNonEmptyStringWithLimit("Tanggal lahir", 10, 10);
        String userChoose = getNonEmptyUniqueWithLimit("Tambahkan data? y/t : ", 1, 1, "y/t", true);
        clearScreen();
        if (userChoose.equalsIgnoreCase("y")) addDataBioMahasiswa(nim, nama.toUpperCase(), jenisKelamin.toUpperCase(), alamat, tanggalLahir,"N");
        else System.out.println("Dibatalkan");
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
    static void EditDataBioMahasiswa() {
        String nimLama, input = "";
        int studentIndex = -1;
        while (true) {
            showDataBioMahasiswa();
            nimLama = getNonEmptyStringWithLimit("masukan NIM yang ingin diubah : ", 10, 10);
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
                    input = getNonEmptyNumberWithLimit("NIM : ", 10, 10);
                    if (has(bioMahasiswa, input, 0)) break;
                    System.out.println("NIM " + input + " sudah terdaftar");
                }
            }
            case 2 -> input = getNonEmptyStringWithLimit("NAMA : ", 1, 25);
            case 3 -> input = getNonEmptyUniqueWithLimit("Gender L/P : ", 1, 1, "l-p", true);
            case 4 -> input = getNonEmptyStringWithLimit("Alamat : ", 1, 15);
            case 5 -> input = getNonEmptyStringWithLimit("Tanggal lahir : ", 10, 10);
            case 6 -> {
                clearScreen();
                return;
            }
        }
        String userChoose = getNonEmptyUniqueWithLimit("Simpan " + input + " Sebagai perubahan y/t : ", 1, 1, "y-t", true);
        if (userChoose.equalsIgnoreCase("y")) bioMahasiswa[studentIndex][userInput-1] = input;
        clearScreen();
        System.out.println("Berhasil mengedit");
    }
    // view hapus data bio mahasiswa
    public static void removeDataBioMahasiswa() {
        String nim;
        while (true) {
            showDataBioMahasiswa();
            nim = getNonEmptyStringWithLimit("Masukan NIM yang ingin dihapus : ", 10, 10);
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
        System.out.println("Mahasiswa " + nim + " telah berhasil dihapus!");
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
    static String getNonEmptyNumberWithLimit(String prompt, int min, int max) {
        while (true) {
            String userInput = getNonEmptyStringWithLimit(prompt, min, max);
            if (userInput.matches("[0-9]+")) return userInput;
            System.out.println("Masukan hanya boleh angka");
        }
    }
    // String allow gunakan "-" 
    static String getNonEmptyUniqueWithLimit(String prompt, int min, int max, String allow, boolean ignoreCase) {
        while (true) {
            String userInput = getNonEmptyStringWithLimit(prompt, min, max);
            String[] array = allow.split("-");
            for (String string : array) {
                if (ignoreCase && string.equalsIgnoreCase(userInput)) return userInput;
                if (string.equals(userInput)) return userInput;
            }
            System.out.println("Masukan format dengan benar");
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
                System.out.println("Masukan hanya boleh angka");
            }
        }
    }
}