package uts_praktik_oop_b;

class Rifkah_Order {
    private Rifkah_Publikasi publikasi;
    private String namaPeminjam;
    private String tanggalMulai;
    private String tanggalSelesai;
    private String status;

    public Rifkah_Order(Rifkah_Publikasi publikasi, String namaPeminjam, String tanggalMulai, String tanggalSelesai, String status) {
        this.publikasi = publikasi;
        this.namaPeminjam = namaPeminjam;
        this.tanggalMulai = tanggalMulai;
        this.tanggalSelesai = tanggalSelesai;
        this.status = status;
    }

    public Rifkah_Publikasi getPublikasi() {
        return publikasi;
    }

    public void setPublikasi(Rifkah_Publikasi publikasi) {
        this.publikasi = publikasi;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public String getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(String tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public String getTanggalSelesai() {
        return tanggalSelesai;
    }

    public void setTanggalSelesai(String tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}