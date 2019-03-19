/*
    Adegan dipintu, ada state terkunci
 */
// Nomor 2
public class AdeganJendela extends  Adegan {
    boolean isTerkunci = true;
    String narasiTerkunci = "Rudi mendekati Jendela. Rudi mencoba membuka Jendela. \"Ah Terkunci!\"";
    String narasiTerbuka  = "Rudi mencoba membuka Jendela dan terbuka!";

    //constructor
    public AdeganJendela () {

        narasi = narasiTerkunci;
    }

    /* user berhasil menggunakan kunci untuk membuka Jendela */
    @Override
    public void gunakanBarang(Barang barangPilih) {
        super.gunakanBarang(barangPilih); //panggil parent
        isTerkunci = false;
        narasi = narasiTerbuka;

        //karena kunci sudah terbuka ada pilihan baru keluar dari kamar dan Adegan Zombie
        Adegan  adeganZombie = new AdeganBersamaZombie();

            // Bingung
//        Zombie oZombie = new Zombie();
//        adeganZombie.narasi = "Rudi pelan-pelan membuka Jendela dan keluar dari kamar. Rudi sekarang berada di koridor " +
//                "Apakah yang terjadi??? TERNYATA..... Zombie menyerang" +
//                "Kesehatan Zombie " + oZombie.getKesehatan();
//        adeganZombie.idBarangBisaDigunakan = "Senjata";
//        Pilihan pilihZombie = new PilihanGantiAdegan(adeganZombie,"Keluar kamar, ke koridor");
////        tambahPilihan(pilihZombie);

//        adeganKoridor.narasi = "Rudi pelan-pelan membuka Jendela dan keluar dari kamar. Rudi sekarang berada di koridor " +
//                "Apakah yang terjadi???";
//        Pilihan pilihanMenujuKoridor = new PilihanGantiAdegan(adeganKoridor,"Keluar kamar, ke koridor");
//        tambahPilihan(pilihanMenujuKoridor);
//        // Nanti ada zombie, battle dulu
    }
}
