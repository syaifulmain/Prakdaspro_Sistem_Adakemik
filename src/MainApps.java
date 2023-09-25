import java.util.Scanner;

public class MainApps {
    public static Scanner scanner = new Scanner(System.in);

    // logindata username[i][0]/passwrod[i][1]/level[i][2]{admin, dosen, mahasiswa}
    public static String[][] dataUser = new String[10][3];

    // primary id
    public static int index;

    public static void main(String[] args) {
        login(null, null);
        dataUser[0][0] ="123";
    dataUser[0][1] ="123";
    dataUser[0][2] ="admin";
    loginView();

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

    /* DASHBOARD ADMIN */

    // SCANNER
    public static String input(String info){
        System.out.print(info + " : ");
        return scanner.nextLine();
    }
}