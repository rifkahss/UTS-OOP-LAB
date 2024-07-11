package uts_praktik_oop_b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Rifkah_Artikel> listArtikel = new ArrayList<>();
    private static List<Rifkah_Buku> listBuku = new ArrayList<>();
    private static List<Rifkah_Order> listOrder = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        seedData();

        boolean exit = false;
        while (!exit) {
            System.out.println("============================================");
            System.out.println("           Welcome to Ceria Library");
            System.out.println("============================================");
            System.out.println("1. Lihat Publikasi");
            System.out.println("2. Tambah Publikasi");
            System.out.println("3. Lakukan Order");
            System.out.println("4. Kelola Order");
            System.out.println("5. Exit Program");
            System.out.print("Pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    showPublications();
                    break;
                case 2:
                    addPublication();
                    break;
                case 3:
                    makeOrder();
                    break;
                case 4:
                    manageOrders();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void seedData() {
        listBuku.add(new Rifkah_Buku("Java Programming", "John Doe", 2020, "Programming", "TechBooks", 400));
        listBuku.add(new Rifkah_Buku("Machine Learning in Education", "Jane Smith", 2021, "Education", "EduPublish", 350));

        listArtikel.add(new Rifkah_Artikel("Research Paper A", "Alice Johnson", 2022, "Artificial Intelligence", "Ceria University", 8, 3));
        listArtikel.add(new Rifkah_Artikel("Impact of Big Data Analytics in Healthcare", "Bob White", 2023, "Artificial Intelligence", "HealthTech Institute", 12, 5));
    }

    private static void showPublications() {
        System.out.println("============================================");
        System.out.println("              Daftar Buku");
        System.out.println("============================================");
        for (int i = 0; i < listBuku.size(); i++) {
            System.out.println((i + 1) + ". " + listBuku.get(i));
        }

        System.out.println("\n============================================");
        System.out.println("            Daftar Artikel");
        System.out.println("============================================");
        for (int i = 0; i < listArtikel.size(); i++) {
            System.out.println((i + 1) + ". " + listArtikel.get(i));
        }

        System.out.println("\nPress any key to continue...");
        scanner.nextLine();
    }

    private static void addPublication() {
        System.out.println("============================================");
        System.out.println("         Tambah Publikasi");
        System.out.println("============================================");
        System.out.println("Pilih jenis publikasi (1: Buku, 2: Artikel): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        if (choice == 1) {
            addBook();
        } else if (choice == 2) {
            addArticle();
        } else {
            System.out.println("Input tidak valid!");
        }
    }

    private static void addBook() {
        System.out.println("============================================");
        System.out.println("           Tambah Buku");
        System.out.println("============================================");
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Penulis: ");
        String penulis = scanner.nextLine();
        System.out.print("Tahun Terbit: ");
        int tahunTerbit = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kategori: ");
        String kategori = scanner.nextLine();
        System.out.print("Penerbit: ");
        String penerbit = scanner.nextLine();
        System.out.print("Jumlah Halaman: ");
        int jumlahHalaman = scanner.nextInt();
        if (jumlahHalaman <= 0) {
            System.out.println("Jumlah halaman harus lebih dari 0!");
            return;
        }
        scanner.nextLine();

        listBuku.add(new Rifkah_Buku(judul, penulis, tahunTerbit, kategori, penerbit, jumlahHalaman));
        System.out.println("\nBuku berhasil ditambahkan.");
    }

    private static void addArticle() {
        System.out.println("============================================");
        System.out.println("          Tambah Artikel");
        System.out.println("============================================");
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Penulis: ");
        String penulis = scanner.nextLine();
        System.out.print("Tahun Terbit: ");
        int tahunTerbit = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kategori: ");
        String kategori = scanner.nextLine();
        System.out.print("Universitas: ");
        String universitas = scanner.nextLine();
        System.out.print("Halaman: ");
        int halaman = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Volume: ");
        int volume = scanner.nextInt();
        if (volume <= 0) {
            System.out.println("Volume harus lebih dari 0!");
            return;
        }
        scanner.nextLine();

        listArtikel.add(new Rifkah_Artikel(judul, penulis, tahunTerbit, kategori, universitas, halaman, volume));
        System.out.println("\nArtikel berhasil ditambahkan.");
    }

    private static void makeOrder() {
        System.out.println("============================================");
        System.out.println("           Order Publikasi");
        System.out.println("============================================");
        System.out.println("Pilih jenis publikasi yang ingin dipinjam (1: Buku, 2: Artikel): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            orderBook();
        } else if (choice == 2) {
            orderArticle();
        } else {
            System.out.println("Input tidak valid!");
        }
    }

    private static void orderBook() {
        System.out.println("============================================");
        System.out.println("             Order Buku");
        System.out.println("============================================");
        System.out.println("Daftar Buku:");
        for (int i = 0; i < listBuku.size(); i++) {
            System.out.println((i + 1) + ". " + listBuku.get(i));
        }
        System.out.print("Masukkan nomor buku yang ingin Anda pinjam (masukkan 0 untuk membatalkan): ");
        int bookIndex = scanner.nextInt();
        scanner.nextLine();

        if (bookIndex >= 1 && bookIndex <= listBuku.size()) {
        	Rifkah_Buku selectedBook = listBuku.get(bookIndex - 1);
            System.out.print("Masukkan nama peminjam: ");
            String namaPeminjam = scanner.nextLine();
            System.out.print("Masukkan tanggal selesai peminjaman (format YYYYMMDD): ");
            String tanggalSelesai = scanner.nextLine();

            if (tanggalSelesai.compareTo(getCurrentDate()) < 0) {
                System.out.println("Tanggal selesai peminjaman tidak valid!");
                return;
            }

            listOrder.add(new Rifkah_Order(selectedBook, namaPeminjam, getCurrentDate(), tanggalSelesai, "Ongoing"));
            System.out.println("\nOrder berhasil dibuat untuk buku \"" + selectedBook.getJudul() + "\".");
        } else if (bookIndex != 0) {
            System.out.println("Nomor buku tidak valid!");
        }
    }

    private static void orderArticle() {
        System.out.println("============================================");
        System.out.println("           Order Artikel");
        System.out.println("============================================");
        System.out.println("Daftar Artikel:");
        for (int i = 0; i < listArtikel.size(); i++) {
            System.out.println((i + 1) + ". " + listArtikel.get(i));
        }
        System.out.print("Masukkan nomor artikel yang ingin Anda pinjam (masukkan 0 untuk pembatalan): ");
        int articleIndex = scanner.nextInt();
        scanner.nextLine();

        if (articleIndex >= 1 && articleIndex <= listArtikel.size()) {
        	Rifkah_Artikel selectedArticle = listArtikel.get(articleIndex - 1);
            System.out.print("Masukkan nama peminjam: ");
            String namaPeminjam = scanner.nextLine();
            System.out.print("Masukkan tanggal selesai peminjaman (format YYYYMMDD): ");
            String tanggalSelesai = scanner.nextLine();

            if (tanggalSelesai.compareTo(getCurrentDate()) < 0) {
                System.out.println("Tanggal selesai peminjaman tidak valid!");
                return;
            }

            listOrder.add(new Rifkah_Order(selectedArticle, namaPeminjam, getCurrentDate(), tanggalSelesai, "Ongoing"));
            System.out.println("\nOrder berhasil dibuat untuk artikel \"" + selectedArticle.getJudul() + "\".");
        } else if (articleIndex != 0) {
            System.out.println("Nomor artikel tidak valid!");
        }
    }

    private static void manageOrders() {
        System.out.println("============================================");
        System.out.println("              List Order");
        System.out.println("============================================");
        for (int i = 0; i < listOrder.size(); i++) {
            Rifkah_Order order = listOrder.get(i);
            System.out.println("OID" + (i + 1));
            System.out.println("Judul: " + order.getPublikasi().getJudul());
            System.out.println("Peminjam: " + order.getNamaPeminjam());
            System.out.println("Tanggal Selesai: " + order.getTanggalSelesai());
            System.out.println("Status: " + order.getStatus());
            System.out.println("------------------------------------------------");
        }

        System.out.print("Pilih order yang ingin diubah status peminjamannya: ");
        String input = scanner.nextLine().trim();

        if (!input.startsWith("OID") || input.length() <= 3) {
            System.out.println("Input tidak valid!");
            return;
        }

        int orderId;
        try {
            orderId = Integer.parseInt(input.substring(3)) - 1; // Kurangi satu untuk mendapatkan indeks yang benar
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid!");
            return;
        }

        if (orderId >= 0 && orderId < listOrder.size()) {
            Rifkah_Order selectedOrder = listOrder.get(orderId);
            System.out.println("Ubah Status:");
            System.out.println("1. Ongoing");
            System.out.println("2. Returned");
            System.out.println("3. Due");
            System.out.print("Pilihan: ");
            int statusChoice = scanner.nextInt();
            scanner.nextLine();

            switch (statusChoice) {
                case 1:
                    selectedOrder.setStatus("Ongoing");
                    System.out.println("Status berhasil diubah!");
                    break;
                case 2:
                    selectedOrder.setStatus("Returned");
                    System.out.println("Status berhasil diubah!");
                    break;
                case 3:
                    selectedOrder.setStatus("Due");
                    System.out.println("Status berhasil diubah!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } else {
            System.out.println("Nomor order tidak valid!");
        }
    }

    private static String getCurrentDate() {
        return "20240322";
    }
}