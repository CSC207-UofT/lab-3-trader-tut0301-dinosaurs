public class Cow implements Domesticatable, Tradable{
    @Override
    public String sound() {
        return "M000!";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
