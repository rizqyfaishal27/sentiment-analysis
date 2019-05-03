# sentiment-analysis

Proyek Text Analytics - Mata kuliah Analitika Media Sosial

Cara menjalankan program:

1. Buka jupyter-notebook
2. Membuka file Preprocessing.ipynb
3. Jalankan dari atas sampai selesai, nanti akan mengenerate file tdp.csv, tdp_tester.csv, tambahan_preprocess.csv yang akan digunakan pada script NaiveBayes-TFIDF.ipynb
4. Jalankan script NaiveBayes-TFIDF.ipynb sampai selesai dan akan mengashilkan file results20.csv yang siap diupload di online evaluation.

NOTE (bisa di skip karena datanya sudah saya generate):
- Beberapa step di prprocessing ada sedikit kerumitan saat menjalankan Formalizer dari library InaNLP, sehingga terdapat step dimana
 mengeksport train_data_normalized.csv dan tester_data_normalized.csv serta tambahan_data_normalized.csv untuk dilakukan formalized oleh Formalizer dari InaNLP
- Code java untuk Formalizer terdapat di folder Formlizer
- Setelah dijalankan formalizer hasil dari running tersebut diimport kembali ke script preprocessing

NOTE2:
- train_data_preprocessed.csv, tester_data_preprocessed.csv, tambahan_preprocess.csv merupakan data yang sudah di preprocess karena process perprocessingnya cukup lama dan memakan banyak memory
- sehingga langsung bisa digunakan saja yang sudah tergenerate dengan menggunakan script NaiveBayes-TFIDF
