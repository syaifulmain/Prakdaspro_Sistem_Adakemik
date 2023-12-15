import java.util.Scanner;

public class MainApps {
    static Scanner scanner = new Scanner(System.in);
    static String[] role = { "ADMIN", "DOSEN", "MAHASISWA" };
    // ═    ║   ╔   ╚   ╝   ╠   ╣   ╦  ╩	╬   ╗   doksli
    /* Admin */
    static String[][] userAdmin;
    /* Admin */

    /* Dosen */
    static String[][] bioDosen;
    static String[][] userDosen;
    /* Dosen */

    /* Mahasiswa */
    static String[][] bioMahasiswa;
    static String[][] userMahasiswa;
    /* Mahasiswa */

    /* Nilai Matkul */
    static String[][] transkipNilai;

    static String[][] NilaiPancasila;
    static String[][] NilaiKTI;
    static String[][] NilaiCTPS;
    static String[][] NilaiMATDAS;
    static String[][] NilaiBING_1;
    static String[][] NilaiDASPRO;
    static String[][] NilaiPRAK_DASPRO;
    static String[][] NilaiK3;
    static String[] listMatkul = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking And Problem Solving",
            "Matematika Dasar", "Bahasa Inggris 1", "Dasar Pemrograman", "Praktik Dasar Pemrograman",
            "Keselamatan Dan Kesehatan Kerja" };
    /* Nilai Matkul */

    static String[] kumpulanHari = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat" };

    /* JADWAL */
    static String[][] matkulTI;
    static int[] SKS = { 2, 4, 4, 6, 4, 4, 6, 4 };
    static String[][] jadwal_1A;
    static String[][] jadwal_1B;
    static String[][] jadwal_1C;
    static String[][] jadwal_1D;
    static String[][] jadwal_1E;
    /* JADWAL */

    /* Presensi Mahasiswa */
    static String[][] presensiMahasiswa;

    /* Array Lomba */
    static String[][] lomba;
    /* Presensi Mahasiswa */

    /* <--- mengisi data array ---> */

    static void fillPresensi() {
        // NIM, ALPHA, IZIN, SAKIT
        presensiMahasiswa = new String[][] {
                { "1111111111", "0", "0", "0" },
                { "2222222222", "0", "0", "0" },
                { "3333333333", "0", "0", "0" },
                { "4444444444", "0", "0", "0" },
                { "5555555555", "0", "0", "0" },
                { "6666666666", "0", "0", "0" },
        };
    }

    static void fillJadwal() {
        matkulTI = new String[][] {
                { "RTI231001", "PANCASILA", "Pancasila", "2" },
                { "RTI231002", "KTI", "Konsep Teknologi Informasi", "4" },
                { "RTI231003", "CTPS", "Critical Thinking And Problem Solving", "4" },
                { "RTI231004", "MATDAS", "Matematika Dasar", "6" },
                { "RTI231005", "BING_1", "Bahasa Inggris 1", "4" },
                { "RTI231006", "DASPRO", "Dasar Pemrograman", "4" },
                { "RTI231007", "PRAK_DASPRO", "Praktikum Dasar Pemrograman", "6" },
                { "RTI231008", "K3", "Keselamatan dan Kesehatan Kerja", "4" },
        };
        jadwal_1A = new String[][] {
                { "1-RTI231004-3", "6-RTI231007-6", null },
                { "1-RTI231006-4", null, null },
                { "1-RTI231004-3", "5-RTI231003-4", null },
                { "4-RTI231008-4", "8-RTI231002-4", null },
                { "2-RTI231005-4", "9-RTI231001-2", null },
        };
        jadwal_1B = new String[][] {
                { "1-RTI231004-3", "6-RTI231007-6", null },
                { "3-RTI231005-4", null, null },
                { "4-RTI231006-4", "8-RTI231002-4", null },
                { "1-RTI231003-4", "5-RTI231001-2", "8-RTI231008-4" },
                { "1-RTI231004-4", null, null },
        };
        jadwal_1C = new String[][] {
                { "1-RTI231004-3", "6-RTI231001-2", "8-RTI231003-4" },
                { "6-RTI231006-4", null, null },
                { "2-RTI231007-7", "8-RTI231005-4", null },
                { "7-RTI231002-4", null, null },
                { "1-RTI231004-3", "7-RTI231008-4", null },
        };
        jadwal_1D = new String[][] {
                { "2-RTI231005-4", "8-RTI231003-4", null },
                { "1-RTI231001-2", "4-RTI231006-4", "8-RTI231008-4" },
                { "6-RTI231007-6", null, null },
                { "1-RTI231004-3", "7-RTI231002-4", null },
                { "9-RTI231004-3", null, null },
        };
        jadwal_1E = new String[][] {
                { "2-RTI231007-6", "10-RTI231001-2", null },
                { "1-RTI231004-3", "8-RTI231005-4", null },
                { "1-RTI231002-4", "9-RTI231004-3", null },
                { "8-RTI231008-4", null, null },
                { "1-RTI231006-4", "8-RTI231003-4", null },
        };
    }

    // array untuk mengisi nilai matakuliah
    static void FillNilaiMatkul() {
        // kuis,tugas,uts,uas
        transkipNilai = new String[][] {
                { "1111111111", "72.75", "72.75", "84.75", "72.75", "76.5", "75.25", "76.25", "75.25" },
                { "2222222222", "78.25", "78.25", "87.25", "72.75", "78.25", "78.25", "90.25", "78.25" },
                { "3333333333", "76", "76", "74.25", "75", "85", "76", "86.5", "76" },
                { "4444444444", "80.75", "80.75", "77.5", "80.75", "80.75", "80.75", "78", "80.75" },
                { "5555555555", "100.00", "100.00", "100.00", "100.00", "100.00", "100.00", "100.00", "100.00" },
                { "6666666666", "0", "0", "0", "0", "0", "0", "0", "0" }
        };
        NilaiPancasila = new String[][] {
                { "1111111111", "77", "89", "45", "80" },
                { "2222222222", "90", "84", "50", "89" },
                { "3333333333", "80", "83", "54", "87" },
                { "4444444444", "99", "81", "60", "83" },
                { "5555555555", "78", "81", "90", "82" },
                { "6666666666", "0", "0", "0", "0" }
        };
        NilaiKTI = new String[][] {
                { "1111111111", "77", "89", "45", "80" },
                { "2222222222", "90", "84", "50", "89" },
                { "3333333333", "80", "83", "54", "87" },
                { "4444444444", "99", "81", "60", "83" },
                { "5555555555", "78", "81", "90", "82" },
                { "6666666666", "0", "0", "0", "0" }
        };
        NilaiCTPS = new String[][] {
                { "1111111111", "79", "83", "90", "87" },
                { "2222222222", "90", "83", "87", "89" },
                { "3333333333", "80", "89", "45", "83" },
                { "4444444444", "83", "87", "60", "80" },
                { "5555555555", "83", "83", "87", "99" },
                { "6666666666", "0", "0", "0", "0" }
        };
        NilaiMATDAS = new String[][] {
                { "1111111111", "77", "89", "45", "80" },
                { "2222222222", "90", "84", "50", "89" },
                { "3333333333", "80", "83", "54", "87" },
                { "4444444444", "99", "81", "60", "83" },
                { "5555555555", "78", "81", "90", "82" },
                { "6666666666", "0", "0", "0", "0" }
        };
        NilaiBING_1 = new String[][] {
                { "1111111111", "88", "90", "45", "83" },
                { "2222222222", "90", "84", "50", "89" },
                { "3333333333", "80", "83", "90", "87" },
                { "4444444444", "99", "81", "60", "83" },
                { "5555555555", "78", "81", "90", "90" },
                { "6666666666", "0", "0", "0", "0" }
        };
        NilaiPRAK_DASPRO = new String[][] {
                { "2222222222", "90", "84", "50", "89" },
                { "3333333333", "80", "83", "54", "87" },
                { "4444444444", "99", "81", "60", "83" },
                { "5555555555", "78", "81", "90", "82" },
                { "6666666666", "0", "0", "0", "0" }
        };
        NilaiDASPRO = new String[][] {
                { "1111111111", "60", "80", "65", "100" },
                { "2222222222", "83", "89", "100", "89" },
                { "3333333333", "77", "89", "80", "100" },
                { "4444444444", "89", "89", "45", "89" },
                { "5555555555", "77", "89", "45", "44" },
                { "6666666666", "0", "0", "0", "0" }
        };
        NilaiK3 = new String[][] {
                { "1111111111", "87", "89", "45", "80" },
                { "2222222222", "90", "84", "50", "89" },
                { "3333333333", "80", "83", "54", "87" },
                { "4444444444", "99", "81", "60", "83" },
                { "5555555555", "78", "81", "90", "82" },
                { "6666666666", "0", "0", "0", "0" }
        };
    }

    static void fillAdmin() {
        userAdmin = new String[][] {
                { "admin", "admin" }
        };
    }

    static void fillDosen() {
        bioDosen = new String[][] {
                { "1111111111", "Mungki Astiningrum, ST., M.Kom", "P", "JAKARTA", "11-11-1111", "Daspro" },
                { "2222222222", "Noprianto, S.Kom., M.Eng", "L", "BLITAR", "22-22-2222", "Daspro" },
                { "3333333333", "Meyti Eka Apriyani ST., MT.", "P", "BLITAR", "33-33-3333", "Daspro" },
                { "4444444444", "Irsyad Arif Mashudi, M.Kom", "L", "BLITAR", "44-44-4444", "Daspro" },
                { "5555555555", "Yuri Ariyanto, S.Kom., M.Kom", "L", "BLITAR", "55-55-5555", "Dosen" }
        };
        userDosen = new String[][] {
                { "dosen", "dosen" },
                { "dosen2", "dosen2" },
                { "dosen3", "3" },
                { "dosen4", "4" },
                { "dosen5", "5" }
        };
    }

    static void fillMahasiswa() {
        bioMahasiswa = new String[][] {
                { "1111111111", "NOKLENT", "L", "JAKARTA", "11-11-2001", "1A" },
                { "2222222222", "BERYL", "L", "BLITAR", "22-02-2002", "1B" },
                { "3333333333", "SOMEONE", "L", "BLITAR", "03-03-2003", "1C" },
                { "4444444444", "AHOMAD", "L", "BLITAR", "04-04-2004", "1D" },
                { "5555555555", "TMI", "L", "BLITAR", "05-05-2005", "1E" },
                { "6666666666", "RAULLLL", "L", "BOGOR", "16-06-2006", "1E" }
        };
        userMahasiswa = new String[][] {
                { "1111111111", "1111111111" },
                { "2222222222", "2222222222" },
                { "3333333333", "3333333333" },
                { "4444444444", "4444444444" },
                { "5555555555", "5555555555" },
                { "6666666666", "6666666666" }
        };
    }

    static void fillLomba() {
        lomba = new String[][] {
                { "ROAD TO MAIN EVENT DIES NATALIS BK KE-59", "https://www.instagram.com/p/CzioxbgP0LE/?img_index=1" },
                { "ENSPIRIT 5.0 [INTERNATIONAL BUSINESS CASE COMPETITION]",
                        "https://www.instagram.com/p/C0imfHuvPzI/" },
                { "[OPEN REGISTRATION AUDIT CASE CHALLENGE THE 23RD ATV ]", "https://www.instagram.com/p/C0gppzgPkJN/" }
        };
    }

    static void fill() {
        fillJadwal();
        fillAdmin();
        fillDosen();
        fillMahasiswa();
        FillNilaiMatkul();
        fillPresensi();
        fillLomba();
    }
    /* <--- mengisi data array ---> */

    // main function
    public static void main(String[] args) {
        run();
    }

    static void run() {
        fill();
        clearScreen();
        firstLogin();
    }

    // login awal untuk login
    static void firstLogin() {
        while (true) {
            renderTitle("SISTEM AKADEMIK");
            int userInput = pickMenu("Pilih masuk sebagai", role);
            clearScreen();
            switch (userInput) {
                case 1 -> loginRole(role[0]);
                case 2 -> loginRole(role[1]);
                case 3 -> loginRole(role[2]);
            }
        }
    }

    // melakukan login sesuai role
    static void loginRole(String level) {
        int counter = 0;
        while (true) {
            renderTitle("SISTEM AKADEMIK " + level + " JTI");
            String username = getInputStringWithLimit("USERNAME", 1, 10, true);
            String password = getInputStringWithLimit("PASSWORD", 1, 10, false);
            String userLogin;
            clearScreen();
            switch (level) {
                case "ADMIN" -> {
                    userLogin = validasi(userAdmin, username, password);
                    if (userLogin != null) {
                        dashboardAdmin(userLogin);
                        return;
                    }
                }
                case "DOSEN" -> {
                    userLogin = validasi(userDosen, username, password);
                    if (userLogin != null) {
                        dashboardDosen(userLogin);
                        return;
                    }
                }
                case "MAHASISWA" -> {
                    userLogin = validasi(userMahasiswa, username, password);
                    if (userLogin != null) {
                        dashboardMahasiswa(userLogin);
                        return;
                    }
                }
            }
            counter++;
            if (counter == 3) {
                exitForce();
                return;
            }
        }
    }

    // untuk validasi username dan password
    static String validasi(String[][] userArray, String user, String pass) {
        for (int i = 0; i < userArray.length; i++)
            if (user.equals(userArray[i][0]) && pass.equals(userArray[i][1]))
                return userArray[i][0];
        System.out.println("Username dan password salah/tidak ditemukan");
        return null;
    }

    /* DASHBOARD MAHASISWA */
    // menu dashboard mahasiswa
    static void dashboardMahasiswa(String nim) {
        int index = -1;
        String name = "";
        for (int i = 0; i < bioDosen.length; i++) {
            if (userMahasiswa[i][0].equals(nim)) {
                index = i;
                name = bioMahasiswa[index][1];
                break;
            }
        }
        while (true) {
            renderTitle("Selamat Datang " + name);
            System.out.println("=== Dashboard Mahasiswa ===");
            int userInput = pickMenu("Menu : ", new String[] {
                    "Biodata",
                    "Nilai",
                    "Jadwal",
                    "Presesi",
            });
            clearScreen();
            switch (userInput) {
                case 1 -> hadleBiodataMahasiswa(nim);
                case 2 -> hadleNilaiMahasiswa(nim);
                case 3 -> hadleJadwalMahasiswa(nim);
                case 4 -> hadlePresensiMahasiswa();
                case 5 -> {
                    return;
                }
            }
        }
    }

    // menampilkan biodata mahasiswa
    static void hadleBiodataMahasiswa(String nim) {
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

    static void hadleNilaiMahasiswa(String nim) {
        for (int i = 0; i < bioMahasiswa.length; i++) {
            if (nim.equals(bioMahasiswa[i][0])) {
                renderTitle("NILAI AKADEMIK MAHASISWA:");
                showNilaiMahasiswa(i);
            }
        }
    }

    static void hadleJadwalMahasiswa(String nim) {
        for (int i = 0; i < bioMahasiswa.length; i++) {
            if (nim.equals(bioMahasiswa[i][0])) {
                String kelas = bioMahasiswa[i][5];
                System.out.println("\nJADWAL AKADEMIK MAHASISWA: \n");
                switch (kelas) {
                    case "1A" -> tampilkanJadwalBerdasarkanKelas(jadwal_1A);
                    case "1B" -> tampilkanJadwalBerdasarkanKelas(jadwal_1B);
                    case "1C" -> tampilkanJadwalBerdasarkanKelas(jadwal_1C);
                    case "1D" -> tampilkanJadwalBerdasarkanKelas(jadwal_1D);
                    case "1E" -> tampilkanJadwalBerdasarkanKelas(jadwal_1E);
                    default -> System.out.println("Jadwal untuk kelas " + kelas + " tidak ditemukan.");
                }
                break;
            }
        }
    }

    static void hadlePresensiMahasiswa() {

    }
    /* DASHBOARD MAHASISWA */

    /* DASHBOARD DOSEN */

    // menu dashboard dosen
    static void dashboardDosen(String user) {
        int index = -1;
        String name = "";
        while (true) {
            for (int i = 0; i < bioDosen.length; i++) {
                if (userDosen[i][0].equals(user)) {
                    index = i;
                    name = bioDosen[index][1];
                    break;
                }
            }
            renderTitle("Dashboard " + name);
            int userInput = pickMenu("Menu : ", new String[] {
                    "Penilaian Mahasiswa",
                    "Presensi Mahasiswa",
                    "Cek Jadwal",
                    "Logout",
            });
            clearScreen();
            switch (userInput) {
                case 1 -> penilaianMahasiswa();
                case 4 -> {
                    return;
                }
            }
        }
    }

    // meilih menu penilaian mahasiswa
    static void penilaianMahasiswa() {
        while (true) {
            renderTitle("Penilaian Mahasiswa");
            int userInput = pickMenu("Menu : ", new String[] {
                    "Tambah Nilai",
                    "Edit Nilai",
                    "Check Nilai",
                    "Kembali",
            });
            clearScreen();
            switch (userInput) {
                case 1 -> tambahNilai();
                case 2 -> editNilai();
                case 3 -> checkNilai();
                case 4 -> {
                    return;
                }
            }
        }
    }

    // memilih matakuliah untuk menambahkan nilai
    static void tambahNilai() {
        while (true) {
            renderTitle("Tambah Nilai");
            int userInput = pickMenu("Menu : ", new String[] {
                    "Pancasila",
                    "KTI",
                    "CTPS",
                    "MATDAS",
                    "BING_1",
                    "DASPRO",
                    "PRAK_DASPRO",
                    "K3",
                    "Kembali"
            });
            clearScreen();
            switch (userInput) {
                case 1 -> tambahNilaiMatkul(NilaiPancasila, "Pancasila");
                case 2 -> tambahNilaiMatkul(NilaiKTI, "KTI");
                case 3 -> tambahNilaiMatkul(NilaiCTPS, "CTPS");
                case 4 -> tambahNilaiMatkul(NilaiMATDAS, "MATDAS");
                case 5 -> tambahNilaiMatkul(NilaiBING_1, "BING_1");
                case 6 -> tambahNilaiMatkul(NilaiDASPRO, "DASPRO");
                case 7 -> tambahNilaiMatkul(NilaiPRAK_DASPRO, "PRAK_DASPRO");
                case 8 -> tambahNilaiMatkul(NilaiK3, "K3");
                case 9 -> {
                    clearScreen();
                    return;
                }
            }
        }
    }

    static void showNilai(String[][] Array, String matkul) {
        renderTitle(matkul);
        String firstLine   = "╔═════╦════════════╦═══════════════════════════╦═══════╦═══════╦═══════╦═══════╗";
        String middleLine  = "╠═════╬════════════╬═══════════════════════════╬═══════╬═══════╬═══════╬═══════╣";
        String lastLine    = "╚═════╩════════════╩═══════════════════════════╩═══════╩═══════╩═══════╩═══════╝";
        String formatTable = "║ %-3s ║ %-10s ║ %-25s ║  %-3s  ║  %-3s  ║  %-3s  ║  %-3s  ║%n";
        System.out.println(firstLine);
        System.out.println("║ NO  ║ NIM        ║ NAMA                      ║ Kuis  ║ Tugas ║  UTS  ║  UAS  ║");
        System.out.println(middleLine);
        for (int i = 0; i < Array.length; i++) {
            String[] takeNilai = Array[i];
            System.out.printf(formatTable, i + 1, takeNilai[0], bioMahasiswa[i][1], takeNilai[1], takeNilai[2],
                    takeNilai[3], takeNilai[4]);
        }
        System.out.println(lastLine);
    }

    // interface menambahkan nilai
    static void tambahNilaiMatkul(String[][] Array, String matkul) {
        while (true) {
            showNilai(Array, "Tambah Nilai " + matkul);
            String nim = getInputStringWithLimit("Masukan NIM", 10, 10, true);
            if (!has(bioMahasiswa, nim, 0)) {
                System.out.println("NIM " + nim + " tidak ditemukan");
                return;
            } else if (nim.equals(null))
                return;
            String kuis = getInputStringNumberwithLimit("Kuis", 0, 100, false);
            String tugas = getInputStringNumberwithLimit("Tugas", 0, 100, false);
            String uts = getInputStringNumberwithLimit("UTS", 0, 100, false);
            String uas = getInputStringNumberwithLimit("UAS", 0, 100, false);
            String userChoose = getInputUniqueWord("Tambahkan data? y/t", 1, 1, true, "y", "t");
            clearScreen();
            if (userChoose.equalsIgnoreCase("y")) {
                addNilai(Array, nim, kuis, tugas, uts, uas, matkul);
            } else
                System.out.println("Dibatalkan");
            return;
        }
    }

    // fungsi menambahkan nilai tersambung ke transkip nilai
    static void addNilai(String[][] Array, String nim, String kuis, String tugas, String uts, String uas,
            String matkul) {
        int studentIndex = -1;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i][0].equals(nim)) {
                studentIndex = i;
                break;
            }
        }
        String[][] nilaiBaru = new String[Array.length][4];
        nilaiBaru[studentIndex] = new String[] { nim, kuis, tugas, uts, uas };
        double kuis1 = Double.parseDouble(kuis);
        double tugas1 = Double.parseDouble(tugas);
        double uts1 = Double.parseDouble(uts);
        double uas1 = Double.parseDouble(uas);
        if (matkul.equals("Pancasila")) {
            NilaiPancasila[studentIndex] = nilaiBaru[studentIndex];
            transkipNilai[studentIndex][1] = String
                    .valueOf((kuis1 * 0.25) + (tugas1 * 0.25) + (uts1 * 0.25) + (uas1 * 0.25));
        } else if (matkul.equals("KTI")) {
            NilaiKTI[studentIndex] = nilaiBaru[studentIndex];
            transkipNilai[studentIndex][2] = String
                    .valueOf((kuis1 * 0.2) + (tugas1 * 0.3) + (uts1 * 0.2) + (uas1 * 0.3));
        } else if (matkul.equals("CTPS")) {
            NilaiCTPS[studentIndex] = nilaiBaru[studentIndex];
            transkipNilai[studentIndex][3] = String
                    .valueOf((kuis1 * 0.3) + (tugas1 * 0.3) + (uts1 * 0.1) + (uas1 * 0.3));
        } else if (matkul.equals("MATDAS")) {
            NilaiMATDAS[studentIndex] = nilaiBaru[studentIndex];
            transkipNilai[studentIndex][4] = String
                    .valueOf((kuis1 * 0.1) + (tugas1 * 0.3) + (uts1 * 0.2) + (uas1 * 0.4));
        } else if (matkul.equals("BING_1")) {
            NilaiBING_1[studentIndex] = nilaiBaru[studentIndex];
            transkipNilai[studentIndex][5] = String
                    .valueOf((kuis1 * 0.2) + (tugas1 * 0.2) + (uts1 * 0.3) + (uas1 * 0.3));
        } else if (matkul.equals("DASPRO")) {
            NilaiDASPRO[studentIndex] = nilaiBaru[studentIndex];
            transkipNilai[studentIndex][6] = String
                    .valueOf((kuis1 * 0.2) + (tugas1 * 0.2) + (uts1 * 0.3) + (uas1 * 0.3));
        } else if (matkul.equals("PRAK_DASPRO")) {
            NilaiPRAK_DASPRO[studentIndex] = nilaiBaru[studentIndex];
            transkipNilai[studentIndex][7] = String
                    .valueOf((kuis1 * 0.1) + (tugas1 * 0.4) + (uts1 * 0.25) + (uas1 * 0.25));
        } else if (matkul.equals("K3")) {
            NilaiK3[studentIndex] = nilaiBaru[studentIndex];
            transkipNilai[studentIndex][8] = String
                    .valueOf((kuis1 * 0.2) + (tugas1 * 0.2) + (uts1 * 0.3) + (uas1 * 0.3));
        }
        System.out.println("Berhasil menambahkan nilai " + matkul);
    }

    // Edit Nilai
    static void editNilai() {
        while (true) {
            renderTitle("Edit Nilai");
            int userInput = pickMenu("Menu : ", new String[] {
                    "Pancasila",
                    "KTI",
                    "CTPS",
                    "MATDAS",
                    "BING_1",
                    "DASPRO",
                    "PRAK_DASPRO",
                    "K3",
                    "Kembali"
            });
            clearScreen();
            switch (userInput) {
                case 1 -> editNilaiMatkul(NilaiPancasila, "Pancasila");
                case 2 -> editNilaiMatkul(NilaiKTI, "KTI");
                case 3 -> editNilaiMatkul(NilaiCTPS, "CTPS");
                case 4 -> editNilaiMatkul(NilaiMATDAS, "MATDAS");
                case 5 -> editNilaiMatkul(NilaiBING_1, "BING_1");
                case 6 -> editNilaiMatkul(NilaiDASPRO, "DASPRO");
                case 7 -> editNilaiMatkul(NilaiPRAK_DASPRO, "PRAK_DASPRO");
                case 8 -> editNilaiMatkul(NilaiK3, "K3");
                case 9 -> {
                    return;
                }
            }
        }
    }

    // Edit Nilai mata kuliah tersambung ke transkip nilai
    static void editNilaiMatkul(String[][] Array, String matkul) {
        String ubah = "";
        showNilai(Array, "Edit Nilai " + matkul);
        String nim = getInputStringWithLimit("Masukan NIM", 10, 10, true);
        if (!has(bioMahasiswa, nim, 0)) {
            System.out.println("NIM " + nim + " tidak ditemukan");
            return;
        } else if (nim.equals(null))
            return;
        int studentIndex = -1;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i][0].equals(nim)) {
                studentIndex = i;
                break;
            }
        }
        int userInput = pickMenu("Pilih Nilai", new String[] {
                "Kuis",
                "Tugas",
                "UTS",
                "UAS",
                "Kembali"
        });
        switch (userInput) {
            case 1 -> ubah = getInputStringNumberwithLimit("Ganti Nilai Kuis", 0, 100, false);
            case 2 -> ubah = getInputStringNumberwithLimit("Ganti Nilai Tugas", 0, 100, false);
            case 3 -> ubah = getInputStringNumberwithLimit("Ganti Nilai UTS", 0, 100, false);
            case 4 -> ubah = getInputStringNumberwithLimit("Ganti Nilai UAS", 0, 100, false);
            case 5 -> {
                clearScreen();
                return;
            }
        }
        String userChoose = getInputUniqueWord("Ubah data? y/t", 1, 1, true, "y", "t");
        clearScreen();
        if (userChoose.equalsIgnoreCase("y")) {
            int temp = Integer.parseInt(ubah);
            switch (matkul) {
                case "Pancasila" ->
                    addTranskip(NilaiPancasila, userInput, temp, studentIndex, 1, 0.25, 0.25, 0.25, 0.25);
                case "KTI" -> addTranskip(NilaiKTI, userInput, temp, studentIndex, 2, 0.2, 0.3, 0.2, 0.3);
                case "CTPS" -> addTranskip(NilaiCTPS, userInput, temp, studentIndex, 3, 0.3, 0.3, 0.1, 0.3);
                case "MATDAS" -> addTranskip(NilaiMATDAS, userInput, temp, studentIndex, 4, 0.1, 0.3, 0.2, 0.4);
                case "BING_1" -> addTranskip(NilaiBING_1, userInput, temp, studentIndex, 5, 0.2, 0.2, 0.3, 0.3);
                case "DASPRO" -> addTranskip(NilaiDASPRO, userInput, temp, studentIndex, 6, 0.2, 0.2, 0.3, 0.3);
                case "PRAK_DASPRO" ->
                    addTranskip(NilaiPRAK_DASPRO, userInput, temp, studentIndex, 7, 0.1, 0.4, 0.25, 0.25);
                case "K3" -> addTranskip(NilaiK3, userInput, temp, studentIndex, 8, 0.2, 0.2, 0.3, 0.3);
            }
            System.out.println("Berhasil mengubah nilai " + matkul);
            return;
        }
        System.out.println("Dibatalkan");
    }

    static void addTranskip(String Array[][], int userInput, int temp, int studentIndex, int indexMatkul,
            double bobot1, double bobot2, double bobot3, double bobot4) {
        double kuis = Double.parseDouble(Array[studentIndex][1]);
        double tugas = Double.parseDouble(Array[studentIndex][2]);
        double uts = Double.parseDouble(Array[studentIndex][3]);
        double uas = Double.parseDouble(Array[studentIndex][4]);
        Array[studentIndex][userInput] = String.valueOf(temp);
        // transkipNilai[studentIndex][indexMatkul] = (userInput!=1) ? (userInput!=2) ? (userInput!=3) ? (userInput!=4) ? "" : String.valueOf((kuis * bobot1) + (tugas * bobot2) + (uts * bobot3) + (temp * bobot4)) : String.valueOf((kuis * bobot1) + (tugas * bobot2) + (temp * bobot3) + (uas * bobot4)) : String.valueOf((kuis * bobot1) + (temp * bobot2) + (uts * bobot3) + (uas * bobot4)) : String.valueOf((temp * bobot1) + (tugas * bobot2) + (uts * bobot3) + (uas * bobot4));
        switch (userInput) {
            case 1 -> transkipNilai[studentIndex][indexMatkul] = String
                    .valueOf((temp * bobot1) + (tugas * bobot2) + (uts * bobot3) + (uas * bobot4));
            case 2 -> transkipNilai[studentIndex][indexMatkul] = String
                    .valueOf((kuis * bobot1) + (temp * bobot2) + (uts * bobot3) + (uas * bobot4));
            case 3 -> transkipNilai[studentIndex][indexMatkul] = String
                    .valueOf((kuis * bobot1) + (tugas * bobot2) + (temp * bobot3) + (uas * bobot4));
            case 4 -> transkipNilai[studentIndex][indexMatkul] = String
                    .valueOf((kuis * bobot1) + (tugas * bobot2) + (uts * bobot3) + (temp * bobot4));
        }
    }

    // fitur check nilai
    static void checkNilai() {
        int studentIndex = -1;
        renderTitle("Check Nilai");
        showNilai(NilaiPancasila, "Pancasila");
        showNilai(NilaiKTI, "Konsep Teknologi Informasi");
        showNilai(NilaiCTPS, "Critical Thinking dan Problem Solving");
        showNilai(NilaiMATDAS, "Matekmatika Dasar");
        showNilai(NilaiBING_1, "Bahasa Inggris 1");
        showNilai(NilaiDASPRO, "Dasar Pemrograman");
        showNilai(NilaiPRAK_DASPRO, "Praktikum Dasar Pemrograman");
        showNilai(NilaiK3, "Keselamatan dan Kesehatan Kerja");
        String userChoose = getInputUniqueWord("Cari Nilai Seorang Mahasiswa ? y/t", 1, 1, true, "y", "t");
        if (userChoose.equalsIgnoreCase("y")) {
            clearScreen();
            String nim = getInputStringWithLimit("Masukan NIM", 10, 10, true);
            if (!has(bioMahasiswa, nim, 0)) {
                System.out.println("NIM " + nim + " tidak ditemukan");
                return;
            } else if (nim.equals(null)) {
                return;
            } else
                for (int i = 0; i < bioMahasiswa.length; i++) {
                    if (bioMahasiswa[i][0].equals(nim)) {
                        studentIndex = i;
                        break;
                    }
                }
            clearScreen();
            renderTitle("Check Nilai Mahasiswa dengan NIM: " + nim);
            showNilaiMahasiswa(studentIndex);
        } else
            System.out.println("Dibatalkan");
    }

    // Menampilkan nilai mahasiswa per orang
    static void showNilaiMahasiswa(int studentIndex) {
        renderTitle("List Nilai " + bioMahasiswa[studentIndex][1]);
        String firstLine   = "╔═════╦═══════════════════════════════════════════════════╦═══════╦═══════╦═══════╦═══════╗";
        String middleLine  = "╠═════╬═══════════════════════════════════════════════════╬═══════╬═══════╬═══════╬═══════╣";
        String lastLine    = "╚═════╩═══════════════════════════════════════════════════╩═══════╩═══════╩═══════╩═══════╝";
        String formatTable = "║ %-3s ║%-50s ║  %-3s  ║  %-3s  ║  %-3s  ║  %-3s  ║%n";
        System.out.println(firstLine);
        System.out
                .println("║ NO  ║Mata Kuliah                                        ║ Kuis  ║ Tugas ║  UTS  ║  UAS  ║");
        System.out.println(middleLine);
        for (int i = 0; i < 8; i++) {
            String[] takeNilai = NilaiPancasila[studentIndex];
            switch (i) {
                case 0 -> takeNilai = NilaiPancasila[studentIndex];
                case 1 -> takeNilai = NilaiKTI[studentIndex];
                case 2 -> takeNilai = NilaiCTPS[studentIndex];
                case 3 -> takeNilai = NilaiMATDAS[studentIndex];
                case 4 -> takeNilai = NilaiBING_1[studentIndex];
                case 5 -> takeNilai = NilaiDASPRO[studentIndex];
                case 6 -> takeNilai = NilaiPRAK_DASPRO[studentIndex];
                case 7 -> takeNilai = NilaiK3[studentIndex];
            }
            System.out.printf(formatTable, i + 1, listMatkul[i], takeNilai[1], takeNilai[2], takeNilai[3],
                    takeNilai[4]);
        }
        System.out.println(lastLine);
        return;
    }

    /* <--- DASHBOARD ADMIN ---> */
    // menu dashboard admin
    static void dashboardAdmin(String user) {
        while (true) {
            renderTitle("Dashboard " + user);
            int userInput = pickMenu("Menu : ", new String[] {
                    "Modul Mahasiswa",
                    "Modul Dosen",
                    "Modul Kursus",
                    "Logout",
            });
            clearScreen();
            switch (userInput) {
                case 1 -> modulMahasiswa();
                case 2 -> modulDosen();
                case 3 -> modulKursus();
                case 4 -> {
                    return;
                }
            }
        }
    }

    /* <--- modulMahasiswa ---> */
    static void modulMahasiswa() {
        while (true) {
            System.out.println("Siakad / Modul Mahasiswa");
            renderTitle("Modul Mahasiswa");
            int userInput = pickMenu("Menu : ", new String[] {
                    "List Mahasiswa",
                    "Transkip Nilai",
                    "Presensi Mahasiswa",
                    "Cek User",
                    "Kembali",
            });
            clearScreen();
            switch (userInput) {
                case 1 -> handleListMahasiswa();
                case 2 -> transkipNilai();
                case 3 -> presensiMahasiswa();
                case 4 -> cekUserMahasiswa();
                case 5 -> {
                    return;
                }
            }
        }
    }

    // view data bio mahasiswa
    static void handleListMahasiswa() {
        while (true) {
            System.out.println("Siakad / Data Mahasiswa / List Mahasiswa");
            showDataBioMahasiswa(false);
            int userInput = pickMenu("Menu : ", new String[] {
                    "Daftarkan Mahasiswa Baru",
                    "Edit Data Mahasiswa",
                    "Hapus Data Mahasiswa",
                    "Kembali"
            });
            clearScreen();
            switch (userInput) {
                case 1 -> addDataBioMahasiswa();
                case 2 -> editDataBioMahasiswa();
                case 3 -> removeDataBioMahasiswa();
                case 4 -> {
                    return;
                }
            }
        }
    }

    // menampilkan table data bio mahasiswa masukan parameter true dan nim untuk
    // menampilkan data berdasarkan nim
    static void showDataBioMahasiswa(boolean isNIM, String... nim) {
        String firstLine   = "╔═════╦════════════╦═══════════════════════════╦═══════════════╦═════════════════╦═══════════════╦═══════╗";
        String middleLine  = "╠═════╬════════════╬═══════════════════════════╬═══════════════╬═════════════════╬═══════════════╬═══════╣";
        String lastLine    = "╚═════╩════════════╩═══════════════════════════╩═══════════════╩═════════════════╩═══════════════╩═══════╝";
        String formatTable = "║ %-3s ║ %-10s ║ %-25s ║       %-7s ║ %-15s ║ %-13s ║   %-3s ║%n";
        System.out.println(firstLine);
        System.out.format(
                "║ NO  ║ NIM        ║ NAMA                      ║ Jenis Kelamin ║ Alamat          ║ Tanggal Lahir ║ Kelas ║%n");
        System.out.println(middleLine);
        for (int i = 0; i < bioMahasiswa.length; i++) {
            String[] takeBio = bioMahasiswa[i];
            if (isNIM && nim[0].equals(takeBio[0])) {
                System.out.printf(formatTable, (i + 1), takeBio[0], takeBio[1], takeBio[2], takeBio[3], takeBio[4],
                        takeBio[5]);
                break;
            }
            if (!isNIM)
                System.out.printf(formatTable, (i + 1), takeBio[0], takeBio[1], takeBio[2], takeBio[3], takeBio[4],
                        takeBio[5]);
        }
        System.out.println(lastLine);
    }

    // add data bio mahasiswa
    static void addDataBioMahasiswa() {
        String nim = getInputStringNumberwithLimitChar("NIM", 10, 10, false);
        if (has(bioMahasiswa, nim, 0)) {
            System.out.println("NIM " + nim + " sudah terdaftar");
            return;
        }
        String nama = getInputStringWithLimit("NAMA", 1, 25, false);
        String jenisKelamin = getInputUniqueWord("Gender L/P", 1, 1, true, "l", "p");
        String alamat = getInputStringWithLimit("Alamat", 1, 15, false);
        String tanggalLahir = getInputStringWithLimit("Tanggal lahir", 10, 10, false);
        String userChoose = getInputUniqueWord("Tambahkan data? y/t", 1, 1, true, "y", "t");
        clearScreen();
        if (userChoose.equalsIgnoreCase("y"))
            addDataBioMahasiswa(nim, nama.toUpperCase(), jenisKelamin.toUpperCase(), alamat, tanggalLahir, "N");
        else
            System.out.println("Dibatalkan");
    }

    // add data bio mahasiswa
    static void addDataBioMahasiswa(String... dataBio) {
        String[][] mahasiswaBaru = new String[bioMahasiswa.length + 1][6];
        for (int i = 0; i < bioMahasiswa.length; i++)
            mahasiswaBaru[i] = bioMahasiswa[i];
        mahasiswaBaru[mahasiswaBaru.length - 1] = dataBio;
        bioMahasiswa = mahasiswaBaru;
        System.out.println("Mahasiswa telah berhasil ditambahkan");
        // add user mahasiswa
        String[][] userBaru = new String[userMahasiswa.length + 1][2];
        for (int i = 0; i < userMahasiswa.length; i++)
            userBaru[i] = userMahasiswa[i];
        userBaru[userBaru.length - 1] = new String[] { dataBio[0], dataBio[0] };
        userMahasiswa = userBaru;
        // instansisasi nilai,transkip,presensi mahasiswa
        addDataNilaiMahasiswa(dataBio[0]);
    }

    // add data nilai mahasiswa
    static void addDataNilaiMahasiswa(String nim) {
        // instasiasi nilai matkul
        NilaiPancasila = addDataNilaiMahasiswa(nim, NilaiPancasila);
        NilaiKTI = addDataNilaiMahasiswa(nim, NilaiKTI);
        NilaiCTPS = addDataNilaiMahasiswa(nim, NilaiCTPS);
        NilaiMATDAS = addDataNilaiMahasiswa(nim, NilaiMATDAS);
        NilaiBING_1 = addDataNilaiMahasiswa(nim, NilaiBING_1);
        NilaiDASPRO = addDataNilaiMahasiswa(nim, NilaiDASPRO);
        NilaiPRAK_DASPRO = addDataNilaiMahasiswa(nim, NilaiPRAK_DASPRO);
        NilaiK3 = addDataNilaiMahasiswa(nim, NilaiK3);
        // instasiasi nilai transkip
        transkipNilai = addDataNilaiMahasiswa(nim, transkipNilai);
        // instasi nilai presensi
        presensiMahasiswa = addDataNilaiMahasiswa(nim, presensiMahasiswa);
    }

    // add data nilai mahasiswa
    static String[][] addDataNilaiMahasiswa(String nim, String[][] arrayNilai) {
        String[][] tempArrayNilai = new String[arrayNilai.length + 1][arrayNilai[0].length];
        for (int i = 0; i < tempArrayNilai[0].length; i++)
            tempArrayNilai[tempArrayNilai.length - 1][i] = (i == 0) ? nim : "0";
        for (int i = 0; i < arrayNilai.length; i++)
            tempArrayNilai[i] = arrayNilai[i];
        return tempArrayNilai;
    }

    // edit data bio mahasiswa
    static void editDataBioMahasiswa() {
        String oldNim, input = "";
        int studentIndex = -1;
        while (true) {
            showDataBioMahasiswa(false);
            oldNim = getInputStringWithLimit("Masukan NIM yang ingin diubah", 10, 10, false);
            if (has(bioMahasiswa, oldNim, 0))
                break;
            clearScreen();
            System.out.println("NIM tidak ditemukan");
        }
        for (int i = 0; i < bioMahasiswa.length; i++) {
            if (bioMahasiswa[i][0].equals(oldNim)) {
                studentIndex = i;
                break;
            }
        }
        clearScreen();
        showDataBioMahasiswa(true, oldNim);
        int userInput = pickMenu("Ubah data", new String[] {
                // "NIM",
                "Nama",
                "Jenis Kelamin",
                "Alamat",
                "Tanggal Lahir",
                "Batal"
        });
        switch (userInput) {
            case 1 -> input = getInputStringWithLimit("NAMA", 1, 25, false);
            case 2 -> input = getInputUniqueWord("Gender L/P", 1, 1, true, "l", "p");
            case 3 -> input = getInputStringWithLimit("Alamat", 1, 15, false);
            case 4 -> input = getInputStringWithLimit("Tanggal lahir(DD/MM/YYYY)", 10, 10, false);
            case 5 -> {
                clearScreen();
                return;
            }
        }
        String userChoose = getInputUniqueWord("Simpan " + input + " Sebagai perubahan y/t", 1, 1, true, "y", "t");
        clearScreen();
        if (userChoose.equalsIgnoreCase("y")) {
            bioMahasiswa[studentIndex][userInput] = input;
            System.out.println("Berhasil mengedit");
        } else {
            System.out.println("Dibatalkan");
        }
    }

    // remove data bio mahasiswa
    static void removeDataBioMahasiswa() {
        String nim;
        while (true) {
            showDataBioMahasiswa(false);
            nim = getInputStringWithLimit("Masukan NIM yang ingin dihapus : ", 10, 10, false);
            if (has(bioMahasiswa, nim, 0))
                break;
            clearScreen();
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ada!");
        }
        bioMahasiswa = removeDataBioMahasiswa(bioMahasiswa, nim);
        userMahasiswa = removeDataBioMahasiswa(userMahasiswa, nim);
        NilaiPancasila = removeDataBioMahasiswa(NilaiPancasila, nim);
        NilaiKTI = removeDataBioMahasiswa(NilaiKTI, nim);
        NilaiCTPS = removeDataBioMahasiswa(NilaiCTPS, nim);
        NilaiMATDAS = removeDataBioMahasiswa(NilaiMATDAS, nim);
        NilaiBING_1 = removeDataBioMahasiswa(NilaiBING_1, nim);
        NilaiDASPRO = removeDataBioMahasiswa(NilaiDASPRO, nim);
        NilaiPRAK_DASPRO = removeDataBioMahasiswa(NilaiPRAK_DASPRO, nim);
        NilaiK3 = removeDataBioMahasiswa(NilaiK3, nim);
        transkipNilai = removeDataBioMahasiswa(transkipNilai, nim);
        presensiMahasiswa = removeDataBioMahasiswa(presensiMahasiswa, nim);
        clearScreen();
        System.out.println("Mahasiswa " + nim + " telah berhasil dihapus!");
    }

    // remove semua data bio mahasiswa
    static String[][] removeDataBioMahasiswa(String[][] array, String nim) {
        String[][] tempArray = new String[array.length - 1][array[0].length];
        int count = 0;
        for (String[] siswa : array) {
            if (siswa[0].equals(nim))
                continue;
            tempArray[count] = siswa;
            count++;
        }
        return tempArray;
    }

    // transkip nilai
    static void transkipNilai() {
        System.out.println("Siakad / Modul Mahasiswa / Transkip Nilai");
        renderTitle("Transkip Nilai");
        tampilkanTranskipNilai();
        int userInput = pickMenu("Menu : ", new String[] {
                "Kembali",
        });
        clearScreen();
    }

    static void tampilkanTranskipNilai() {
        String firstLine   = "╔═════╦════════════╦═══════════════════════════╦═══════"  + "╦════════════".repeat(9)+"╗";
        String middleLine  = "╠═════╬════════════╬═══════════════════════════╬═══════"  + "╬════════════".repeat(9)+"╣";
        String lastLine    = "╚═════╩════════════╩═══════════════════════════╩═══════"  + "╩════════════".repeat(9)+"╝";
        String formatTable = "║ %-3s ║ %-10s ║ %-25s ║  %-3s  ║  %-9s ║  %-9s ║  %-9s ║  %-9s ║  %-9s ║  %-9s ║  %-9s ║  %-9s ║  %-9s ║%n";
        System.out.println(firstLine);
        System.out.format(
                "║ NO  ║ NIM        ║ NAMA                      ║ Kelas ║  PANCASILA ║     KTI    ║    CTPS    ║     MAT    ║    BING    ║    DASP    ║   PRAK_DAS ║     K3     ║  Rata-rata ║%n");
        System.out.println(middleLine);
        for (int i = 0; i < transkipNilai.length; i++) {
            String[] takeTranskip = transkipNilai[i];
            System.out.printf(formatTable, (i + 1), takeTranskip[0], bioMahasiswa[i][1], bioMahasiswa[i][5],
                    takeTranskip[1], takeTranskip[2], takeTranskip[3], takeTranskip[4], takeTranskip[5],
                    takeTranskip[6], takeTranskip[7], takeTranskip[8], rataRataNilai(i));
        }
        System.out.println(lastLine);
    }

    static String rataRataNilai(int index) {
        float total = 0;
        for (int i = 1; i < transkipNilai[index].length; i++) {
            total += Float.parseFloat(transkipNilai[index][i]);
        }
        return String.format("%.2f", total / 8);
    }

    static void cekUserMahasiswa() {
        System.out.println("Siakad / Modul Mahasiswa / Cek User");
        renderTitle("Cek User");
        tampilkanDataUser();
        int userInput = pickMenu("Menu : ", new String[] {
                "Kembali",
        });
        clearScreen();
    }

    static void tampilkanDataUser() {
        String firstLine   = "╔═════╦════════════╦═══════════════════════════╦════════════╦═════════════════╗";
        String middleLine  = "╠═════╬════════════╬═══════════════════════════╬════════════╬═════════════════╣";
        String lastLine    = "╚═════╩════════════╩═══════════════════════════╩════════════╩═════════════════╝";
        String formatTable = "║ %-3s ║ %-10s ║ %-25s ║ %-10s ║ %-15s ║%n";
        System.out.println(firstLine);
        System.out.format(
                "║ NO  ║ NIM        ║ NAMA                      ║ USER       ║ PASSWORD        ║%n");
        System.out.println(middleLine);
        for (int i = 0; i < bioMahasiswa.length; i++) {
            String[] takeBio = bioMahasiswa[i];
            String[] takeUser = userMahasiswa[i];
            System.out.printf(formatTable, (i + 1), takeBio[0], takeBio[1], takeUser[0], takeUser[1]);
        }
        System.out.println(lastLine);
    }

    static void presensiMahasiswa() {
        System.out.println("Siakad / Modul Mahasiswa / Presensi Mahasiswa");
        renderTitle("Presensi Mahasiswa");
        tampilkanPresensiMahasiswa();
        int userInput = pickMenu("Menu : ", new String[] {
                "Kembali",
        });
        clearScreen();
    }

    static void tampilkanPresensiMahasiswa() {
        String firstLine   = "╔═════╦════════════╦═══════════════════════════╦═════╦═════╦═════╗";
        String middleLine  = "╠═════╬════════════╬═══════════════════════════╬═════╬═════╬═════╣";
        String lastLine    = "╚═════╩════════════╩═══════════════════════════╩═════╩═════╩═════╝";
        String formatTable = "║ %-3s ║ %-10s ║ %-25s ║ %-2s  ║ %-2s  ║ %-2s  ║%n";
        String horizonLine = "+-----+------------+---------------------------+-----+-----+-----+";
        System.out.println(firstLine);
        System.out.format("║ NO  ║ NIM        ║ NAMA                      ║  A  ║  I  ║  S  ║%n");
        System.out.println(middleLine);
        for (int i = 0; i < presensiMahasiswa.length; i++) {
            String[] takePresensi = presensiMahasiswa[i];
            System.out.printf(formatTable, (i + 1), takePresensi[0], bioMahasiswa[i][1], takePresensi[1],
                    takePresensi[2], takePresensi[3]);
        }
        System.out.println(lastLine);
    }

    /* <--- modulMahasiswa ---> */

    /* <--- modulDosen ---> */
    static void modulDosen() {

    }
    /* <--- modulDosen ---> */

    /* <--- modulKursus ---> */
    static void modulKursus() {
        while (true) {
            System.out.println("Siakad / Modul Kursus");
            renderTitle("Modul Kursus");
            int userInput = pickMenu("Menu : ", new String[] {
                    "Penempatan Kelas Mahasiswa",
                    "Penjadwalan",
                    "Info Lomba",
                    "Kembali"
            });
            clearScreen();
            switch (userInput) {
                case 1 -> penempatanKelasMahasiswa();
                case 2 -> penjadwalan();
                case 3 -> infoLomba();
                case 4 -> {
                    return;
                }
            }
        }
    }

    // meanmpilkan table data nim,nama,kelas mahasiswa
    static void tampilkanMahasiswaBerdasarkanKelas(String kelas) {
        String formatTable = "║ %-3s ║ %-10s ║ %-25s ║   %-3s ║%n";
        String firstLine   = "╔═════╦════════════╦═══════════════════════════╦═══════╗";
        String middleLine  = "╠═════╬════════════╬═══════════════════════════╬═══════╣";
        String lastLine    = "╚═════╩════════════╩═══════════════════════════╩═══════╝";
        System.out.println(firstLine);
        System.out.format("║ NO  ║ NIM        ║ NAMA                      ║ Kelas ║%n");
        System.out.println(middleLine);
        for (int i = 0; i < bioMahasiswa.length; i++) {
            String[] takeBio = bioMahasiswa[i];
            if (takeBio[5].matches(kelas))
                System.out.printf(formatTable, (i + 1), takeBio[0], takeBio[1], takeBio[5]);
        }
        System.out.println(lastLine);
    }

    // Penempatan kelas
    static void penempatanKelasMahasiswa() {
        final String kelas = "1A|1B|1C|1D|1E|";
        while (true) {
            System.out.println("Siakad / Modul Kursus / Penempatan Kelas Mahasiswa");
            tampilkanMahasiswaBerdasarkanKelas(kelas);
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
                    return;
                }
            }
        }
    }

    // melakukan sortir berdasarkan kelas
    static void sortirBerdasarkanKelas() {
        while (true) {
            System.out.println("1A|1B|1C|1D|1E|");
            String kelas = getInputUniqueWord("Masukan Kelas", 2, 2, true, "1A", "1B", "1C", "1D", "1E");
            tampilkanMahasiswaBerdasarkanKelas(kelas);
            int userInput = pickMenu("Menu : ", new String[] {
                    "Atur Kelas",
                    "Kembali"
            });
            clearScreen();
            switch (userInput) {
                case 1 -> aturKelasMahasiswa(kelas);
                case 2 -> {
                    return;
                }
            }
        }
    }

    // atur kelas mahasiswa
    static void aturKelasMahasiswa(String kelas) {
        String nim;
        int studentIndex = -1;
        while (true) {
            tampilkanMahasiswaBerdasarkanKelas(kelas);
            nim = getInputStringWithLimit("Masukan NIM", 10, 10, false);
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
        String input = getInputUniqueWord("Atur kelas", 2, 2, true, "1A", "1B", "1C", "1D", "1E");
        String userChoose = getInputUniqueWord("Simpan perubahan y/t", 1, 1, true, "y", "t");
        clearScreen();
        if (userChoose.equalsIgnoreCase("y")) {
            bioMahasiswa[studentIndex][5] = input;
            System.out.println("Berhasil mengedit");
        } else
            System.out.println("Dibatalkan");
    }

    // menu penjadwalan
    static void penjadwalan() {
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
                case 1 -> pilihJadwalBerdasarkanKelas("1A", jadwal_1A);
                case 2 -> pilihJadwalBerdasarkanKelas("1B", jadwal_1B);
                case 3 -> pilihJadwalBerdasarkanKelas("1C", jadwal_1C);
                case 4 -> pilihJadwalBerdasarkanKelas("1D", jadwal_1D);
                case 5 -> pilihJadwalBerdasarkanKelas("1E", jadwal_1E);
                case 6 -> {
                    return;
                }
            }
        }
    }

    // pilih jadwal berdasarkan kelas
    static void pilihJadwalBerdasarkanKelas(String stringKelas, String[][] arrayKelas) {
        System.out.println("Siakad / Modul Kursus / Penjadwalan / " + stringKelas);
        tampilkanJadwalBerdasarkanKelas(arrayKelas);
        int userInput = pickMenu("", new String[] {
                "Atur",
                "Kembali"
        });
        clearScreen();
        switch (userInput) {
            case 1 -> aturJadwal(stringKelas, arrayKelas);
        }
    }

    // menampilkan jadwal berdasarkan kelas
    static void tampilkanJadwalBerdasarkanKelas(String[][] arrayKelas) {
        int[] indexLineAtas = {13, 19, 25, 31, 37, 43, 49, 55, 61, 67};
        int[] indexLineBawah;
        String firstLine = "╠══════" + "╬═════".repeat(11)+ "╣";
        StringBuilder sbFirstLine = new StringBuilder(firstLine);
        System.out.println("╔══════" + "╦═════".repeat(11)+ "╗");
        System.out.println("║      ║  1  ║  2  ║  3  ║  4  ║  5  ║  6  ║  7  ║  8  ║  9  ║  10 ║  11 ║");
        String formatJadwal = "║%-6s%-66s║%n";
        int row = 0;
        for (String hari : kumpulanHari) {
            int begin = 0;
            int howLong = 0;
            String matkul = "";
            String simpanJadwal = "";
            int jadwalLenght = 0;
            String[] tempArray;
            int column = 0;
            int lineSekali = 0;
            int gantiIndexBawah = 0;
            int kelipatanIndexBawah = 13;
            int loopKosong = 0;
            indexLineBawah = new int[10];
            for (int j = 1; j <= 11; j++) {
                if (jadwalLenght < arrayKelas[row].length) {
                    if (arrayKelas[row][column] == null) {
                        begin = 0;
                    } else {
                        tempArray = arrayKelas[row][column].split("-");
                        if (Integer.parseInt(tempArray[0]) == j) {
                            begin = Integer.parseInt(tempArray[0]);
                            howLong = Integer.parseInt(tempArray[2]);
                            for (int k = 0; k < matkulTI.length; k++) {
                                if (tempArray[1].equals(matkulTI[k][0])) {
                                    matkul = matkulTI[k][1];
                                    break;
                                }
                            }
                            jadwalLenght++;
                        }
                    }
                } else
                    begin = 0;
                if (j == begin) {
                    simpanJadwal += "║"+ matkul + " ".repeat(howLong * 5 + (howLong - 1) - matkul.length());
                    j += howLong - 1;
                    column++;
                    lineSekali = 0;
                    if (gantiIndexBawah < 12) {
                        for (int q = 0; q < loopKosong; q++) {
                            gantiIndexBawah++;
                            kelipatanIndexBawah += 6;
                        }
                        if (begin!=1) {
                            indexLineBawah[gantiIndexBawah] = kelipatanIndexBawah;
                            kelipatanIndexBawah += 6;
                            gantiIndexBawah++;
                        }
                        for (int w = 0; w < howLong-1; w++) {
                            kelipatanIndexBawah += 6;
                            gantiIndexBawah++;
                        }
                        if (j <11) {
                            indexLineBawah[gantiIndexBawah] = kelipatanIndexBawah;
                        }
                        loopKosong = 0;
                    }
                } else {

                    if (lineSekali == 0) {
                        simpanJadwal += "║"+" ".repeat(5);
                        lineSekali++;
                    }
                    else{
                        simpanJadwal += " ".repeat(6);
                    }
                    
                    loopKosong++;
                    if (j==1) {
                        loopKosong--;
                    }
                }
            }
            row++;
            int kelBah = 13;
            for (int i = 0; i < indexLineBawah.length; i++) {
                if (indexLineAtas[i] == indexLineBawah[i] && indexLineAtas[i] != 0 && indexLineBawah[i] != 0) {
                    sbFirstLine.setCharAt(kelBah, '╬');
                }
                else if (indexLineAtas[i] > indexLineBawah[i]) {
                    sbFirstLine.setCharAt(kelBah, '╩');
                }
                else if (indexLineAtas[i] < indexLineBawah[i]) {
                    sbFirstLine.setCharAt(kelBah, '╦');
                }
                else{
                    sbFirstLine.setCharAt(kelBah, '═');
                }
                kelBah += 6;
            }
            System.out.println(sbFirstLine);
            System.out.printf(formatJadwal, hari, simpanJadwal);
            indexLineAtas = indexLineBawah;
        }
        String lastLine = "╚══════" + "╩═════".repeat(11)+ "╝";
        StringBuilder sbLastLine = new StringBuilder(lastLine);
        int kelBah = 13;
            for (int i = 0; i < indexLineAtas.length; i++) {
                if (indexLineAtas[i] > 0) {
                    sbLastLine.setCharAt(kelBah, '╩');
                }
                else{
                    sbLastLine.setCharAt(kelBah, '═');
                }
                kelBah += 6;
            }
            System.out.println(sbLastLine);
        
    }

    static void tampilkanJadwalPerHari(String hari, String[] jadwal) {
        System.out.println("+------+" + "-----+".repeat(11));
        System.out.println("|      |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  |  10 |  11 |");
        System.out.println("+------+" + "-----+".repeat(11));
        String formatJadwal = "|%-6s|%-66s%n";
        int begin = 0;
        int howLong = 0;
        String matkul = "";
        int column = 0;
        String simpanJadwal = "";
        int jadwalLenght = 0;
        String[] tempArray;
        for (int j = 1; j <= 11; j++) {
            if (jadwalLenght < jadwal.length) {
                if (jadwal[column] == null) {
                    begin = 0;
                } else {
                    tempArray = jadwal[column].split("-");
                    if (Integer.parseInt(tempArray[0]) == j) {
                        begin = Integer.parseInt(tempArray[0]);
                        howLong = Integer.parseInt(tempArray[2]);
                        for (int k = 0; k < matkulTI.length; k++) {
                            if (tempArray[1].equals(matkulTI[k][0])) {
                                matkul = matkulTI[k][1];
                                break;
                            }
                        }
                        jadwalLenght++;
                    }
                }
            } else
                begin = 0;
            if (j == begin) {
                simpanJadwal += matkul + " ".repeat(howLong * 5 + (howLong - 1) - matkul.length()) + "|";
                j += howLong - 1;
                column++;
            } else
                simpanJadwal += "-".repeat(5) + "|";
        }
        System.out.printf(formatJadwal, hari, simpanJadwal);
        String line = "+------+" + "-".repeat(65) + "+%n";
        System.out.printf(line);
    }

    // menmapilkan matkul
    static void tampilkanMatkul(String[][] matkulTI, int[] sks) {
        String formatTable = "║  {%s}  ║ %-8s ║ %-40s ║  %-2s ║%n";
        String firstLine   = "╔═══════╦═══════════╦" + "═".repeat(42) + "╦" + "═".repeat(5) + "╗";
        String middleLine  = "╠═══════╬═══════════╬" + "═".repeat(42) + "╬" + "═".repeat(5) + "╣";
        String lastLine    = "╚═══════╩═══════════╩" + "═".repeat(42) + "╩" + "═".repeat(5) + "╝";
        System.out.println(firstLine);
        System.out.println("║ index ║ Kode      ║ Mata Kuliah" + " ".repeat(30) + "║ SKS ║");
        System.out.println(middleLine);
        int number = 1;
        for (int i = 0; i < matkulTI.length; i++) {
            String[] takeMatkul = matkulTI[i];
            System.out.printf(formatTable, number++, takeMatkul[0], takeMatkul[2], sks[i]);
        }
        System.out.println(lastLine);
    }

    // untuk mengatur/edit jadwal
    static void aturJadwal(String stringKelas, String[][] arrayKelas) {
        String[][] tempJadawal = new String[5][3];
        String[] tempJadwalPerHari = new String[3];
        int[] tempSKS = SKS;
        tampilkanJadwalBerdasarkanKelas(arrayKelas);
        String _1, _3;
        int _2;
        for (int i = 0; i < kumpulanHari.length; i++) {
            int min = 1;
            boolean onceExecution = true;
            String next;
            for (int j = 0; j < tempJadawal[i].length; j++) {
                tampilkanMatkul(matkulTI, tempSKS);
                System.out.println("Format {1}-{2}-{3}");
                System.out.println("1. Mulai dari jam ke-(1-11)\n2. Index Kode matkul\n3. Lama jam matkul(1-6)");
                if (onceExecution) {
                    next = getInputUniqueWord(
                            "Jadwal kosong pada hari " + kumpulanHari[i] + " y/n (untuk input jadwal)", 1, 1, true,
                            "y", "n");
                    onceExecution = false;
                    if (next.equals("Y"))
                        break;
                }
                System.out.println("Masukan jadwal pada hari " + kumpulanHari[i]);
                _1 = getInputStringNumberwithLimit("Mulai dari jam ke-" + min + "-11", min, 11, false);
                while (true) {
                    _2 = Integer.parseInt(getInputStringNumberwithLimit("Index Kode matkul", 1, 8, false));
                    if (tempSKS[_2 - 1] > 0)
                        break;
                    else
                        System.out.println("SKS matkul sudah habis");
                }
                while (true) {
                    _3 = getInputStringNumberwithLimit("Lama jam matkul", 1, 11 - min, false);
                    if (Integer.parseInt(_3) <= tempSKS[_2 - 1]) {
                        tempSKS[_2 - 1] -= Integer.parseInt(_3);
                        break;
                    } else
                        System.out.println("SKS matkul tidak cukup");
                }
                min += Integer.parseInt(_3);
                tempJadwalPerHari[j] = _1 + "-" + matkulTI[_2 - 1][0] + "-" + _3;
                tampilkanJadwalPerHari(kumpulanHari[i], tempJadwalPerHari);
                tempJadawal[i][j] = _1 + "-" + matkulTI[_2 - 1][0] + "-" + _3;
                if (min > 8)
                    break;
                next = getInputUniqueWord("Masukan matkul selanjutnya y/n(Lanjut hari berikutnya)", 1, 1, true,
                        "y", "n");
                if (next.equals("N"))
                    break;
            }
        }
        tampilkanJadwalBerdasarkanKelas(tempJadawal);
        String userChoose = getInputUniqueWord("Simpan perubahan y/t", 1, 1, true, "y", "t");
        if (userChoose.equals("n"))
            return;
        arrayKelas = tempJadawal;
        switch (stringKelas) {
            case "1A" -> jadwal_1A = tempJadawal;
            case "1B" -> jadwal_1B = tempJadawal;
            case "1C" -> jadwal_1C = tempJadawal;
            case "1D" -> jadwal_1D = tempJadawal;
            case "1E" -> jadwal_1E = tempJadawal;
        }
        clearScreen();
        pilihJadwalBerdasarkanKelas(stringKelas, tempJadawal);
    }

    /* <--- modulKursus ---> */
    // Info Lomba
    static void infoLomba() {
        while (true) {
            renderTitle("Info Lomba");
            showLomba();
            int userInput = pickMenu("Menu : ", new String[] {
                    "Tambah Lomba",
                    "Edit Lomba",
                    "Hapus Lomba",
                    "Kembali"
            });
            clearScreen();
            switch (userInput) {
                case 1 -> tambahLomba();
                case 2 -> editLombaInterface();
                // case 3 -> hapusLomba();
                case 4 -> {
                    return;
                }
            }
        }
    }

    // fungsi menampilkan tabel lomba
    static void showLomba() {
        String formatTable = "║ %-3s ║ %-60s ║ %-61s ║%n";
        String firstLine = "╔═════╗" + "═".repeat(62) + "╦" + "═".repeat(63) + "╗";
        String middleLine = "╠═════╣" + "═".repeat(62) + "╬" + "═".repeat(63) + "╣";
        String lastLine = "╚═════╝" + "═".repeat(62) + "╩" + "═".repeat(63) + "╝";
        System.out.println(firstLine);
        System.out.println("║ NO  ║ NAMA" + " ".repeat(57) + "║Deskripsi" + " ".repeat(54) + "║");
        System.out.println(middleLine);
        for (int i = 0; i < lomba.length; i++) {
            String[] isi = lomba[i];
            System.out.printf(formatTable, i + 1, isi[0], isi[1]);
        }
        System.out.println(lastLine);
    }

    // interface menambahkan lomba
    static void tambahLomba() {
        String nama = getInputStringWithLimit("Nama Lomba", 1, 60, false);
        String deskripsi = getInputStringWithLimit("Deskripsi Lomba", 1, 60, false);
        String userChoose = getInputUniqueWord("Tambahkan data? y/t", 1, 1, true, "y", "t");
        clearScreen();
        if (userChoose.equalsIgnoreCase("y"))
            addLomba(nama, deskripsi);
        else
            System.out.println("Dibatalkan");
    }

    // fungsi menambahkan lomba
    static void addLomba(String nama, String deskripsi) {
        String[][] lombaBaru = new String[lomba.length + 1][2];
        for (int i = 0; i < lomba.length; i++) {
            lombaBaru[i] = lomba[i];
        }
        lombaBaru[lombaBaru.length - 1] = new String[] { nama, deskripsi };
        lomba = lombaBaru;
        clearScreen();
        System.out.println("Lomba telah berhasil ditambahkan");
    }
    static void editLombaInterface() {
        while (true) {
            showLomba();
            String pilih= getInputStringNumber("Pilih lomba yang ingin diedit(Null untuk Kembali)", false);
            clearScreen();
            if (Integer.parseInt(pilih) == lomba.length + 1){
                return;
            }
            String nama = getInputStringWithLimit("Nama Lomba", 1, 60, false);
            String deskripsi = getInputStringWithLimit("Deskripsi Lomba", 1, 60, false);
            String userChoose = getInputUniqueWord("Edit data? y/t", 1, 1, true, "y", "t");
            clearScreen();
            if (userChoose.equalsIgnoreCase("y"))
                // editLomba(Integer.parseInt(pilih), nama, deskripsi);
            else
                System.out.println("Dibatalkan");
        }
    }
    // static void editLomba(int index, String nama, String deskripsi) {
    //     lomba[index - 1][0] = nama;
    //     lomba[index - 1][1] = deskripsi;
    //     clearScreen();
    //     System.out.println("Lomba telah berhasil diedit");
    // }
    /* <--- DASHBOARD ADMIN ---> */

    /* <--- HELPER ---> */
    // clear terminal
    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Fungsi untuk keluar
    static void exit() {
        clearScreen();
        System.out.println("Anda Telah Behasil Logout!!");
        System.exit(0);
    }

    // untuk login pertama ketika user salah memasukan password atau username 3x
    // When incorrect pasword or username is entered 3 times, the program will exit
    static void exitForce() {
        clearScreen();
        System.out.println("Anda telah gagal mencoba 3 kali, silahkan tunggu 1 menit");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        int detik = 60;
        int left = detik / 60, right = detik % 60;
        for (int j = 0; j < detik; j++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.printf("Input salah 3x silahkan tunggu %d:%02d%n", left, right);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
            }
            if (right == 0) {
                left--;
                right = 59;
            } else
                right--;
        }
        System.out.print("\033[H\033[2J");
        System.out.println("Anda dapat mencoba login kembali");
    }

    // Funtuk mengecek apakah ada item di array 2 dimensional
    static boolean has(String[][] items, String needle, int fieldIndex) {
        for (String[] item : items) {
            if (item[fieldIndex].equals(needle))
                return true;
        }
        return false;
    }

    // melakukan print title/judul
    static void renderTitle(String title) {
        String fixTittle = (title.length() > 40) ? title.substring(0, 40) : title;
        int titleLength = fixTittle.length();
        String firstLine = "╔" + "═".repeat(42) + "╗";
        String lastLine = "╚" + "═".repeat(42) + "╝";
        System.out.println(firstLine);
        System.out.println((titleLength % 2 == 0)
                ? "║" + " ".repeat((42 - titleLength) / 2) + fixTittle + " ".repeat((42 - titleLength) / 2) + "║"
                : "║" + " ".repeat((42 - titleLength) / 2) + title + " ".repeat((42 - titleLength) / 2 + 1) + "║");
        System.out.println(lastLine);
    }

    // mengembalikan input String user scanner
    static String input(String info) {
        System.out.print(info + " : ");
        return scanner.nextLine().trim();
    }

    // mengembalikan input String user, kosong/tidak
    static String getInputString(String prompt, boolean allowEmpty) {
        while (true) {
            String userInput = input(prompt);
            if (allowEmpty && userInput.isEmpty())
                return userInput;
            if (!userInput.isEmpty())
                return userInput;
            System.out.println("Masukan tidak boleh kosong!");
        }
    }

    // mengembalikan input String user dengan limit jumlah karakter
    static String getInputStringWithLimit(String prompt, int min, int max, boolean allowEmpty) {
        while (true) {
            String userInput = getInputString(prompt, allowEmpty);
            if (allowEmpty && userInput.isEmpty())
                return userInput;
            if (userInput.length() >= min && userInput.length() <= max)
                return userInput;
            System.out.println("Masukan minimal " + min + " karakter dan maksimal " + max + " karakter");
        }
    }

    // mengembalikan input String number/angka
    static String getInputStringNumber(String prompt, boolean allowEmpty) {
        while (true) {
            String userInput = getInputString(prompt, allowEmpty);
            if (allowEmpty && userInput.isEmpty())
                return userInput;
            if (userInput.matches("[0-9]+"))
                return userInput;
            System.out.println("Masukan hanya boleh angka !");
        }
    }

    // mengembalikan input String number/angka user dengan limit jumlah karakter
    static String getInputStringNumberwithLimitChar(String prompt, int min, int max, boolean allowEmpty) {
        while (true) {
            String userInput = getInputStringNumber(prompt, allowEmpty);
            if (allowEmpty && userInput.isEmpty())
                return userInput;
            if (userInput.length() >= min && userInput.length() <= max)
                return userInput;
            System.out.println("Masukan minimal " + min + " karakter dan maksimal " + max + " karakter");
        }
    }

    // mengembalikan input String number user dengan limit angka
    static String getInputStringNumberwithLimit(String prompt, int min, int max, boolean allowEmpty) {
        while (true) {
            String userInput = getInputStringNumber(prompt, allowEmpty);
            if (allowEmpty && userInput.isEmpty())
                return userInput;
            if (Integer.parseInt(userInput) >= min && Integer.parseInt(userInput) <= max)
                return userInput;
            System.out.println("Masukan yang tersedia " + min + "-" + max);
        }
    }

    // mengembalikan input String dengan kata unik
    static String getInputUniqueWord(String prompt, int min, int max, boolean ignoreCase, String... uniqueWord) {
        while (true) {
            String userInput = getInputString(prompt, false);
            for (int i = 0; i < uniqueWord.length; i++) {
                if (ignoreCase && uniqueWord[i].equalsIgnoreCase(userInput))
                    return userInput.toUpperCase();
                if (uniqueWord[i].equals(userInput))
                    return userInput;
            }
            System.out.println("Format masukan salah");
        }
    }

    // membuat menu dengan melakukan perulangan print berdasarkan jumlah data dalam
    // array dan mengembalikan input integer
    static int pickMenu(String menuTitle, String[] menus) {
        int i = 0;
        String formatMenu = "║ %-40s ║%n";
        String firstLine = "╔" + "═".repeat(42) + "╗";
        String middleLine = "╠" + "═".repeat(42) + "╣";
        String lastLine = "╚" + "═".repeat(42) + "╝";
        System.out.println(firstLine);
        System.out.printf(formatMenu, menuTitle);
        System.out.println(middleLine);
        while (i < menus.length) {
            System.out.printf(formatMenu, String.format("%d. %s", i + 1, menus[i]));
            i++;
        }
        System.out.printf(formatMenu, String.format("%d. %s", i + 1, "Keluar"));
        System.out.println(lastLine);
        while (true) {
            String userInput = getInputStringNumberwithLimit("  Pilih menu", 1, menus.length + 1, false);
            int userNumber = Integer.parseInt(userInput);
            if (userNumber == menus.length + 1)
                exit();
            if (!(userNumber < 1 || userNumber > menus.length)) {
                return userNumber;
            }
            System.out.println("Format masukan salah");
        }
    }
    /* <--- HELPER ---> */
}