import java.util.Scanner;

public class MainApps {
    static Scanner scanner = new Scanner(System.in);
    static String[] role = { "ADMIN", "DOSEN", "MAHASISWA" };

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
    /* Nilai Matkul */

    static String[] kumpulanHari = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat" };

    /* JADWAL */
    static String[][] matkulTI;
    static String[][] jadwal_1A;
    static String[][] jadwal_1B;
    static String[][] jadwal_1C;
    static String[][] jadwal_1D;
    static String[][] jadwal_1E;
    /* JADWAL */

    /* <--- mengisi data array ---> */
    static void fillJadwal() {
        matkulTI = new String[][] {
                { "RTI231001", "PANCASILA", "Pancasila", "2" },
                { "RTI231002", "KTI", "Konsep Teknologi Informasi", "4" },
                { "RTI231003", "CTPS", "Critical Thinking dan Problem Solving", "4" },
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

    static void FillNilaiMatkul() {
        // kuis,tugas,uts,uas
        transkipNilai = new String[][] {
                { "1111111111", "72,75", "72.75", "84.75", "72.75", "76.5", "75.25", "76.25", "75.25" },
                { "2222222222", "78.25", "78.25", "87.25", "72.75", "78.25", "78.25", "90.25", "78.25" },
                { "3333333333", "76", "76", "74.25", "75", "85", "76", "86.5", "76" },
                { "4444444444", "80.75", "80.75", "77.5", "80.75", "80.75", "80.75", "78", "80.75" },
                { "5555555555", "82.75", "82.75", "88", "82.75", "84.75", "82.75", "63.75", "82.75" },

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

                { "1111111111", "78", "89", "47", "87" },
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
                { "1111111111", "NOKLENT", "L", "JAKARTA", "11-11-1111", "1A" },
                { "2222222222", "BERYL", "L", "BLITAR", "22-22-2222", "1B" },
                { "3333333333", "SOMEONE", "L", "BLITAR", "33-33-3333", "1C" },
                { "4444444444", "AHOMAD", "L", "BLITAR", "44-44-4444", "1D" },
                { "5555555555", "TMI", "L", "BLITAR", "55-55-5555", "1E" }
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

    static void fill() {
        fillJadwal();
        fillAdmin();
        fillDosen();
        fillMahasiswa();
        FillNilaiMatkul();
    }
    /* <--- mengisi data array ---> */

    public static void main(String[] args) {
        run();
    }

    static void run() {
        fill();
        clearScreen();
        // penjadwalan();
        firstLogin();
        // aturJadwal(0);
        // penjadwalanMenuKelas();
        // showDataBioMahasiswa();
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
    static void dashboardMahasiswa(String nim) {
        while (true) {
            renderTitle("Selamat Datang " + nim);
            System.out.println("=== Dashboard Mahasiswa ===");
            int userInput = pickMenu("Menu : ", new String[] {
                    "Biodata",
                    "Nilai",
                    "Jadwal",
                    "Presesi",
                    "Logout",
            });
            clearScreen();
            switch (userInput) {
                case 1 -> hadleBiodataMahasiswa(nim);
                case 2 -> hadleNilaiMahasiswa();
                case 3 -> hadleJadwalMahasiswa();
                case 4 -> hadlePresensiMahasiswa();
                case 5 -> {
                    return;
                }
            }
        }
    }

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

    static void hadleNilaiMahasiswa() {

    }

    static void hadleJadwalMahasiswa() {

    }

    static void hadlePresensiMahasiswa() {

    }
    /* DASHBOARD MAHASISWA */

    /* DASHBOARD DOSEN */

    static void dashboardDosen(String user) {
        while (true) {
            renderTitle("Dashboard " + user);
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

    static void penilaianMahasiswa() {
        while (true) {
            renderTitle("Penilian Mahasiswa");
            int userInput = pickMenu("Menu : ", new String[] {
                    "Tambah Nilai",
                    "Edit Nilai",
            });
            clearScreen();
            switch (userInput) {
                case 1 -> tambahNilai();
                // case 1 -> tambahNilai();
                // case 2 -> editNilai();
            }
        }
    }

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
            }
        }
    }

    static void showNilai(String[][] Array) {

        String formatTable = "| %-3s | %-10s | %-25s |  %-3s  |  %-3s  |  %-3s  |  %-3s  |%n";
        String horizonLine = "+-----+------------+---------------------------+-------+-------+-------+-------+";
        System.out.println(horizonLine);
        System.out.println("| NO  | NIM        | NAMA                      | Kuis  | Tugas |  UTS  |  UAS  |");
        System.out.println(horizonLine);
        for (int i = 0; i < Array.length; i++) {
            String[] takeNilai = Array[i];
            System.out.printf(formatTable, i + 1, takeNilai[0], bioMahasiswa[i][1], takeNilai[1], takeNilai[2],
                    takeNilai[3], takeNilai[4]);
        }
        System.out.println(horizonLine);
    }

    static void tambahNilaiMatkul(String[][] Array, String matkul) {
        while (true) {
            renderTitle("Tambah Nilai " + matkul);
            showNilai(Array);
            String nim = getInputStringWithLimit("Masukan NIM", 10, 10, true);
            if (!has(bioMahasiswa, nim, 0)) {
                System.out.println("NIM " + nim + " tidak ditemukan");
                return;
            } else if (nim.equals(null)) {
                return;
            }
            String kuis = getInputStringNumberwithLimit("Kuis", 0, 100, false);
            String tugas = getInputStringNumberwithLimit("Tugas", 0, 100, false);
            String uts = getInputStringNumberwithLimit("UTS", 0, 100, false);
            String uas = getInputStringNumberwithLimit("UAS", 0, 100, false);
            String userChoose = getInputUniqueWord("Tambahkan data? y/t", 1, 1, true, "y", "t");
            clearScreen();
            if (userChoose.equalsIgnoreCase("y")) {
                addNilai(Array, nim, kuis, tugas, uts, uas, matkul);
                return;
            } else
                System.out.println("Dibatalkan");
            return;
        }
    }

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
        if (matkul.equals("Pancasila")) {
            NilaiPancasila[studentIndex] = nilaiBaru[studentIndex];
        } else if (matkul.equals("KTI")) {
            NilaiKTI[studentIndex] = nilaiBaru[studentIndex];
        } else if (matkul.equals("CTPS")) {
            NilaiCTPS[studentIndex] = nilaiBaru[studentIndex];
        } else if (matkul.equals("MATDAS")) {
            NilaiMATDAS[studentIndex] = nilaiBaru[studentIndex];
        } else if (matkul.equals("BING_1")) {
            NilaiBING_1[studentIndex] = nilaiBaru[studentIndex];
        } else if (matkul.equals("DASPRO")) {
            NilaiDASPRO[studentIndex] = nilaiBaru[studentIndex];
        } else if (matkul.equals("PRAK_DASPRO")) {
            NilaiPRAK_DASPRO[studentIndex] = nilaiBaru[studentIndex];
        } else if (matkul.equals("K3")) {
            NilaiK3[studentIndex] = nilaiBaru[studentIndex];
        }
        System.out.println("Berhasil menambahkan nilai " + matkul);

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
                    "Kembali",
            });
            clearScreen();
            switch (userInput) {
                case 1 -> handleListMahasiswa();
                case 2 -> transkipNilai();
                case 3 -> {
                }
                case 4 -> {
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
        String formatTable = "| %-3s | %-10s | %-25s |       %-7s | %-15s | %-13s |   %-3s |%n";
        String horizonLine = "+-----+------------+---------------------------+---------------+-----------------+---------------+-------+";
        System.out.println(horizonLine);
        System.out.format(
                "| NO  | NIM        | NAMA                      | Jenis Kelamin | Alamat          | Tanggal Lahir | Kelas |%n");
        System.out.println(horizonLine);
        for (int i = 0; i < bioMahasiswa.length; i++) {
            String[] takeBio = bioMahasiswa[i];
            if (isNIM && nim[0].equals(takeBio[0])) {
                System.out.printf(formatTable, (i + 1), takeBio[0], takeBio[1], takeBio[2], takeBio[3], takeBio[4],
                        takeBio[5]);
                break;
            } else
                System.out.printf(formatTable, (i + 1), takeBio[0], takeBio[1], takeBio[2], takeBio[3], takeBio[4],
                        takeBio[5]);
        }
        System.out.println(horizonLine);
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
        for (int i = 0; i < bioMahasiswa.length; i++) {
            mahasiswaBaru[i] = bioMahasiswa[i];
        }
        mahasiswaBaru[mahasiswaBaru.length - 1] = dataBio;
        bioMahasiswa = mahasiswaBaru;
        System.out.println("Mahasiswa telah berhasil ditambahkan");

        // add user mahasiswa
        String[][] userBaru = new String[userMahasiswa.length + 1][2];
        for (int i = 0; i < userMahasiswa.length; i++) {
            userBaru[i] = userMahasiswa[i];
        }
        userBaru[userBaru.length - 1] = new String[] { dataBio[0], dataBio[0] };
        userMahasiswa = userBaru;

        // add nilai mahasiswa
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
    }

    // add data nilai mahasiswa
    static String[][] addDataNilaiMahasiswa(String nim, String[][] arrayNilai) {
        String[][] tempArrayNilai = new String[arrayNilai.length + 1][arrayNilai[0].length];
        for (int i = 0; i < tempArrayNilai[0].length; i++) {
            tempArrayNilai[tempArrayNilai.length - 1][i] = (i == 0) ? nim : "0";
        }
        for (int i = 0; i < arrayNilai.length; i++) {
            tempArrayNilai[i] = arrayNilai[i];
        }
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
                "NIM",
                "Nama",
                "Jenis Kelamin",
                "Alamat",
                "Tanggal Lahir",
                "Batal"
        });
        switch (userInput) {
            case 1 -> {
                while (true) {
                    input = getInputStringWithLimit("NIM", 10, 10, false);
                    if (has(bioMahasiswa, input, 0))
                        break;
                    System.out.println("NIM " + input + " sudah terdaftar");
                }
            }
            case 2 -> input = getInputStringWithLimit("NAMA", 1, 25, false);
            case 3 -> input = getInputUniqueWord("Gender L/P", 1, 1, true, "l", "p");
            case 4 -> input = getInputStringWithLimit("Alamat", 1, 15, false);
            case 5 -> input = getInputStringWithLimit("Tanggal lahir(DD/MM/YYYY)", 10, 10, false);
            case 6 -> {
                clearScreen();
                return;
            }
        }
        String userChoose = getInputUniqueWord("Simpan " + input + " Sebagai perubahan y/t", 1, 1, true, "y", "t");
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
            showDataBioMahasiswa(false);
            nim = getInputStringWithLimit("Masukan NIM yang ingin dihapus : ", 10, 10, false);
            if (has(bioMahasiswa, nim, 0))
                break;
            clearScreen();
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ada!");
        }
        String[][] tempArray = new String[bioMahasiswa.length - 1][4];
        int count = 0;
        for (String[] siswa : bioMahasiswa) {
            if (siswa[0].equals(nim))
                continue;
            tempArray[count] = siswa;
            count++;
        }
        bioMahasiswa = tempArray;
        clearScreen();
        System.out.println("Mahasiswa " + nim + " telah berhasil dihapus!");
    }

    // transkip nilai
    static void transkipNilai() {
        while (true) {
            System.out.println("Siakad / Modul Mahasiswa / Transkip Nilai");
            renderTitle("Transkip Nilai");
            int userInput = pickMenu("Menu : ", new String[] {
                    "Kembali",
            });
            clearScreen();
            switch (userInput) {
            }
        }
    }

    static void tampilkanTranskipNilai() {
        String formatTable = "| %-3s | %-10s | %-25s |       %-7s | %-15s | %-13s |   %-3s |%n";
        String horizonLine = "+-----+------------+---------------------------+-------+---------+---------+---------+---------+---------+---------+---------+---------+---------+";
        System.out.println(horizonLine);
        System.out.format(
                "| NO  | NIM        | NAMA                      | Kelas |PANCASILA|   KTI   |  CTPS   |   MAT   |  BING   |  DASP   | PRAK_DAS|   K3    |Rata-rata|%n");
        System.out.println(horizonLine);
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
                    "Penembatan Matkul dan Kelas Pengajar",
                    "Kembali"
            });
            clearScreen();
            switch (userInput) {
                case 1 -> penempatanKelasMahasiswa();
                case 2 -> penjadwalan();
                // case 3 ->
                case 4 -> {
                    return;
                }
            }
        }
    }

    // meanmpilkan table data nim,nama,kelas mahasiswa
    static void tampilkanMahasiswaBerdasarkanKelas(String kelas) {
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

    // sortir berdasarkan kelas
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
        } else {
            System.out.println("Dibatalkan");
        }
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
        System.out.println("+------+" + "-----+".repeat(11));
        System.out.println("|      |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  |  10 |  11 |");
        System.out.println("+------+" + "-----+".repeat(11));
        String formatJadwal = "|%-6s|%-66s%n";

        int row = 0;
        for (String hari : kumpulanHari) {
            int begin = 0;
            int howLong = 0;
            String matkul = "";
            String simpanJadwal = "";
            int jadwalLenght = 0;
            String[] tempArray;
            int column = 0;
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
                    simpanJadwal += matkul + " ".repeat(howLong * 5 + (howLong - 1) - matkul.length()) + "|";
                    j += howLong - 1;
                    column++;
                } else
                    simpanJadwal += "-".repeat(5) + "|";
            }
            row++;
            System.out.printf(formatJadwal, hari, simpanJadwal);
            String line = "+------+" + "-".repeat(65) + "+%n";
            System.out.printf(line);
        }
    }

    // menmapilkan matkul
    static void tampilkanMatkul() {
        String formatTable = "|  {%s}  | %-8s | %-40s |%n";
        String horizonLine = "+-------+-----------+" + "-".repeat(42) + "+";
        System.out.println(horizonLine);
        System.out.println("| index | Kode      | Mata Kuliah" + " ".repeat(30) + "|");
        System.out.println(horizonLine);
        int number = 1;
        for (int i = 0; i < matkulTI.length; i++) {
            String[] takeMatkul = matkulTI[i];
            System.out.printf(formatTable, number++, takeMatkul[0], takeMatkul[2]);
        }
        System.out.println(horizonLine);
    }

    // untuk mengatur/edit jadwal
    static void aturJadwal(String stringKelas, String[][] arrayKelas) {
        String[][] tempJadawal = new String[5][3];
        tampilkanJadwalBerdasarkanKelas(arrayKelas);
        tampilkanMatkul();
        String _1, _2, _3;
        System.out.println("Format {1}-{2}-{3}");
        System.out.println("1. Mulai dari jam ke-(1-11)\n2. Index Kode matkul\n3. Lama jam matkul(1-6)");
        for (int i = 0; i < kumpulanHari.length; i++) {
            System.out.println("Masukan jadwal pada hari " + kumpulanHari[i]);
            int min = 1;
            for (int j = 0; j < tempJadawal[i].length; j++) {
                _1 = getInputStringNumberwithLimit("Mulai dari jam ke-" + min + "-11", min, 11, false);
                _2 = getInputStringNumberwithLimit("Index Kode matkul(1-8)", 1, 8, false);
                _3 = getInputStringNumberwithLimit("Lama jam matkul", 1, 11 - min, false);
                min += Integer.parseInt(_3);
                System.out.printf("%s-%s-%s%n", _1, matkulTI[Integer.parseInt(_2) - 1][2], _3);
                tempJadawal[i][j] = _1 + "-" + matkulTI[Integer.parseInt(_2) - 1][0] + "-" + _3;
                if (min > 8)
                    break;
                String next = getInputUniqueWord("Masukan matkul selanjutnya y/n(Lanjut hari berikutnya)", 1, 1, true,
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

    // When incorrect pasword or username is entered 3 times, the program will exit
    static void exitForce() {
        clearScreen();
        System.out.println("Anda telah mencoba 3 kali, silahkan ulangi program.....");
        System.exit(0);
    }

    // Funtuk mengecek apakah ada item di array
    static boolean has(String[][] items, String needle, int fieldIndex) {
        for (String[] item : items) {
            if (item[fieldIndex].equals(needle))
                return true;
        }
        return false;
    }

    // melakukan print title
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

    // mengembalikan input String user, kosong/tidak, dengan limit
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

    // mengembalikan input String number user, kosong/tidak
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

    // mengembalikan input String number user, kosong/tidak, dengan limit
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

    // mengembalikan input String number user, kosong/tidak, dengan limit
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

    // mengembalikan input String kata unik user, ignorecase/tidak, dengan limit
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

    // membuat menu dengan input number
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

    /* <--- HELPER ---> */
}