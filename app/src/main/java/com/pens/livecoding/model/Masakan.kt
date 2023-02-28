package com.pens.livecoding.model

import android.os.Parcelable
import com.pens.livecoding.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class Masakan(
    val imgMasakan: Int,
    val namaMasakan: String,
    val daerah: String,
    val description: String
): Parcelable
val masakanList: List<Masakan> = listOf(
    Masakan(
        imgMasakan = R.drawable.sotolamongan,
        namaMasakan = "Soto Lamongan",
        daerah = "Lamongan",
        description = "Soto Lamongan adalah sajian makanan soto ayam yang khas dari daerah Lamongan, Jawa Timur.\n" +
                "\n" +
                "Salah satu ciri khas dari Soto Lamongan ini terletak pada serbuk krupuk udangnya yang sering disebut koya atau poya.\n" +
                "\n" +
                "Soto Lamongan memiliki kuah yang sedikit kuning dengan rasa ayam yang sangat terasa.\n" +
                "\n" +
                "Selain itu, Soto Lamongan juga memiliki isi seperti suwiran daging ayam, daun bawang, telur dan bahan lainnya membuat Soto Lamongan ini sangat kaya akan rasa.\n" +
                "\n" +
                "Berkat rasa gurih yang mudah diterima oleh berbagai lapisan masyarakat, maka Soto Lamongan saat ini sudah tersebar di berbagai wilayah di Indonesia.\n" +
                "\n" +
                "Soto Lamongan mudah ditemui di berbagai tempat mulai dari pedagang kaki lima, warung pinggir jalan, di gang-gang perumahan, pedagang keliling, restoran hingga hotel."
    ),
    Masakan(
        imgMasakan = R.drawable.sotomadura,
        namaMasakan = "Soto Madura",
        daerah = "Madura",
        description = "Soto Madura adalah salah satu kuliner yang punya cita rasa menyegarkan dan sangat menggugah selera siapa pun yang melihatnya. Serupa dengan Sate Madura, makanan khas dari salah satu pulau di Jawa Timur ini sangat populer di masyarakat.  \n" +
                "\n" +
                "Bahkan, tidak sedikit juga orang-orang luar negeri yang sudah mengetahui nikmatnya makanan dengan kuah soto ini. Salah satu buktinya adalah keberadaan soto ini dalam menu utama di Bintang Cafe, Albany Highway, Victoria Park, Australia.  \n" +
                "\n" +
                "Selain di luar negeri, masyarakat juga bisa menikmati di berbagai daerah, tidak hanya Madura. Bukan itu saja, masyarakat juga bisa mencicipi soto ini dalam beberapa varian, apa saja itu? Yuk, simak informasi selengkapnya mengenai soto khas Madura, di bawah ini, ya. ",
    ),
    Masakan(
        imgMasakan = R.drawable.cotomakasar,
        namaMasakan = "Coto Makasar",
        daerah = "Makasar",
        description = "Coto Makassar adalah makanan tradisional dari Sulawesi Selatan. \n" +
                "\n" +
                "Coto Makassar sekilas seperti sup daging. Makanan ini berupa rebusan jeroan bercampur daging sapi yang diiris-iris lalu dibumbui dengan racikan bumbu khusus. \n" +
                "\n" +
                "Coto Makassar memiliki cita rasa gurih yang berasal dari rebusan daging, jeroan, dan rempah-rempah. \n" +
                "\n" +
                "Coto Makassar biasa dinikmati dengan ketupat yang dibungkus dengan daun kelapa dan buras atau burasa, yaitu sejenis ketupat yang dibungkus daun pisang. \n" +
                "\n" +
                "Burasa terbuat dari beras yang dicampur santan dan diberi sedikit garam, lalu dibungkus dengan daun pisang dan diikat secara khusus kemudian dikukus. \n" +
                "\n" +
                "Makanan yang terdapat di sejumlah jalan protokol maupun pusat perbelanjaan di Sulawesi Selatan ini telah dikenal sejak dulu kala.\n",
    ),
    Masakan(
        imgMasakan = R.drawable.rawon,
        namaMasakan = "Rawon",
        daerah = "Ponorogo",
        description = "Rawon adalah makanan tradisional yang sangat terkenal di Jawa Timur. Makanan tersebut  berupa sup daging dengan kuah yang berwarna hitam. Kenikmatan pada rawon terletak pada rasa dan aroma nya yang kuat berempah. Berbicara masalah kenikmatan rawon, ada bumbu khas yang mendominasi aroma, warna, dan cita rasanya. Dia adalah kluwak. Kluwak adalah pohon yang tumbuh liar atau setengah liar penghasil bahan bumbu masak sejumlah masakan Nusantara. Kluwak yang digunakan adalah kluwak yang sudah difermentasi, sehingga dagingnya berwarna hitam. Penggunaan jumlah kluwak yang bervariasi dalam bumbu rawon disebabkan adanya perbedaan selera dari penikmat. Ada orang yang menyukai rawon yang encer sehingga ditambahkan sedikit kluwak dalam pembuatan rawon, akan tetapi ada orang yang menyukai rawon yang pekat dengan penambahan kluwak dalam jumlah banyak.",
    ),
    Masakan(
        imgMasakan = R.drawable.satepadang,
        namaMasakan = "Sate Padang",
        daerah = "Padang",
        description = "Konon menurut sejarahnya, sate Padang ternyata sudah ada sejak zaman peperangan dulu. Makanan yang biasanya berbahan dasar daging sapi, lidah sapi, dan jantung sapi ini dipercaya berasal dari Padang Panjang, Sumatra Barat.\n" +
                "\n" +
                "Kemudian sate Padang ini terus mengalami perkembangan dan dikenal semakin luas karena dibawa oleh beberapa peziarah dan santri yang belajar mengaji ke salah satu wilayah yang cukup populer sebagai pusat pendidikan agama Islam di Sumatera Barat pada masa itu yaitu Pariaman.",
    ),
    Masakan(
        imgMasakan = R.drawable.satemadura,
        namaMasakan = "Sate Madura",
        daerah = "Madura",
        description = "Melansir dari buku Makanan Tradisional Indonesia Seri 1 karya Eni Harmayani dkk, penyebutan Sate Madura bukan karena sate ini diciptakan di Madura. Melainkan karena identitas penjualnya yang merupakan orang Madura.\n" +
                "\n" +
                "Sate Madura sendiri adalah sate ayam. Namun, Sate Madura memiliki perbedaan dari sate ayam lainnya, baik dari segi pengolahan bahan maupun bumbu dalam sausnya.\n" +
                "\n" +
                "Sate Madura terbuat dari potongan daging ayam mentah, lalu dibakar hanya dengan kecap saja. Lantas diberi saus kacang yang disiram di atas sate yang sudah matang.\n" +
                "\n" +
                "Sebagai pelengkapnya, bisa ditambahkan irisan bawang merah mentah atau goreng, cabai rawit, dan potongan tomat sesuai selera.\n" +
                "\n" +
                "Sementara itu, dalam buku Profil struktur, bumbu, dan bahan dalam kuliner Indonesia karangan Murdijati Gardjito dkk dijelaskan bahwa Sate Madura biasanya disajikan dengan irisan lotong.\n" +
                "\n" +
                "Selain itu, saus yang digunakan pada Sate Madura tidak selalu saus kacang. Terkadang, mereka menggantinya dengan saus kemiri.\n" +
                "\n" +
                "Jika sedang berada di Jawa Timur, Anda pun dapat dengan mudah menemukan penjual Sate Madura. Biasanya, mereka menjajakannya dengan gerobak.",
    ),
    Masakan(
        imgMasakan = R.drawable.rujakcingur,
        namaMasakan = "Rujak Cingur",
        daerah = "Surabaya",
        description = "Rujak Cingur merupakan kuliner khas Jawa Timur yang banyak ditemui di jalan-jalan Kota Surabaya. Kuliner ini bahkan bisa juga ditemui di kota lainnya, mengingat kudapan yang satu ini banyak digemari oleh masyarakat. Cingur yang dalam bahasa Jawa Timur berarti congor atau mulut sapi merupakan bahan utama dalam pembuatan rujak unik ini.\n" +
                "\n" +
                "Selain menggunakan bahan utama berupa cingur yang sudah direbus, rujak ini juga menggunakan bahan-bahan pelengkap lain seperti irisan buah-buahan tropis, seperti mentimun, kedondong, nanas, mangga, dan bengkuang. Selain buah, rujak cingur juga dilengkapi dengan potongan tahu dan tempe goreng, selain juga ditambah sayuran berupa daun kangkung dan potongan kacang panjang.",
    ),
    Masakan(
        imgMasakan = R.drawable.tahutek,
        namaMasakan = "Tahu Tek",
        daerah = "Surabaya",
        description = "Melihat sekilas, kuliner ini menjadi sajian yang begitu menggugah selera. Dengan siraman bumbu yang banyak dan lontong, tahu, serta toge kecil atau kecambah sebagai bahan utamanya, makanan ini menjadi salah satu favorit di Jawa Timur. Inilah tahu tek, salah satu kuliner yang harus Anda coba ketika berada di kawasan Surabaya.\n" +
                "\n" +
                "Tahu tek merupakan sajian yang terdiri atas tahu goreng setengah matang dan lontong yang dipotong kecil-kecil. Tambahan bahan pelengkap seperti, kentang goreng, sedikit taoge, dan irisan ketimun menjadikan nuansa rasa pada tahu tek begitu kaya. Terakhir, siraman bumbu petis menjadikan tahu tek sebuah sajian enak dan nikmat. Tambahan kerupuk udang dan sedikit bawang goreng menggugah selera makan saat tahu tek disajikan dihadapan kita.\n" +
                "\n" +
                "Ada satu hal yang menarik dari penamaan tahu tek ini. Dahulu, penjual yang menjual tahu tek ini menggunakan gunting untuk memotong bahan masakan seperti tahu dan lontong. Saat memotong inilah gunting sengaja dibunyikan terus oleh sang penjual walaupun bahan makanan telah habis dipotong dan lamban laun terdengar bunyi tek..tek..tek.. dari bunyi inilah sampai sekarang kuliner ini disebut tahu tek.",
    ),
    Masakan(
        imgMasakan = R.drawable.rendang,
        namaMasakan = "Rendang",
        daerah = "Padang",
        description = "yang berbahan dasar daging yang berasal dari Sumatra Barat, Indonesia. Masakan merupakan olahan daging (biasanya sapi atau kerbau) atau telur yang dimasak dalam suhu rendah dalam waktu lama dengan menggunakan aneka rempah-rempah dan santan. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat dan dedak. Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu. Rendang yang dimasak dalam waktu yang lebih singkat dan santannya belum mengering disebut kalio, berwarna cokelat terang keemasan.\n" +
                "\n" +
                "Rendang dapat dijumpai di Rumah Makan Padang di seluruh dunia. Masakan ini populer di Indonesia dan negara-negara Asia Tenggara lainnya, seperti Malaysia, Singapura, Brunei, Filipina, dan Thailand. Di daerah asalnya, Minangkabau, rendang disajikan di berbagai upacara adat dan perhelatan istimewa. Meskipun rendang merupakan masakan tradisional Minangkabau, teknik memasak serta pilihan dan penggunaan bumbu rendang berbeda-beda menurut daerah.\n" +
                "\n",
    ),
    Masakan(
        imgMasakan = R.drawable.nasiboran,
        namaMasakan = "Nasi Boran",
        daerah = "Lamongan",
        description = "Nasi boranan atau sego boranan, adalah makanan tradisional dan khas Lamongan, Jawa Timur.\n" +
                "\n" +
                "Kata Boranan ini berasal dari tempat Nasi (terbuat dari Anyaman Bambu) yang digendong dengan selendang pada punggung, Nasi boranan belum banyak dikenal di luar Lamongan karena memang hanya dijual di Lamongan.\n" +
                "\n" +
                "Nasi boranan, terdiri dari nasi, bumbu, lauk, rempeyek (sejenis kerupuk bahan bakunya dari tepung beras yang dibumbui dan digoreng). Bumbu dari nasi boranan terdiri dari rempah-rempah yang sudah dihaluskan, serta lauk yang ditawarkan oleh penjual bervariasi, diantaranya daging ayam, jeroan, ikan bandeng, telur dadar, telur asin, tahu, tempe hingga ikan sili yang lebih mahal bila dibandingkan dengan lauk-lauk lainnya.\n" +
                "\n" +
                "Khas nasi boranan yang tidak akan ditemui pada menu lainnya, yaitu empuk, pletuk, dan ikan sili. “Empuk ini dibuat dari tepung terigu yang dibumbui, pletuk terbuat dari nasi yang dikeringkan atau kacang, lalu dibumbui dan digoreng. Namanya diambil dari bunyi ketika makanan ini dikunyah, ‘pletuk, pletuk’. Nah, lauk ikan sili ini yang tak bisa ditemui setiap saat, karena termasuk ikan musiman. Ikan sili dulu lebih dikenal sebagai ikan hias, harganya lebih mahal dibanding daging ayam. Bentuk ikan ini panjang seperti belut, tidak kentara mana bagian kepala atau ekornya. Durinya pun hanya ada di bagian tengah\n" +
                "\n" +
                "Nasi ini disajikan biasa dijajakan secara lesehan di sekitar kawasan pasar-pasar kota di Kabupaten Lamongan.",
    ),
)