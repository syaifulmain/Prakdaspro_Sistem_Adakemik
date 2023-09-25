import java.util.Scanner;

public class MainApps {
    public static Scanner scanner = new Scanner(System.in);
    /* 
     * [i][0] username -> primary id
     * [i][1] password
     * [i][2] level {admin, dosen, mahasiswa}
     */
    public static String[][] dataUser = new String[10][3];
    // primary id
    public static int index;
    /*
     * [i][0] dataUser[i][0]
     * [i][1] NIM
     * [i][2] nama
     * [i][3] tempat/tanggal lahir
     * [i][4] prodi
     */
    public static String[][] dataBioMahasiwa = new String[10][5];
    public static void main(String[] args) {

    }

    // DONE: login view
    public static void loginView(){
        while (true) {
            System.out.println("== SISTEM AKADEMIK ==");
            String NIM  = input("USERNAME");
            if (NIM.equals("")){
                break;
            }
            String PASS = input("PASSWORD");
            login(NIM, PASS);
        }
    }
    // login logic
    public static void login(String NIM, String PASS) {
        boolean userCheck = true;
        for (int i = 0; i < dataUser.length; i++) {
            if (dataUser[i][0].equals(NIM) && (dataUser[i][1].equals(PASS))) {
                index = i;
                if (dataUser[i][2].equals("admin")) {
                    // to admin dashboard
                    System.out.println("Dashboard admin");
                } else if (dataUser[i][2].equals("dosen")) {
                    // to dosen dashboard
                    System.out.println("Dashboard dosen");
                } else {
                    // to mahasiswa dashboard
                    System.out.println("Dashboard mahasiswa");
                }
                userCheck = false;
                break;
            }
        }
        if (userCheck) {
            System.out.println("Username/password salah");
        }
    }


    /* DASHBOARD MAHASISWA */
        // GENERAL
            // TODO: biodata -> menampikan biodata mahasiswa

        
            // AKADEMIK
            // TODO: KRS -> menampilkan krs

            // TODO: jadwal perkuliahan -> menampilkan jadwal perkuliahan

            // TODO: nilai mahasiswa -> menampilkan mahasiswa

            // TODO: LMS -> ???

            // TODO: presensi -> menampilkan presensi

            // TODO: data skpi -> menampilkan,menambah,menghapus data skpi

            // UKT
            // TODO: pembayaran ukt -> menampilkan ukt persemester

            // TODO: keringanan ukt -> ????

    /* DASHBOARD MAHASISWA */


    /* DASHBOARD DOSEN */

    /* DASHBOARD DOSEN */


    /* DASHBOARD ADMIN */
// dashboard admin
    public static void viewDashboardAdmin(){
        dashboardAdminView :
        while (true) {
            System.out.println("=== Dashboard Admin ===");
            System.out.println("1. Data Mahasiswa");
            System.out.println("2. Data Dosen");
            System.out.println("x. Logout");
            String choose = input("PILIH");
            switch (choose) {
                case "1" -> viewDataBioMahasiswa();
                case "2" -> showDataDosen();
                case "x" -> {break dashboardAdminView;}
                default -> System.out.println("Perintah tidak dimengerti");
            }
        }
    }
    // view data bio mahasiswa
    public static void viewDataBioMahasiswa(){
        showDataMahasiswa :
        while (true) {
            showDataBioMahasiswa();
            System.out.println("1. Tambah data");
            System.out.println("2. Edit data");
            System.out.println("3. Hapus data");
            System.out.println("x. Kembali");
            var choose = input("PILIH");
            switch (choose) {
                case "1" -> viewAddDataBioMahasiswa();
                case "2" -> viewEditDataBioMahasiswa();
                case "3" -> viewRemoveDataBioMahasiswa();
                case "x" -> {break showDataMahasiswa;}
                default -> System.out.println("Perintah tidak dimengerti");
            }
        }
    }
    // show data bio mahasiswa
    public static void showDataBioMahasiswa(){
        String formatTable = "| %-3s | %-10s | %-20s | %-25s | %-25s |%n";
        System.out.format("+-----+------------+----------------------+---------------------------+---------------------------+%n");
        System.out.format("| NO  | NIM        | NAMA                 | TEMPAT/TANGGAL LAHIR      | PRODI                     |%n");
        System.out.format("+-----+------------+----------------------+---------------------------+---------------------------+%n");
        if (dataBioMahasiwa[0][0] != null) {   
            int no = 0;
            for (int i = 0; i < dataBioMahasiwa.length; ++i) {
                if (dataBioMahasiwa[i][0] != null) {
                    no++;
                    System.out.format(formatTable, no, dataBioMahasiwa[i][1], dataBioMahasiwa[i][2], dataBioMahasiwa[i][3], dataBioMahasiwa[i][4]);
                }
            }
            System.out.format("+-----+------------+----------------------+---------------------------+---------------------------+%n");
        }
    }
    // view add data bio mahasiswa
    public static void viewAddDataBioMahasiswa(){
        viewAddDataBioMahasiswa :
        while (true) { 
            String NIM, nama, ttl, prodi, choose;
            String level = "mahasiswa";
            NIM   = input("NIM(kosong utk batal)");
            if (NIM.equals("")){
                break viewAddDataBioMahasiswa;
            }
            String indexUser = cekIndexUser();
            nama  = input("Nama                ");
            ttl   = input("Tempat/Tanggal Lahir");
            prodi = input("Prodi               ");
            choose = input("Tambahkan data?  y/n");
            switch (choose) {
                case "y" -> {
                    addDataBioMahasiswa(indexUser, NIM, nama, ttl, prodi, level);
                    System.out.println("Berhasil menambahakan data baru");
                }
                case "n" -> System.out.println("Dibatalkan");
                default -> System.out.println("Perintah tidak dimengerti gagal menambahkan");
            }
            break viewAddDataBioMahasiswa;
        }
    }
    // logic add data bio mahasiswa
    public static void addDataBioMahasiswa(String... data){
        // Cek dataBioMahasiwa apakah penuh
        boolean isFull = true;
        for (int i = 0; i < dataBioMahasiwa.length; i++) {
            if (dataBioMahasiwa[i][0] == null) {
                isFull = false;
                break;
            }            
        }
        // jika dataBioMahasiwa penuh dikalikan
        if (isFull){
            dataBioMahasiwa = new String[dataBioMahasiwa.length * 2][5];

            System.arraycopy(dataBioMahasiwa, 0, dataBioMahasiwa, 0, dataBioMahasiwa.length);
        }
        // tambahkan ke dataBioMahasiwa
        for (int i = 0; i < dataBioMahasiwa.length; ++i) {
            if (dataBioMahasiwa[i][0] == null) {
                dataBioMahasiwa[i][0] = data[0];
                dataBioMahasiwa[i][1] = data[1];
                dataBioMahasiwa[i][2] = data[2];
                dataBioMahasiwa[i][3] = data[3];
                dataBioMahasiwa[i][4] = data[4];
                addUser(data[0], data[1], data[5]);
                break;
            }
        }
    }
    // cek index user
    public static String cekIndexUser(){
        // Cek user jika penuh
        boolean isFull = true;
        for (int i = 0; i < dataUser.length; i++) {
            if (dataUser[i][0] == null) {
                isFull = false;
                break;
            }            
        }
        // jika user penuh dikalikan
        if (isFull){
            dataUser = new String[dataUser.length * 2][5];

            System.arraycopy(dataUser, 0, dataUser, 0, dataUser.length);
        }
        // Mengambil indexUser
        int indexUser = -1;
        for(int i = 0; i < dataUser.length; i++) {
            if(dataUser[i][0] == null) {
                   indexUser = i;
                   break;
            }
        }
        return String.valueOf(indexUser);
    }
    // menambahkan dataUser mahasiswa
    public static void addUser(String... data){
        int indexUser = Integer.parseInt(data[0]);
        dataUser[indexUser][0]= data[1];
        dataUser[indexUser][1]= data[1];
        dataUser[indexUser][2]= data[2];
    }
    // cek ada/tidaknya nomor pada tabel
    public static boolean noData(String no){
        int noData = 0;
            for (int i = 0; i < dataBioMahasiwa.length; i++) {
                if (dataBioMahasiwa[i][0] == null) {
                    noData = i;
                    break;
                }                
            }
        if (no.equals("")){
            return false;
        } else if (!no.matches("[1-9]+") || Integer.parseInt(no) > noData) {
            System.out.println("Data tidak ditemukan");
            return false;
        } else {
            return true;
        }
    }
    // view edit data bio mahasiswa
    public static void viewEditDataBioMahasiswa(){
        viewEditDataBioMahasiswa:
        while (true) {   
            System.out.println("Masukan nomor yang ingin diubah(kosong utk batal)");
            String no   = input("No ke");
            if (noData(no)){
                int noIndex1 = Integer.parseInt(no) - 1;
                String formatTable = "| %-10s | %-20s | %-25s | %-25s |%n";
                System.out.format("+------------+----------------------+---------------------------+---------------------------+%n");
                System.out.format("| NIM (1)    | NAMA (2)             | TEMPAT/TANGGAL LAHIR (3)  | PRODI (4)                 |%n");
                System.out.format(formatTable, dataBioMahasiwa[noIndex1][1], dataBioMahasiwa[noIndex1][2], dataBioMahasiwa[noIndex1][3], dataBioMahasiwa[noIndex1][4]);
                System.out.format("+------------+----------------------+---------------------------+---------------------------+%n");
                System.out.println("Masukan nomor yang ingin diubah(kosong utk batal)");
                String choose = input("No ke");
                String change = "";
                switch (choose) {
                    case "1" ->{
                            change = input("Ubah NIM");
                            while (!change.matches("[1-9]+")) {
                                System.out.println("Input salah");
                                change = input("Ubah NIM");
                            }
                    }
                    case "2" -> change = input("Ubah NAMA");
                    case "3" -> change = input("Ubah TEMPAT/TANGGAL LAHIR");
                    case "4" -> change = input("Ubah PRODI");
                    case "" -> {
                        System.out.println("Dibatalkan");
                        break viewEditDataBioMahasiswa;
                    }
                    default -> {
                        System.out.println("Perintah tidak dimengerti gagal merubah");
                        break viewEditDataBioMahasiswa;
                    }
                }
                int noIndex2 = Integer.valueOf(choose);
                boolean succes = editDataBioMahasiswa(noIndex1, noIndex2, change);
                if (!succes) {
                    System.out.println("Dibatalkan");
                }
            }   
            break viewEditDataBioMahasiswa;
        }
    }
    // edit data bio mahasiswa
    public static boolean editDataBioMahasiswa (int noIndex1, int noIndex2, String change) {
        if (change != "") {
            dataBioMahasiwa[noIndex1][noIndex2] = change;
            return true;   
        } else {
            return false;
        }
    }
    // view hapus data bio mahasiswa
    public static void viewRemoveDataBioMahasiswa() {
        viewRemoveDataBioMahasiswa :
        while (true) {
            System.out.println("Masukan nomor yang ingin dihapus(kosong utk batal)");
            String no   = input("No ke");
            if (noData(no)) {
                boolean succes = removeDataBioMahasiswa(Integer.valueOf(no));
                if (!succes) {
                    System.out.println("Gagal menghapus");
                }
            }
            break viewRemoveDataBioMahasiswa;
        }
    }
    // hapus data mahasiswa dari dataBioMahasiswa
    public static boolean removeDataBioMahasiswa(int no) {
        if ((no - 1) >= dataBioMahasiwa.length){
            return false;
        }
        if (dataBioMahasiwa[no - 1] == null){
            return false;
        } else {
            for (int i = (no - 1); i < dataBioMahasiwa.length; i++) {
                if (i == (dataBioMahasiwa.length - 1)){
                    for (int j = 0; j < dataBioMahasiwa[i].length; j++) {
                        dataBioMahasiwa[i][j] = null;
                    }
                } else {
                    for (int j = 0; j < dataBioMahasiwa[i].length; j++) {
                        dataBioMahasiwa[i][j] = dataBioMahasiwa[i + 1][j];
                    }
                }
            }
            return true;
        }
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
}