package Jobsheet9;

public class Surat18 {
  String idSurat;
  String namaMahasiswa;
  String kelas;
  char jenisIzin;
  int durasi;

  public Surat18(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
    this.idSurat = idSurat;
    this.namaMahasiswa = namaMahasiswa;
    this.kelas = kelas;
    this.jenisIzin = jenisIzin;
    this.durasi = durasi;
  }
  public void tampilkanSurat() {
    System.out.println("ID Surat     : " + idSurat);
    System.out.println("Nama         : " + namaMahasiswa);
    System.out.println("Kelas        : " + kelas);
    System.out.println("Jenis Izin   : " + (jenisIzin == 'S' ? "Sakit" : "Izin"));
    System.out.println("Durasi (hari): " + durasi);
  }
}
