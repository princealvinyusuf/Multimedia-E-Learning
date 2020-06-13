BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "lesson" (
	"_id"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	"courseid"	INTEGER,
	"title"	TEXT,
	"section0"	TEXT,
	"section1"	TEXT,
	"section2"	TEXT,
	"section3"	TEXT,
	"section4"	TEXT,
	"section5"	TEXT,
	"section6"	TEXT,
	"section7"	TEXT,
	"section8"	TEXT,
	"section9"	REAL,
	"questions"	INTEGER,
	"result"	INTEGER DEFAULT 0,
	"nsections"	INTEGER DEFAULT 0
);
CREATE TABLE IF NOT EXISTS "course" (
	"_id"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	"title"	TEXT
);
INSERT INTO "lesson" VALUES (1,1,'Pendahuluan','Apa Yang Anda Dapatkan ?<<-->>
~> Organisasi Visual
~> Nirmana
~> Warna
~> Tipografi
~> Simbol & Ikon
~> Logo
~> Layout
~> Advertising
~> Desain Karakter
~> Illustrasi


','Important Things To Do<<-->>
~> Tugas (Teori & Praktikum) -> 35%
~> UTS -> 15%
~> UAS -> 35%
~> Softskill -> 5%
~> Kehadiran -> 5%
~> Kuis -> 5%

Agree? or Not? Maybe Complaint?

Feel Free to discuss with me -> 6281277748055


','Rules<<-->>
* Tugas wajib dikumpulkan ontime
* Jika tidak mengerjakan UTS tanpa keterangan resmi dari TU-IF dan permintaan dari mahasiswa terkait, maka tidak ada ujian susulan
* Hadir tiap hari bukan berarti nilai anda bebas dari E
* Kejujuran harga mati! Menyontek atau pun meminta orang lain mengerjakan pekerjaan anda adalah kesalahan terbesar dalam perkuliahan ini
* Selalu bawa pensil dan penghapus selama perkuliahan


','Tips of The Day<<-->>
Cara Menghubungi Pengajar Lewat Chat:
* Gunakan Salam
* Perkenalkan Diri Anda
* To The Point Pada Masalah Anda
* Terima Kasih
* Sadar Waktu -> 07:00 - 22:00 WIB

Cara Menghubungi Pengajar Lewat Email:
* Gunakan Subject Yang Jelas
* Gunakan Salam
* Selalu Pastikan Isi Pesan Jelas dan Mudah Dimengerti
* Terima Kasih
* Lampirkan Informasi Pendukung (Attach File)


','Let''s Begin<<-->>
*Desain Grafis
Adalah proses komunikasi menggunakan elemen visual, seperti tulisan, bentuk, dan gambar yang dimaksudkan untuk menciptakan persepsi akan suatu pesan yang disampaikan. Bidang ini melibatkan proses komunikasi visual. 

*Komunikasi Visual ialah sebuah rangkaian proses penyampaian informasi atau pesan kepada pihak lain dengan penggunaan media penggambaran yang hanya terbaca oleh indra penglihatan. Komunikasi visual menkombinasikan seni, lambang, tipografi, gambar, desain grafis, ilustrasi, dan warna dalam penyampaiannya.


','Peranan Dalam Pendidikan<<-->>
1.Mempercepat proses belajar mengajar dengan cara menyajikan suatu pelajaran dalam bentuk grafis, sehingga tidak hanya dalam bentuk teori saja tetapi sudah melihat bentuk dan simulasi. Bentuk mungkin termasuk penggambaran bidang, ruang, grafik, gambar kerangka manusia, komposisi tubuh manusia, dan sebagainya. 

2.Memperkenalkan dunia desain grafis kepada para siswa sehingga siswa dapat mengimplementasikannya di dalam lingkungannya. 

3.Memperkenalkan siswa pada aplikasi-aplikasi desain grafis. 

4.Mempersiapkan siswa agar dapat memahami dengan mudah pesan-pesan pembelajaran yang disampaikan dalam bentuk grafis



','Peranan Dalam Masyarakat<<-->>
1.Memudahkan Pemahaman Tentang Suatu Peraturan. Secara umum, desain grafis memang dibuat sebagai media komunikasi. Di beberapa lembaga maupun instansi yang memiliki sebuah peraturan atau tata tertib, penggunaan desain grafis digunakan untuk menyampaikan peraturan dalam bentuk visual sehingga diterima oleh masyarakat luas. 

2.Meningkatkan Daya Ingat, Mengingat pesan visual dengan desain grafis akan lebih terngiang dibandingkan dengan pesan suara maupun sebuah pesan tulisan. 

3.Menghilangkan Kejenuhan, Banyak orang yang tertarik dengan sebuah komunikasi yang disampaikan dengan sebuah desain grafis karena dirasa dapat menghilangkan kejenuhan, apabila komunikasi terlalu pasif dengan kebanyakan materi. 

4.Membuat Pikiran Fresh, Desain grafis, terutama yang memiliki konten humor dapat memudahkan masyarakat untuk menjadikan pikiran menjadi lebih fresh jika sebelumnya penat. 

5.Sumber Inspirasi, Banyaknya ragam desain yang dibuat oleh designer dalam desain grafis membuat orang lain akan ikut tertarik dengan desain yang mereka buat dan dapat mengembangkan kreativitas masing-masing.



',NULL,NULL,NULL,'Apa yang anda dapatkan di mata kuliah ini ? : <-> Nirmana <-> Jaringan <-> Kecerdasan Buatan <-> Videografi <<-->> Berapa persen bobot penilaian Tugas (Teori & Praktikum) ? <-> 35%  <-> 25% <-> 30% <-> 20% <<-->> Proses komunikasi menggunakan elemen visual, seperti tulisan, bentuk, dan gambar yang dimaksudkan untuk menciptakan persepsi akan suatu pesan yang disampaikan ? <-> Desain Grafis <-> Komunikasi Visual <-> Manfaat Pendidikan<-> Multimedia <<-->> Hadir tiap hari bukan berarti nilai anda bebas dari E <->T<<-->> Kejujuran harga mati! <->T<<-->> Selalu membawa penggaris selama perkuliahan <->F<<-->> Meningkatkan Daya Ingat merupakan peranan desain grafis dalam masyarakat <->T<<-->> Logo dan Branding akan dibahas pada perkuliahan ini <->T<<-->> Anda dapat menghubungi dosen pengajar kapanpun yang anda mau <->F<<-->> Komunikasi visual menkombinasikan seni, lambang, tipografi, gambar, desain grafis, ilustrasi, dan warna dalam penyampaiannya<->T',0,7);
INSERT INTO "lesson" VALUES (2,1,'Nirmana','Apa Itu Nirmana<<-->> Kata Nirmana berasal dari bahasa Jawa Kuna (Kawi) yang artinya Tanpa Angan-Angan, Rupa, ataupun Wujud. Kata Nirmana juga gabungan dari dua pemenggalan kata yaitu Nir (Tanpa) dan Mana (Bentuk). Secara harfiah, nirmana adalah penyusunan unsur seni rupa dan desain dengan menerapkan prinsip-prinsip seni dan desain untuk menghasilkan suatu karya yang memiliki nilai estetis



','Tujuan<<-->>
* Melatih kepekaan artistik
* Melatih keterampilan teknis berkesenian
* Melatih pemahaman bahasa seni
* Ekspresi diri


','Elemen<<-->>
* Titik
- Hasil sentuhan alat tulis yang menghasilkan bekas tanpa pergeseran

* Garis
- Hasil pergeseran alat tulis yang menghasilkan bekas

* Bidang
- Hasil persambungan garis yang menghasilkan dimensi panjang, lebar, dan luas

* Tekstur
- Nilai atau ciri khas suatu permukaan, seperti halus, kasar, buram, licin, keras, dan lunak

* Warna
- Sifat cahaya yang dipancarkan (Secara Fisik)
- Bagian dari pengalaman indra pengelihatan (Secara Psikologis)

* Ruang
- Bidang penempatan objek estetis


','Prinsip Nirmana<<-->>
* Unity
- Menjadi satu kesatuan yang utuh, setiap elemen saling mendukung

* Balance
- Keseimbangan menimbulkan rasa ketenangan, tidak menggelisahkan, tidak berat sebelah, dan enak dilihat

* Proportion
- Perbandingan dalam satu objek antara bagian dengan bagian yang lainnya sebanding

* Rythm
- Penataan irama perulangan dari bentuk visual

* Domination
- Dominasi, keunggulan, keistimewaan, keunikan, keganjilan dalam suatu karya visual membuat hal tersebut semakin menarik



',NULL,NULL,NULL,NULL,NULL,NULL,'Kata Nirmana berasal dari bahasa Jawa Kuna yang artinya? <-> Tanpa Rupa <-> Wujud <-> Keinginan <-> Surga <<-->> Nir artinya Tanpa, Mana artinya Bentuk<->T<<-->> Penyusunan unsur seni rupa dan desain dengan menerapkan prinsip-prinsip seni dan desain untuk menghasilkan suatu karya yang memiliki nilai estetis <-> Nirmana <-> Komunikasi Visual <-> Desain Grafis<-> Multimedia <<-->> Nirmana dapat melatih pemahaman bahasa asing <->F<<-->> Ekspresi diri dapat ditunjukkan melalui Nirmana <->T<<-->> Yang bukan Elemen Nirmana <-> Gradasi <-> Titik <-> Garis <-> Bidang <<-->> Yang bukan Prinsip Nirmana <-> Power <-> Unity <-> Balance <-> Rythm <<-->>Perbandingan dalam satu objek antara bagian dengan bagian yang lainnya sebanding <-> Proportion <-> Unity <-> Balance <-> Rythm<<-->>Menjadi satu kesatuan yang utuh, setiap elemen saling mendukung <-> Unity <-> Proportion <-> Balance <-> Rythm<<-->>Penataan irama perulangan dari bentuk visual<-> Rythm <-> Unity <-> Balance <-> Proportion',0,4);
INSERT INTO "lesson" VALUES (3,1,'Warna','Apa Itu Warna<<-->>Kesan yang diperoleh mata dari cahaya yang dipantulkan oleh benda-benda yang dikenainya.<<-->>Unsur paling cepat yang menimbulkan sensasi pada mata.Fenomena getaran  atau gelombang cahaya yang diterima oleh indra penglihatan.


','Macam-macam Warna<<-->>

# Roda Warna
Warna dibedakan dalam 3, yaitu:

- Warna Primer -> Merah, Kuning, Biru
Adalah warna-warna dasar, bukan percampuran dari warna apapun, pembentuk warna-warna lain

- Warna Sekunder -> Orange, Hijau, Ungu
Merupakan hasil percampuran dari dua warna primer

- Warna Tersier
Merupakan hasil percampuran dari dua warna sekunder


','Macam-macam Warna<<-->>

# Menurut Kejadiannya
Warna dibedakan dalam 2, yaitu:

- Warna Subtractive
Adalah warna yang berasal dari pigmen -> CMY (Cyan, Magenta, Yellow)

- Warna Additive
Adalah warna yang berasal dari cahaya (spektrum) -> RGB (Red, Green, Blue)


','Istilah Warna<<-->>

# HUE
Menunjukkan nama dari suatu warna

# VALUE
Nilai suatu warna yang terdiri dari urutan kecerahan

#CHROMA/INTENSITY
Kekuatan warna (cerah, suram, daya pancar, kemurnian)

#GAMUT
Rentang warna yang dapat ditampilkan


','Sifat Warna<<-->>

# Merah
Gairah, Cinta, Amarah

# Oranye
Energi, Kebahagiaan, Vitalitas

# Kuning
Kebahagiaan, Harapan, Keruntuhan

# Hijau
Awal Baru, Kelimpahan, Alam

# Biru
Tenang, Bertanggung Jawab, Kesedihan

# Ungu
Kreatifitas, Royalti, Kekayaan


',NULL,NULL,NULL,NULL,NULL,'Kesan yang diperoleh mata dari cahaya yang dipantulkan oleh benda-benda yang dikenainya <-> Warna <-> Nirmana <-> Desain <-> Sinar Matahari <<-->> Warna merupakan unsur paling cepat yang menimbulkan sensasi pada mata<->T<<-->>Warna orange termasuk warna? <-> Sekunder <-> Primer <-> Tersier<-> Subtractive <<-->> Warna hijau dicampur kuning menghasilkan warna biru keunguan <->T<<-->> Warna merah, hijau, biru adalah warna subtractive <->F<<-->> Hasil percampuran dari dua warna sekunder <-> Tersier <-> Primer <-> Subtractive <-> additive <<-->> Menunjukkan nama dari suatu warna <-> Hue <-> Value <-> Chroma <-> Gamut <<-->>Nilai suatu warna yang terdiri dari urutan kecerahan <-> Value <-> Hue <-> Chroma <-> Gamut<<-->>Rentang warna yang dapat ditampilkan <-> Gamut <-> Hue <-> Value <-> Chroma<<-->>Tenang, Bertanggung Jawab, Kesedihan<-> Biru <-> Merah <-> Kuning <-> Hijau',0,5);
INSERT INTO "lesson" VALUES (4,2,'Tipografi','Tipografi ?<<-->>

# Menurut KBBI 
Ilmu cetak, seni percetakan

# Secara harfiah
suatu ilmu dalam memilih, menata, dan menciptakan huruf, dengan mengatur penyebarannya pada ruang yang tersedia untuk menciptakan kesan-kesan tertentu


','Sejarah<<-->>

Johannes Gutenberg (Maiz, Jerman) berhasil membuat huruf cetak timah yang dapat digerakkan pada tahun 1455

','Pengelompokan Huruf<<-->>

# Menurut Kait (Serif)
- Huruf Serif
- Huruf Sans Serif

# Menurut Anatomi
- Roman
- Gothic
- Text
- Block
- Script
- Italic

','Serif<<-->>

* Memiliki garis-garis kecil pada ujung hamper semua letter. Posisi garis-garis berdiri horizontal terhadap badan baru


','Sans Serif<<-->>

* Huruf tanpa serif (garis kait), dalam bahasa Perancis Sans berarti tanpa
* Kemunculan huruf ini di akhir abad ke - 19 dari karya-karya seniman modernis


','Roman & Gothic<<-->>

# Roman
* Ciri-cirinya ketebalan huruf tidak sama. 
* Ada bagian yang tebal, sedangkan bagian yang lainnya lebih tipis

# Gothic
* Ciri-cirinya ketebalan huruf sama, baik pada bagian lurus maupun lengkung, stoke maupun bar


','Text & Italic<<-->>

# Text
* Ketebalan garis ringan
* Tidak memiliki wajah yang terlalu lebar
* Sering dipergunakan pada body text

# Italic
* Ketebalan garis ringan
* Tidak memiliki wajah yang terlalu lebar
* Sering dipergunakan pada body text

','Block<<-->>

* Ketebalan garis tebal dan mencolok
* Biasanya digunakan sebagai Headline dan Display
* Terdapat sisi unik dan sifat artistik pada bentuk hurufnya


','Script<<-->>

* Terinspirasi dari corak tulisan tangan
* Berkembang lebih luas menjadi freehand dengan berbagai corak

','Anatomi Baris<<-->>

# Leading
Menentukan seberapa besar jarak antar baris

# Tracking (Letter-Spacing)
Jarak antar huruf-huruf

# Kerning
Jarak antar huruf dalam sebuah kata, kalimat, atau paragraf

# Alignment
Pemerataan Kolom pada suatu Tulisan

','Suatu ilmu dalam memilih, menata, dan menciptakan huruf, dengan mengatur penyebarannya pada ruang yang tersedia untuk menciptakan kesan-kesan tertentu <-> Tipografi <-> Nirmana <-> Desain Grafis<-> Warna <<-->> Menurut Anatominya huruf dibedakan menjadi 2 yaitu Serif dan Sans Serif<->F<<-->>Johannes Gutenberg berhasil membuat huruf cetak timah yang dapat digerakkan pada tahun  <-> 1455 <-> 1555 <-> 1655<-> 1454 <<-->> Memiliki garis-garis kecil pada ujung hamper semua letter dan posisi garis-garis berdiri horizontal terhadap badan baru, adalah ciri-ciri dari font Serif<->T<<-->>Huruf Sans Serif muncul di akhir abad ke - 18 dari karya-karya seniman modernis <->F<<-->> Ketebalan huruf tidak sama, ada bagian yang tebal, sedangkan bagian yang lainnya lebih tipis  <-> Roman <-> Gothic <-> Text <-> Block <<-->> Ketebalan garis tebal dan mencolok, Biasanya digunakan sebagai Headline dan Display,Terdapat sisi unik dan sifat artistik pada bentuk hurufnya <-> Block <-> Script <-> Gothic <-> Roman <<-->>Terinspirasi dari corak tulisan tangan <-> Script <-> Italic <-> Block <-> Roman<<-->>Jarak antar huruf dalam sebuah kata, kalimat, atau paragraf<-> Kerning <-> Tracking <-> Leading <-> Alignment<<-->>Menentukan seberapa besar jarak antar baris<-> Leading <-> Kerning <-> Tracking <-> Alignment',0,10);
INSERT INTO "lesson" VALUES (5,2,'Simbol dan Icon','Ikon<<-->>

Merupakan sebuah tanda yang dibuat dengan kesamaan pada referensinya atau acuannya



','Simbol<<-->>

Tanda yang mewakili objek sesuai dengan kesepakatan sosial atau tradisi yang bersifat arbitrer dan konvensional


','Perbedaan<<-->>

* Bentuk Ikon dapat menggambarkan maknanya secara langsung
* Simbol bisa saja tidak sesuai


','Adobe Illustrator<<-->>

# Pengertian
Adobe Illustrator adalah software editor untuk mengolah vector image

# Software Sejenis
Corel Draw, Inkscape, Vectr


','Raster & Vector<<-->>

#Raster
~>Berbasis piksel
~>Cocok untuk foto
~>Dimensi besar + Gambar  detail = Ukuran file besar
~>Format gambar: jpg, gif, png, tif, bmp, psd, eps, pdf

#Vector
~>Berbasis bentuk dari perhitungan matematis
~>Cocok untuk membuat logo, symbol, ikon, gambar, ilustrasi
~>Dapat diskalakan ke ukuran yang lebih beragam tanpa mengurangi kualitas
~>Dimensi besar dapat disimpan dengan ukuran kecil
~>Dapat diubah ke raster
~>Format gambar: ai, cdr, svg, eps, pdf, yang berasal dari vektor


',NULL,NULL,NULL,NULL,NULL,'Sebuah tanda yang dibuat dengan kesamaan pada referensinya atau acuannya <-> Ikon <-> Simbol <-> Warna <-> Nirmana <<-->>Bentuk simbol dapat menggambarkan maknanya secara langsung<->F<<-->>Tanda yang mewakili objek sesuai dengan kesepakatan sosial atau tradisi yang bersifat arbitrer dan konvensional <-> Simbol <-> Ikon <-> Warna<-> Nirmana <<-->> Dapat diskalakan ke ukuran yang lebih beragam tanpa mengurangi kualitas, adalah salah satu ciri Vektor <->T<<-->> Dimensi besar + Gambar  detail = Ukuran file besar, adalah salah satu ciri Vektor <->F<<-->> Software editor untuk mengolah vector image, kecuali <-> Numbers <-> Vectr <-> Adobe Illustrator <-> Corel Draw <<-->> Berikut ini adalah format gambar dari raster, kecuali<-> Exe <-> Jpg <-> Png <-> bmp <<-->>Vektor sangat cocok untuk membuat logo, symbol, ikon, gambar, ilustrasi <->T<<-->>Dimensi besar dapat disimpan dengan ukuran kecil, adalah salah satu ciri Vektor <->T<<-->>Raster sangat cocok untuk foto <->T',0,5);
INSERT INTO "lesson" VALUES (6,2,'Logo','Apa Itu Logo ?<<-->>

# Bahasa Yunani ~> Logos
Artinya: Kata, Pikiran, Pembicaraan, Akal Budi

# Berdasarkan KBBI
Logo / lo-go merupakan huruf atau lambang yang mengandung makna, terdiri atas satu kata atau lebih sebagai lambang atau nama perusahaan dan sebagainya


','Fungsi<<-->>

*Identitas Diri
*Tanda Kepemilikan
*Tanda Jaminan Kualitas
*Mencegah Peniruan / Pembajakan','Pengelompokan Logo<<-->>

#Logogram
Terdiri dari bentuk gambar

#Logotype
Terdiri dari bentuk tulisan

#Logogram dan Logotype
#Logogram sekaligus Logotype

','Logogram<<-->>

','Logotype<<-->>

','Logogram dan Logotype<<-->>

','Logogram sekaligus Logotype<<-->>

','Prinsip Logo<<-->>

1.Keep It Simple
2.Memorable (Mudah diingat)
3.Timeless (Tidak Lekang oleh waktu)
4.Versatile (Serbaguna, bisa digunakan diberbagai media)
5.Appropriate (Memiliki hubungan atau relevan)


','Tahap Pembuatan Logo<<-->>

1.Briefing
2.Riset
3.Membuat Konsep
4.Feedback & Review
5.Presentasi


','Kekuatan Logo<<-->>


# Corporate Identity
Merupakan pedoman bagi perusahaan dalam menerapkan konsistensi identitas

','Huruf atau lambang yang mengandung makna, terdiri atas satu kata atau lebih sebagai lambang atau nama perusahaan dan sebagainya <-> Logo <-> Simbol <-> Ikon <-> Tipografi <<-->> Logo berasal dari kata Logos dalam bahasa yunani yang artinya pikiran<->T<<-->>Yang bukan fungsi dari Logo <-> Mempermudah Pembajakan <-> Identitas Diri <-> Tanda Kepemilikan<-> Tanda Jaminan Kualitas <<-->> Terdiri dari bentuk gambar merupakan Logogram <->T<<-->> Serbaguna, bisa digunakan diberbagai media, adalah pengertian Versatile <->T<<-->> Tidak lekang oleh waktu, adalah pengertian Memorable <->F<<-->> Yang bukan prinsip logo <-> Balance <-> Timeless <-> Versatile <-> Memorable <<-->> Berikut merupakan tahapan pembuatan logo, kecuali <-> Material Collecting <-> Briefing <-> Research <-> Feedback & Review <<-->>Merupakan pedoman bagi perusahaan dalam menerapkan konsistensi identitas <-> Corporate Identity <-> Corporate Value <-> Corporate Principal <-> Corporate Goals<<-->>Tahapan Pembuatan Logo setelah tahap riset selesai dilakukan adalah <-> Membuat Konsep <-> Feedback & Review <-> Presentasi <-> Briefing',0,10);
INSERT INTO "lesson" VALUES (7,3,'Layout','Apa Itu Layout<<-->>

~>Layout = Tata Letak

~>Layout adalah tata letak elemen-elemen desain dalam media untuk menyampaikan informasi atau pesan



','Layout Media Cetak<<-->>

*Poster
*Brosur
*Flier
*Leaflet
*Kartu Nama
*Kop Surat
*Amplop
*Booklet
*Buku
*Majalah
*Surat Kabar
*Tabloid


','Kertas Internasional<<-->>

#Seri A
*A0 = 84,1 x 118,9 cm
*A1 = 59,4 x 84,1 cm
*A2 = 42,0 x 59,4 cm
*A3 = 29,7 x 42,0 cm
*A3+ = 31,8 x 48,0 cm
*A4 = 21,0 x 29,7 cm
*A5 = 14,8 x 21,0 cm
*A6 = 10,5 x 14,8 cm
*A7 = 7,4 x 10,5 cm
*A8 = 5,2 x 7,4 cm
*A9 = 3,7 x 5,2 cm
*A10 = 2,6 x 3,7 cm

#Seri B
*B0 = 100 x 141,4 cm
*B1 = 70,7 x 100 cm
*B2 = 50 x 70,7 cm
*B3 = 35,3 x 50 cm
*B4 = 25 x 35,3 cm
*B5 = 17,6 x 25 cm
*B6 = 12,5 x 17,6 cm
*B7 = 8,8 x 12,5 cm
*B8 = 6,2 x 8,8 cm
*B9 = 4,4 x 6,2 cm
*B10 = 3,1 x 4,4 cm

#Seri C - Seri Amplop
*C0 = 100 x 141,4 cm
*C1 = 70,7 x 100 cm
*C2 = 50 x 70,7 cm
*C3 = 35,3 x 50 cm
*C4 = 25 x 35,3 cm
*C5 = 17,6 x 25 cm
*C6 = 12,5 x 17,6 cm
*C7 = 8,8 x 12,5 cm
*C8 = 6,2 x 8,8 cm
*C9 = 4,4 x 6,2 cm
*C10 = 3,1 x 4,4 cm

#Seri Lainnya
*Legal = 21,6 x 35,6 cm
*F4 / Folio = 21,5 x 33 cm
*Letter / Kuarto = 21,6 x 27,9 cm


','Prinsip Layout<<-->>

1.Sequence
2.Emphasis
3.Balance
4.Unity


','Sequence<<-->>

-Urutan / Alur / Flow
-Memudahkan pembaca mengurutkan pandangan matanya pada layout


','Emphasis<<-->>

-Bisa dibentuk melalui kontras
-Menciptakan kontras bisa melalui ukuran, posisi, warna dan bentuk


','Balance<<-->>

#Balance Simetris
Bisa dibuktikan secara sistematis

#Balance Asimetris
Bersifat optic


','Unity<<-->>

-Kesatuan antara elemen fisik dan non fisik
-Fisik terlihat secara visual
-Non fisik merupakan pesan dan konsep dalam desain


',NULL,NULL,'Tata letak elemen-elemen desain dalam media untuk menyampaikan informasi atau pesan <-> Layout <-> Logo <-> Nirmana <-> Tipografi <<-->> Satu A3 digabung dengan dua A5 dan satu A4, menjadi? <-> A2 <-> A3 <-> A4 <-> A1 <<-->> Tiga A5 digabung dengan dua A7 dan satu A6, menjadi? <-> A3 <-> A2 <-> A1 <-> A4 <<-->> Dua A3 digabung dengan  tiga A6, dua A4, dua A5 dan dua A7, menjadi? <-> A1 <-> A2 <-> A3 <-> A4 <<-->> Dua A4 menjadi?  <-> A3 <-> A2 <-> A1 <-> A4 <<-->> Memudahkan pembaca mengurutkan pandangan matanya pada layout <-> Sequence <-> Emphasis <-> Balance <-> Unity <<-->>Menciptakan kontras bisa melalui ukuran, posisi, warna dan bentuk <-> Emphasis <-> Sequence <-> Balance <-> Unity <<-->> Bisa dibuktikan secara sistematis <-> Balance Simetris <-> Balance Asimetris <-> Sequence <-> Unity <<-->>Balance yang bersifat optic <-> Balance Asimetris <-> Balance Simetris <-> Sequence <-> Unity <<-->>Kesatuan antara elemen fisik dan non fisik<->Unity <-> Emphasis <-> Balance <-> Sequence',0,8);
INSERT INTO "lesson" VALUES (8,3,'Advertising','Periklanan<<-->>

Iklan adalah pesan yang menawarkan suatu produk atau jasa yang ditunjukkan kepada masyarakat lewat suatu media

Periklanan adalah suatu usaha manusia dalam memberikan informasi tentang suatu produk atau jasa kepada manusia lainnya

','Komponen Periklanan<<-->>

1.Advertiser (Pengiklan)
2.Produsen (Pemrakarsa)
3.Iklan
4.Masyarakat / Audience


Peran Desain Grafis dalam Periklanan:

1.Informasi
2.Identitas
3.Edukasi
4.Rekreatif
5.Persuasif


','Informasi<<-->>

Menyampaikan pesan:
- secara jelas dan jernih
- mudah dipahami, tidak menyesatkan
Contoh penerapannya pada desain rambu lalu lintas, desain rambu gedung (signage) di bandara, peta, diagram, dan infographic

Fyi,
Di barat, desainer grafis yang mengkhususkan diri di bidang ini menyebutnya sebagai information architect, sedangkan disiplin ilmunya adalah information graphic. Dimotori oleh Richard Saul Wurman.

','Identitas<<-->>

Menciptakan sesuatu yang memiliki karakter / kepribadian unik sehingga ia diingat dan dikenal, bahkan disukai orang. Proses desainnya bisa dilakukan dengan menunjukkan / mencari ciri khas perusahaan itu, atau menciptakan suatu image baru.','Edukasi<<-->>


Educare berarti menarik keluar dari ketidaktahuan menjadi tahu, dari acuh menjadi peduli. Coba hapus peran edukasi desain grafis ini, maka kita akan mendapati betapa membosankannya membaca buku pelajaran, betapa melelahkannya belajar, betapa lambatnya kita belajar.

','Rekreatif<<-->>

Desain grafis dapat pula sekedar menyenangka, menyejukkan mata, mengakrabkan suasana atau memperindah lingkungan. Kritikus desain grafis terkemuka Steven Heller menyebutnya sebagai Entertainment Graphics.

','Persuasif<<-->>

Di sini gambar dan huruf dimanfaatkan untuk mengajak secara halus para audience agar mengikuti suatu gagasan tertentu yang disampaikan. Iklan jasa dan Iklan layanan masyarakat contohnya, karena bukanlah suatu produk jadi yang bisa dilihat dan dirasakan secara langsung, audience perlu diberi pengertian dan keyakinan kenapa harus memilih/mengikuti iklan layanan tersebut.

','Media Periklanan<<-->>

1.Media Cetak

~>Sifat:
Statis, menggunakan visual ilustrasi dan text

~>Contoh:
*Surat Kabar/Koran	*Leaflet	
*Majalah		*Brosur
*Poster		*Advetorial
*Billboard		*Sandwich Board
*Spanduk		*Banner
*Umbul-umbul		*Voucher
*Neon Sign		*Neon Box
*Sign System

2. Media Elektronik
~>Sifat:
Dinamis, penggabungan antara penglihatan suara dan gerak, cepat berlalu, entertainment, daya jangkau luas

~>Contoh:
*Televisi		*Internet
*Film		*Handphone
*Radio		*Electronic Billboard

3. Media Pertunjukan
~>Sifat:
Menarik, menghibur, waktu terbatas, jangkauan terbatas, tepat sasaran, lebih dekat dengan audience, interaktif, media pendukung yang bervariatif

~>Contoh:
*Pawai
*Live Konser
*Event


','Ambient Media<<-->>

Merupakan salah satu bentuk new media dalam beriklan. Ambient media memiliki cara bertutur yang berbeda dengan iklan konvensional. Semangat yang dibawa oleh ambient media adalah memberikan pengalaman yang tidak terlupakan (memorable experience) kepada konsumen.




','Jenis-Jenis Iklan<<-->>

1.Menekankan pada produk yang ditawarkan
Contoh:
*Price Advertising
*Brand Advertising
*Quality Advertising
*Product Advertising
*Prestige Advertising
*Institusional Advertising

2.Menekankan pada teknik penyampaian
*Introduction Advertising
*Iklan Musiman
*Remainder Advertising
*Collective Advertising
*Advetorial Advertising

3.Menekankan pada sisi visual
*Faktor Kelembutan dan Kelucuan
*Faktor Kejelekan
*Faktor Kebosanan
*Faktor Kontras


','Pesan yang menawarkan suatu produk atau jasa yang ditunjukkan kepada masyarakat lewat suatu media <-> Iklan <-> Tayangan <-> Informasi <-> Desain <<-->> Suatu usaha manusia dalam memberikan informasi tentang suatu produk atau jasa kepada manusia lainnya<-> Periklanan <-> Percetakan <-> Pengumuman <-> Tayangan <<-->> Yang bukan komponen periklanan  <-> Aktor <-> Audience <-> Produsen <-> Iklan <<-->> Yang bukan peran desain grafis dalam periklanan <-> Absurd <-> Informasi <-> Identitas <-> Edukasi <<-->>Desainer grafis yang mengkhususkan diri di bidang informasi  <-> Information Architect <-> Informationology <-> Information Graphic <-> Informer <<-->> Menciptakan sesuatu yang memiliki karakter / kepribadian unik sehingga ia diingat dan dikenal, bahkan disukai orang <-> Identitas <-> Informasi <-> Rekreatif <-> Persuasif <<-->>Dinamis, penggabungan antara penglihatan suara dan gerak, cepat berlalu, entertainment, daya jangkau luas <-> Media Cetak <-> Media Elektronik <-> Ambient Media <-> Media Pertunjukan <<-->> Semangat yang dibawa adalah memberikan pengalaman yang tidak terlupakan (memorable experience) kepada konsumen <-> Ambient Media <-> Media Elektronik <-> Media Cetak <-> Media Pertunjukan <<-->>Menekankan pada produk yang ditawarkan <-> Brand Advertising <-> Introduction Advertising <-> Collective Advertising <-> Advetorial Advertising <<-->>Menekankan pada sisi visual<->Faktor Kontras <-> Iklan Musiman <-> Product Advertising <-> Prestige Advertising',0,10);
INSERT INTO "lesson" VALUES (9,4,'Desain Karakter','Skill Menggambar<<-->>Balita Skill','Skill Menggambar<<-->>Medium Skill','Skill Menggambar<<-->>Master Skill','Inspirasi<<-->>

Peter Sohn, Direktur Pixar adalah referensi untuk Russell pada film ''Up''

','Simplicity<<-->>

Semua yang ada di dunia ini memiliki bentuk dasar. Mulailah dari menyederhanakan objek (simplify)


','Personality<<-->>



','Unik<<-->>


','Referensi<<-->>

','Referensi<<-->>

','Referensi<<-->>

','Direktur Pixar yang menjadi referensi untuk Russell pada film ''Up <-> Peter Sohn <-> Peter John <-> Andrew Stanton <-> John Lasseter <<-->> Dibawah ini yang bukan unsur Desain Grafis adalah <-> Step <-> Line <-> Texture <-> Space <<-->> Segala cara pengungkapan dan perwujudan dalam bentuk huruf, tanda, dan gambar yang diperbanyak melalui proses percetakan guna disampaikan kepada khalayak <-> Grafika <-> Desain Grafis <-> Desain <-> Pemodelan <<-->> Proses untuk membuat dan menciptakan obyek baru <-> Desain <-> Grafika <-> Desain Grafis <-> Pemodelan <<-->> Membentuk suatu benda-benda atau obyek  <-> Pemodelan <-> Grafika <-> Desain <-> Desain Grafis <<-->> suatu bentuk komunikasi visual yang menggunakan gambar untuk menyampaikan informasi atau pesan seefektif mungkin <-> Desain Grafis <-> Desain <-> Pemodelan <-> Grafika <<-->>Unsur penting dalam obyek desain yang dapat menampilkan identitas, pesan dan membedakan sifat dari bentuk-bentuk visual secara jelas <-> Warna <-> Ruang <-> Ukuran <-> Bentuk <<-->> Bentuk dasar yang biasa dikenal orang <-> Semua Benar <-> Segitiga <-> Persegi <-> Lingkaran <<-->>Tampilan permukaan (corak) dari suatu benda yang dapat dinilai dengan cara dilihat atau diraba <-> Tekstur <-> Garis <-> Ruang <-> Warna <<-->>Jarak antara suatu bentuk dengan bentuk lainnya, pada praktek desain dapat dijadikan unsur untuk memberi efek estetika desain dan dinamika desain grafis<->Ruang <-> Bentuk <-> Warna <-> Ukuran',0,10);
INSERT INTO "lesson" VALUES (10,4,'Ilustrasi','Ilustrasi ?<<-->>

Merupakan penggambaran visual tentang sebuah kegiatan atau peristiwa yang disaksikan secara langsung maupun hasil dari imajinasi.

Teknik pembuatan ilustrasi: menggambar, sketsa, melukis, dan memotret.

','One Point Perspective<<-->>

','One Point Perspective<<-->>

','One Point Perspective<<-->>

','Two Points Perspective<<-->>

','Two Points Perspective<<-->>

','Two Points Perspective<<-->>

','Triangle Perspective<<-->>

','Triangle Perspective<<-->>

','Triangle Perspective<<-->>

','Penggambaran visual tentang sebuah kegiatan atau peristiwa yang disaksikan secara langsung maupun hasil dari imajinasi <-> Ilustrasi <-> Nirmana <-> Desain Grafis <-> Simbol <<-->> Teknik pembuatan ilustrasi, kecuali <-> Membaca <-> Menggambar <-> Sketsa <-> Memotret <<-->> Gambar prespektif yang terjadi saat sebuah objek dilihat dengan garis pusat pandangan tegak lurus terhadap salah satu permukaannya<-> One Point Perspective <-> Two Points Perspective <-> Triangle Perspective <-> Quadran Perspective <<-->> Penggambaran pada sebuah objek yang terlihat pada sebuah dua titik sudut pandang mata atau yang terlihat dari sebelah kanan dan kiri sudut garis penglihatan <-> Two Points Perspective <-> One Point Perspective <-> Quadran Perspective <-> Triangle Perspective <<-->> Biasanya hanya dipakai untuk menggambarkan sesuatu yang sangat luas, besar, dan tinggi dan secara visual mengalami distorsi yang sangat ekstrem <-> Triangle Perspective <-> Two Points Perspective <-> One Point Perspective <-> Quadran Perspective <<-->> Yang merupakan salah satu unsur gambar ilustrasi <-> Manusia <-> Alam <-> Batu <-> Bebas <<-->>Salah satu fungsi gambar ilustrasi <-> Menjelaskan suatu peristiwa <-> Hanya tambahan <-> Menambah kesan suatu gambar <-> Salah Semua <<-->> Kata Ilustrasi berasal dari bahasa Inggris yaitu Illustration yang artinya? <-> Foto <-> Tambahan <-> Latar <-> Hiasan <<-->>Untuk dapat menggambar tokoh manusia yang baik kita perlu mengetahui dan menguasai proporsi dan anatomi tubuh manusia<->T<<-->> Realis artinya gambar dibuat sesuai dengan keadaan yang sebernarnya, baik proporsi maupun anatomi dibuat sama menyerupai dengan objek yang di gambar<->T',0,10);
INSERT INTO "course" VALUES (1,'Part 1 - 3 😄');
INSERT INTO "course" VALUES (2,'Part 4 - 6 😍');
INSERT INTO "course" VALUES (3,'Part 7 - 8 😄');
INSERT INTO "course" VALUES (4,'Part 9 - 10 😦');
COMMIT;
