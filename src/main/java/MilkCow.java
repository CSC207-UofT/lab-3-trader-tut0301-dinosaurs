public class MilkCow implements Domesticatable, Tradable {
  int MilkVolume;
  
  public MilkCow() {
    this.MilkVolume = 6
    }
  
  @Override
    public String sound() {
        return "Moo";
    }
  
  @Override
    public int getPrice() {
        return 20;
    }
}
