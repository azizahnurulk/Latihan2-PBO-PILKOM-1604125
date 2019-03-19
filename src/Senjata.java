 // Masih error
public class Senjata extends Barang {

        int Kekuatan;

        public Senjata(String id, String deskripsi, int Kekuatan) {
            this.id = id;
            this.deskripsi = deskripsi;
            this.Kekuatan = Kekuatan;
        }

        @Override
        public int getKekuatan(){
            return Kekuatan;
        }

}
