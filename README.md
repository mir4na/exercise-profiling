# JMETER GUI

<b>/all-student-name</b>
![image](https://github.com/user-attachments/assets/d69eb446-711d-4b95-934b-3e81cd98fe88)
![image](https://github.com/user-attachments/assets/ed92f0bc-16ef-48c3-a4d8-6adcc2ab785b)
![image](https://github.com/user-attachments/assets/6093e74c-d553-4914-80e9-da01fcf1888f)
![image](https://github.com/user-attachments/assets/b1ea90e8-d087-4f45-aaff-b2c61b90712a)

<b>/highest-gpa</b>
![image](https://github.com/user-attachments/assets/6e3ea7d7-f5f4-44f2-b7c1-f7c3def823e9)
![image](https://github.com/user-attachments/assets/cc151d49-20dc-4678-be49-471ea38e74a8)
![image](https://github.com/user-attachments/assets/f4cc99af-9a88-4539-a6c1-dbe0c5cc6929)
![image](https://github.com/user-attachments/assets/f41f44e3-9d6b-4431-a202-92c7ebc95f11)

# JMETER CLI

<b>/all-student-name</b>
![image](https://github.com/user-attachments/assets/541be116-0681-4235-b90a-6b272ac31a3b)
![image](https://github.com/user-attachments/assets/7aa67c52-bf03-4877-9ae6-c7a4447d8d6a)

<b>/highest-gpa</b>
![image](https://github.com/user-attachments/assets/f271dee1-14e2-4e6b-9b23-9c149f348630)
![image](https://github.com/user-attachments/assets/f074f07d-65f5-4a5f-8b95-e6194e6307e7)

# Reflection

1. What is the difference between the approach of performance testing with JMeter and profiling with IntelliJ Profiler in the context of optimizing application performance?

JMeter berfokus pada pengujian beban dan kinerja aplikasi secara keseluruhan dengan mensimulasikan banyak pengguna dan permintaan bersamaan sehingga memberikan hasil berupa metrik eksternal seperti throughput dan waktu respons, sementara IntelliJ Profiler berfokus pada analisis internal kode aplikasi dengan melacak penggunaan memori, penggunaan CPU, dan panggilan metode yang memungkinkan pengembang untuk mengidentifikasi metode atau baris kode yang menjadi sumber masalah kinerja sehingga kedua alat ini saling melengkapi. Sederhananya, JMeter mengidentifikasi masalah kinerja tingkat tinggi dan IntelliJ Profiler membantu menemukan penyebab dasarnya di tingkat kode.

2. How does the profiling process help you in identifying and understanding the weak points in your application?

Proses profiling membantu mengidentifikasi dan memahami titik lemah dalam aplikasi dengan mengumpulkan data rinci tentang penggunaan sumber daya seperti CPU, memori, dan aktivitas thread selama eksekusi aplikasi, menampilkan metode yang menghabiskan waktu paling banyak (hotspots), menganalisis alokasi memori yang berlebihan, mendeteksi kebocoran memori, dan menyediakan grafik panggilan yang memvisualisasikan hubungan antara metode sehingga pengembang dapat dengan tepat menentukan bagian kode mana yang perlu dioptimalkan, bukan hanya menebak atau melakukan perubahan acak.

3. Do you think IntelliJ Profiler is effective in assisting you to analyze and identify bottlenecks in your application code?

IntelliJ Profiler sangat efektif dalam membantu menganalisis dan mengidentifikasi bottleneck dalam kode aplikasi karena terintegrasi langsung dengan IDE yang memudahkan navigasi antara hasil profiling dan kode sumber, menyediakan visualisasi yang jelas tentang hotspots CPU, alokasi memori berlebihan, dan hubungan panggilan antar metode, mendukung berbagai jenis profiling (CPU, memori, thread), memungkinkan profiling selektif untuk bagian kode tertentu, dan menawarkan kemampuan untuk membandingkan hasil profiling dari berbagai eksekusi sehingga pengembang dapat dengan cepat mengidentifikasi masalah performa spesifik dan langsung menuju ke kode sumber yang bermasalah.

4. What are the main challenges you face when conducting performance testing and profiling, and how do you overcome these challenges?

Tantangan utama dalam melakukan performance testing dan profiling meliputi kesulitan menyiapkan lingkungan pengujian yang akurat mencerminkan produksi, overhead yang ditimbulkan oleh alat profiling yang dapat mempengaruhi hasil, kesulitan menginterpretasikan data profiling yang kompleks, tantangan dalam mereproduksi masalah performa yang terjadi pada kondisi tertentu, dan kesulitan menentukan target kinerja yang realistis; saya mengatasi tantangan-tantangan ini dengan membuat lingkungan pengujian yang semirip mungkin dengan produksi, menggunakan profiling selektif untuk mengurangi overhead, mengembangkan kemampuan analisis data profiling dengan pelatihan dan pengalaman, mencatat kondisi di mana masalah performa terjadi secara detail, dan mendefinisikan metrik kinerja yang jelas berdasarkan kebutuhan bisnis dan ekspektasi pengguna.

5. What are the main benefits you gain from using IntelliJ Profiler for profiling your application code?

Manfaat utama menggunakan IntelliJ Profiler untuk profiling kode aplikasi mencakup integrasi langsung dengan IDE yang memudahkan navigasi antara hasil profiling dan kode sumber, visualisasi yang jelas dan intuitif tentang hotspots CPU dan alokasi memori, kemampuan untuk melihat call tree yang detail untuk memahami jalur eksekusi, dukungan untuk berbagai jenis profiling seperti CPU, memori, dan thread, fitur untuk membandingkan hasil profiling sebelum dan sesudah optimasi, kemampuan untuk memfilter hasil profiling untuk fokus pada area yang relevan, dan kemampuan untuk melakukan profiling selektif yang mengurangi overhead dan memungkinkan analisis yang lebih tepat pada bagian kode tertentu.

6. How do you handle situations where the results from profiling with IntelliJ Profiler are not entirely consistent with findings from performance testing using JMeter?

Saat menghadapi hasil profiling dari IntelliJ Profiler yang tidak sepenuhnya konsisten dengan temuan dari performance testing menggunakan JMeter, saya biasanya mengambil pendekatan analitis dengan memahami bahwa kedua alat mengukur aspek performa yang berbeda (IntelliJ Profiler berfokus pada performa internal kode sementara JMeter mengukur performa sistem secara keseluruhan), mengidentifikasi faktor eksternal yang mungkin mempengaruhi kinerja aplikasi seperti latensi jaringan atau performa database yang tidak tertangkap oleh profiler, melakukan pengujian tambahan dengan skenario yang lebih terkontrol untuk mengisolasi variabel, dan menggunakan alat diagnostik tambahan seperti monitoring database atau network analyzer untuk mendapatkan pemahaman komprehensif tentang masalah performa.

7. What strategies do you implement in optimizing application code after analyzing results from performance testing and profiling? How do you ensure the changes you make do not affect the application's functionality?

Setelah menganalisis hasil dari performance testing dan profiling, saya mengimplementasikan beberapa strategi optimasi seperti yang terlihat pada contoh kode: mengganti penggunaan Autowired dengan dependency injection melalui konstruktor yang lebih efisien, mengoptimalkan query database dengan memanfaatkan metode findAll() langsung dari repository daripada melakukan pemrosesan tambahan yang tidak perlu, mengganti concatenation string dengan StringBuilder yang lebih efisien untuk menghindari alokasi string berulang, menggunakan struktur data yang lebih efisien, menerapkan penanganan kasus khusus seperti daftar kosong, dan memastikan perubahan tidak mempengaruhi fungsionalitas dengan menerapkan pengujian otomatis yang komprehensif sebelum dan sesudah optimasi untuk memverifikasi bahwa perilaku aplikasi tetap konsisten.
