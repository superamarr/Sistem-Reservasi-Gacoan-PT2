# Sistem Reservasi di Gacoan

## Deskripsi Singkat

Sistem Reservasi di Gacoan dibuat untuk membantu admin atau karyawan untuk mengelola peesanan reeservasi yang ada di Gacoan. Program ini memungkinkan admin atau karyawan yang ada di Gacoan untuk Melihat, Membuat, Memperbarui, dan Menghapus data reservasi pelanggan, namun dalam pt 2 kali ini pengguna dapat melakukan pencarian untuk pelanggan yang telah melakukan reservasi, program juga membantu pengguna untuk mengatasi kesalahan kecil seperti kesalahan penginputan data atau tipe data tidak sesuai menggunakan validasi input.

## Penjelasan Alur Program

### 1. Menu Utama

<img width="273" height="128" alt="image" src="https://github.com/user-attachments/assets/ac89fe89-b81d-4816-ba61-3282c95fd959" />

Pada Menu Utama ini admin atau karyawan dapat memilih untuk melihat, menambah, memperbarui atau bahkan menghapus data reservasi pelanggan.

### 2. Lihat Reservasi

<img width="336" height="347" alt="image" src="https://github.com/user-attachments/assets/8f05c0c7-96eb-47a7-beae-e9d443ffa80f" />

Ketika admin atau karyawan memilih opsi 1 maka program akan menampilkan data yang tersedia atau pelanggan yang telah melakukan reservasi.

### 2.1 Searching
<img width="461" height="193" alt="image" src="https://github.com/user-attachments/assets/25cf4773-f48d-47ff-8e98-2ef51520a805" />

Pengguna dapat melakukan penacrian berdasarkan nama pelanggan untuk mempermudah pengguna untuk melakukan pencarian pelanggan reservasi.


### 3. Buat Reservasi

#### 3.1 Fitur Buat Reservasi apabila pelanggan melakukan PO

<img width="587" height="366" alt="image" src="https://github.com/user-attachments/assets/dc2879a4-ca79-4b12-b795-92d274b3615e" />

Pada program ini admin dapat memilih pesanan apa yang di inginkan pelanggan serta langsung memberikan total harga yang telah di pre-Order oleh pelanggan, pada program ini admin atau karyawan dapat kembali ke menu utama dengan mengetikkan 0 di awal (Menginputkan nama pelanggan).

#### 3.2 Fitur Buat Reservasi apabila pelanggan tidak melakukan PO

<img width="301" height="160" alt="image" src="https://github.com/user-attachments/assets/7102c9ca-919a-4b74-acc4-90a54600ebd3" />

Pada fitur ini program akan langsung berhenti apabila pelanggan tidak melakukan pre-Order melainkan hanya melakukan reservasi meja dan waktu saja, admin atau karyawan dapat kembali ke menu utama dengan mengetikkan 0 di awal (Menginputkan nama pelanggan).

### 3.3 Validasi Inputan

<img width="333" height="279" alt="image" src="https://github.com/user-attachments/assets/931acc8f-df39-4cb4-99f4-21692a23e26b" />

Pengguna dapat meminimalisir untuk kesalahan kecil seperti salah memasukkan tipe data.


### 4. Perbarui Reservasi

<img width="692" height="448" alt="image" src="https://github.com/user-attachments/assets/78a815f8-caed-4644-a333-cd7f2bdc42f2" />

Pada fitur ini admin dapat memperbarui bagian - bagian yang perlu dan jika ada kolom yang tidak ingin diperbarui cukup tekan enter, admin atau karyawan dapat kembali ke menu utama dengan mengetikkan 0 di awal.

### 5. Hapus Reservasi

<img width="410" height="154" alt="image" src="https://github.com/user-attachments/assets/68904404-56d5-43e9-abcd-c9459436864a" />

Pada fitur ini admin dapat menghapus reservasi pelanggan dengan memilih index atau nomor yang telah di sediakan, admin atau karyawan dapat kembali ke menu utama dengan mengetikkan 0 di awal.

### 6. Keluar dari Program

<img width="523" height="137" alt="image" src="https://github.com/user-attachments/assets/1eca7900-2a66-4bf8-a7c0-ffd57bdc7e74" />

Ketika admin atau karyawan ingin keluar dari program dapat menginputkan 5 pada menu utama.

### 7. Package MVC + Service

<img width="142" height="95" alt="image" src="https://github.com/user-attachments/assets/bef2bf6c-5793-4512-82ae-31f8a27e4843" />

- Model -> Package model digunakan untuk menyiapkan, mengatur dan mengelola data dalam kasus program ini package model digunakan untuk menyiapkan field, konstruktor serta data dummy.
  
- View  -> Pacakge view digunakan untuk mengatur ui atau tampilan dalam program dalam kasus program ini package view digunakan untuk beberapa tampilan salah satunya adalah tampilan menu.
- Controller -> Package ini digunakan untuk menghubungkan model, view dan service dalam kasus program saya controller ini menerima inputan dari pengguna (view) lalu di teruskan ke service.
- Service -> Package ini adalah logika atau inti dalam program, dalam kasus program saya service ini di gunakan untuk membuat CRUD, validasi inputan dan kode penting lainnya berada dalam service.
- Main -> Package main dalam program ini digunakan agar program java tetap berjalan.




