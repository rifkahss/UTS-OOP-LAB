package uts_praktik_oop_b;

class Rifkah_Artikel extends Rifkah_Publikasi {
    private String universitas;
    private int halaman;
    private int volume;

    public Rifkah_Artikel(String judul, String penulis, int tahunTerbit, String kategori, String universitas, int halaman, int volume) {
        super(judul, penulis, tahunTerbit, kategori);
        this.universitas = universitas;
        this.halaman = halaman;
        this.volume = volume;
    }

    public String getUniversitas() {
        return universitas;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }

    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Judul: " + getJudul() + " | Penulis: " + getPenulis() + " | Tahun Terbit: " + getTahunTerbit() +
                " | Kategori: " + getKategori() + " | Universitas: " + universitas + " | Halaman: " + halaman +
                " | Volume: " + volume;
    }
}