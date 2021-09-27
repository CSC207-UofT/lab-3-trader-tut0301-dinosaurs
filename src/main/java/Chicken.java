public class Chicken implements Domesticatable, Tradable {
    private int maxSpeed;

    public Chicken() {
        this.maxSpeed = 1;
    }

    @Override
    public String sound() {
        return
                "Bawk!"
                ;
    }

    @Override
    public int getPrice() {
        return 7;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}