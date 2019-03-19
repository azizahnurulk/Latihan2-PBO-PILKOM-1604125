public class Zombie{
    private int kesehatan = 100;
    private int kekuatan = 20;

    public void kurangiKesehatan(int serangan){
        kesehatan -= serangan;
        if(kesehatan < 0){
            kesehatan = 0;
        }
    }

    public int getKekuatan() {
        return kekuatan;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void printKesehatan(){
        System.out.println("Kesehatan Zombie: " + kesehatan);
    }

}