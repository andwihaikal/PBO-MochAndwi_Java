/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.mahasiswa;

/**
 *
 * @author Acer
 */
import java.util.*;
public class main {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    mahasiswa Mahasiswa = new mahasiswa();
    matakuliah MataKuliah = new matakuliah();
    System.out.println("Input Data Mahasiswa");
    Mahasiswa.inputdatamahasiswa();
    
    System.out.println("Input Data Mata Kuliah");
    MataKuliah.inputdatamataKuliah();
    
    System.out.println("Menampilkan Data Mahasiswa :");
    Mahasiswa.MenampilkanDataMahasiswa();
   
    System.out.println("Menampilkan Data Mata Kuliah");
    MataKuliah.MenampilkanDataMataKuliah();
    
    }
}
