public class AdeganBersamaZombie extends Adegan {
    Zombie oZombie = new Zombie();
    //constructor
    public AdeganBersamaZombie () {

        System.out.println("Rudi Keluar Koridor dengan kesehatan : " +oPlayer.kesehatan);
        System.out.println("Kesehatan Zombie : " +oZombie.getKesehatan());
        oPlayer.isSelesai=true;
    }
}
