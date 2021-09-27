public class Cow implements Domesticatable, Tradable {
  int MilkVolume;
  
  public Cow() {
    this.MilkVolume = 6
    }
  
  @Override
    public String sound() {
        return "Moo";
    }
