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
public class mahasiswa {
   Scanner input = new Scanner(System.in);
   String NPM;
   String nama;
   String kelas;
   String jurusan;

  public void inputdatamahasiswa(){
    System.out.print("Masukan NPM : ");
    NPM = input.nextLine();
    System.out.print("Masukan Nama : ");
    nama = input.nextLine();
    System.out.print("Masukan Kelas : ");
    kelas = input.nextLine();
    System.out.print("Masukan Jurusan : ");
    jurusan = input.nextLine(); 
  }
  
  void MenampilkanDataMahasiswa(){
      System.out.println("NPM :"+NPM);
      System.out.println("Nama :"+nama);
      System.out.println("Kelas :"+kelas);
      System.out.println("Jurusan :"+jurusan);
  }
}
