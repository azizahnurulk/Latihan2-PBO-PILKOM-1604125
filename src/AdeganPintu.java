/*
    Adegan dipintu, ada state terkunci
 */

public class AdeganPintu extends  Adegan {
    boolean isTerkunci = true;
    String narasiTerkunci = "Rudi mendekati pintu. Rudi mencoba membuka pintu. \"Ah terkunci\"";
    String narasiTerbuka  = "Rudi mencoba membuka pintu dan terbuka!";

    //constructor
    public AdeganPintu () {
        narasi = narasiTerkunci;
    }

    /* user berhasil menggunakan kunci untuk membuka pintu */
    @Override
    public void gunakanBarang(Barang barangPilih) {
        super.gunakanBarang(barangPilih); //panggil parent
        isTerkunci = false;
        narasi = narasiTerbuka;

        //Pintu terbuka lalu keluar dari karidor
        Adegan  adeganKoridor = new AdeganKeluarKoridor();

        // ini bingung
        adeganKoridor.narasi = "Rudi pelan-pelan membuka pintu dan keluar dari kamar. Rudi sekarang berada di koridor " +
                "yang sangat panjang";
        Pilihan pilihanMenujuKoridor = new PilihanGantiAdegan(adeganKoridor,"Keluar kamar, ke koridor");
        tambahPilihan(pilihanMenujuKoridor);

    }

}
