import java.util.Scanner;

/**
 * Tugas_c
 */
public class Tugas_c {
   public static String Nama_Mahasiswa, Matkul="Keamanan Keselamatan Kerja";
    Float NilaiKeaktifan, NilaiProjek, NilaiQuiz,NilaiTugasHarian,NilaiUTS,NilaiUAS,NilaiAkhir;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================= " + Matkul + " =================");
        System.out.println("Masukkan Nama Mahasiswa : ");
        String Nama_Mahasiswa = sc.nextLine();
        System.out.println("Masukan Nilai Keaftifan : ");
        Float NilaiKeaktifan = sc.nextFloat();
        System.out.println("Masukan Nilai Projek : ");
        Float NilaiProjek = sc.nextFloat();
        System.out.println("Masukan Nilai Quiz : ");
        Float NilaiQuiz = sc.nextFloat();
        System.out.println("Masukan Nilai Tugas Harian : ");
        Float NilaiTugasHarian = sc.nextFloat();
        System.out.println("Masukan Nilai UTS : ");
        Float NilaiUTS = sc.nextFloat();
        System.out.println("Masukan Nilai UAS : ");
        Float NilaiUAS = sc.nextFloat();
        Float NilaiAkhir = (NilaiKeaktifan*0.1f)+(NilaiProjek*0.41f)+(NilaiQuiz*0.09f)+(NilaiTugasHarian*0.1f)+(NilaiUTS*0.1f)+(NilaiUAS*0.2f);
        System.out.println("Nilai Akhir : "+NilaiAkhir);

    }

    
}