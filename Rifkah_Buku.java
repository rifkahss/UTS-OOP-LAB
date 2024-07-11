package uts_praktik_oop_b;

class Rifkah_Buku extends Rifkah_Publikasi {
    private String penerbit;
    private int jumlahHalaman;

    public Rifkah_Buku(String judul, String penulis, int tahunTerbit, String kategori, String penerbit, int jumlahHalaman) {
        super(judul, penulis, tahunTerbit, kategori);
        this.penerbit = penerbit;
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public String toString() {
        return "Judul: " + getJudul() + " | Penulis: " + getPenulis() + " | Tahun Terbit: " + getTahunTerbit() +
                " | Kategori: " + getKategori() + " | Penerbit: " + penerbit + " | Jumlah Halaman: " + jumlahHalaman;
    }
}