
# Aplikasi Buku Catatan Harian

Aplikasi ini adalah aplikasi desktop berbasis Java menggunakan Swing untuk mengelola catatan harian. Pengguna dapat menambahkan, mengubah, menghapus, dan melihat catatan yang tersimpan dalam database.

## Identitas 
- Nama : Addin Husnan Nadhari
- Kelas : 5B nonreg Banjarmasin
- Npm : 2210010037
- 
## Fitur Utama
1. **Tambah Catatan**: Tambahkan catatan baru dengan judul, isi, dan tanggal.
2. **Lihat Catatan**: Tampilkan daftar catatan yang tersimpan dalam tabel.
3. **Edit Catatan**: Perbarui catatan yang sudah ada.
4. **Hapus Catatan**: Hapus catatan yang dipilih dari daftar.
5. **Pengelolaan Database**: Data catatan disimpan dalam database menggunakan `CatatanDatabase`.

## Komponen Antarmuka
- **TextField** untuk memasukkan judul catatan.
- **TextArea** untuk isi catatan.
- **JDateChooser** untuk memilih tanggal catatan.
- **JTable** untuk menampilkan daftar catatan.
- **Button**:
  - **Simpan**: Menyimpan catatan baru atau memperbarui catatan yang dipilih.
  - **Hapus**: Menghapus catatan yang dipilih.
  - **Ubah**: Mengedit catatan yang dipilih.
  - **Keluar**: Menutup aplikasi.

## Struktur Kode
- **`CatatanFrame`**: Kelas utama yang berisi antarmuka pengguna dan logika utama aplikasi.
- **`CatatanDatabase`**: Kelas terpisah (tidak disertakan dalam kode ini) untuk mengelola koneksi dan operasi database.
- **Model Catatan**: Representasi data catatan termasuk `judul`, `isi`, dan `tanggal`.

## Cara Kerja
1. Aplikasi terhubung ke database melalui `CatatanDatabase` selama inisialisasi.
2. Data catatan ditampilkan dalam `JTable`.
3. Pengguna dapat menambahkan catatan baru melalui form, mengedit catatan yang dipilih, atau menghapus catatan yang tidak diperlukan.
4. Perubahan data diperbarui di tabel dan disimpan ke database.

## Kebutuhan Sistem
- Java Development Kit (JDK) 8 atau lebih baru.
- Library eksternal:
  - **JCalendar** (`com.toedter.calendar.JDateChooser`) untuk pemilihan tanggal.
- Database yang kompatibel dengan Java (misalnya MySQL atau SQLite).

## Cara Menjalankan
1. Pastikan database telah dikonfigurasi dengan tabel yang sesuai.
2. Tambahkan dependensi JCalendar ke proyek Anda.
3. Kompilasi dan jalankan aplikasi dengan `CatatanFrame` sebagai entry point utama.

## Struktur Database
Tabel yang digunakan dalam database:
- **Tabel Catatan**
  - Kolom: `id` (INT, Primary Key), `judul` (VARCHAR), `isi` (TEXT), `tanggal` (DATE).
