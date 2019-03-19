/*
    Adegan dipintu, ada state terkunci
 */

public class AdeganKeluarKoridor extends  Adegan {

    //constructor
    public AdeganKeluarKoridor () {
        System.out.println("Pintu Telah Terbuka, Rudi keluar menuju koridor. Rudi berada di luar bangunan");
        oPlayer.isSelesai=true;
    }

}
