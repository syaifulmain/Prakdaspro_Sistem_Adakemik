import java.util.Scanner;

/**
 * Tugas_c
 */
public class Tugas_c {
    String Nama_Mahasiswa, Nama_Dosen,Nama_Admin,Mata_Kuliah;
    Float NilaiKeaktifan, NilaiProjek, NilaiQuiz,NilaiTugasHarian,NilaiUTS,NilaiUAS,NilaiAkhir;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        Float NilaiAkhir = (NilaiKeaktifan*0.1f)+(NilaiProjek*0.2f)+(NilaiQuiz*0.1f)+(NilaiTugasHarian*0.2f)+(NilaiUTS*0.2f)+(NilaiUAS*0.2f);
        System.out.println("Nilai Akhir : "+NilaiAkhir);
    }

    
}