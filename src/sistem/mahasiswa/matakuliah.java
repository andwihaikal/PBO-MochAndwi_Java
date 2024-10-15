/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.mahasiswa;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class matakuliah {
    Scanner input = new Scanner(System.in);
    String matkul;
    int sks;
    Double nilai;
    
    void inputdatamataKuliah(){
        System.out.print("Nama Mata Kuliah : ");
        matkul = input.nextLine();
        System.out.print("Berapa SKS :");
        sks = input.nextInt();
        System.out.print("Masukan Nilai :");
        nilai = input.nextDouble();
    }
    
    void MenampilkanDataMataKuliah(){
        System.out.println("Mata Kuliah :"+matkul);
        System.out.println("SKS : "+sks);
        if (nilai >= 85) {
            System.out.println("Nilai anda A");
        } else if (nilai >= 75) {
            System.out.println("Nilai anda B");
        } else if (nilai >= 65) {
            System.out.println("Nilai anda C");
        } else if (nilai >= 50) {
            System.out.println("Nilai anda D");
        } else {
           System.out.println("Nilai anda E");
        }
    }
        }

